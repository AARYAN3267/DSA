class Solution:
    def braceExpansionII(self, expression: str) -> list[str]:
        # Stack maintains a sequence of sets representing expressions at different operator levels.
        # stack stores pairs/groups representing operations:
        # We can evaluate using stack containing sets and operators (union ',', product '*').

        stack = []
        # Current group of terms being combined via union ','
        res = set()
        # Current term being built via concatenation/multiplication
        cur = {""}

        for i, char in enumerate(expression):
            if char.isalpha():
                # Concatenate current character to all words in cur
                cur = {word + char for word in cur}

            elif char == '{':
                # Save current evaluation context onto the stack
                stack.append(res)
                stack.append(cur)
                # Reset for the inner group
                res = set()
                cur = {""}

            elif char == ',':
                # Comma denotes union: fold current concatenation into current union group
                res |= cur
                cur = {""}

            elif char == '}':
                # Fold last segment before '}' into res
                res |= cur

                # Pop previous context
                prev_cur = stack.pop()
                prev_res = stack.pop()

                # Multiply/concatenate previous current term with the expanded braced set
                cur = {p + s for p in prev_cur for s in res}
                res = prev_res

        # Combine any remaining union terms
        res |= cur
        return sorted(list(res))