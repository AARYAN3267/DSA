import java.util.*;

class Solution {
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length;
        int n = classroom[0].length();
        
        int startX = -1, startY = -1;
        List<int[]> litters = new ArrayList<>();
        
        // Locate 'S' and assign indices to each 'L'
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                char ch = classroom[r].charAt(c);
                if (ch == 'S') {
                    startX = r;
                    startY = c;
                } else if (ch == 'L') {
                    litters.add(new int[]{r, c});
                }
            }
        }
        
        int litterCount = litters.size();
        if (litterCount == 0) {
            return 0; // No litter to collect
        }
        
        int fullMask = (1 << litterCount) - 1;
        
        // Map litter cell locations to their bit position in mask
        int[][] litterMap = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(litterMap[i], -1);
        }
        for (int i = 0; i < litterCount; i++) {
            litterMap[litters.get(i)[0]][litters.get(i)[1]] = i;
        }
        
        // maxEnergy[r][c][mask] stores the maximum remaining energy seen for state (r, c, mask)
        int[][][] maxEnergy = new int[m][n][1 << litterCount];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(maxEnergy[i][j], -1);
            }
        }
        
        // BFS Queue: {r, c, mask, currentEnergy}
        Queue<int[]> queue = new LinkedList<>();
        
        // Initial state at 'S'
        // If starting position 'S' happens to be a reset area or litter (though usually distinct)
        int initialMask = 0;
        if (litterMap[startX][startY] != -1) {
            initialMask |= (1 << litterMap[startX][startY]);
        }
        
        queue.offer(new int[]{startX, startY, initialMask, energy});
        maxEnergy[startX][startY][initialMask] = energy;
        
        int moves = 0;
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];
                int mask = curr[2];
                int e = curr[3];
                
                // If all litters collected
                if (mask == fullMask) {
                    return moves;
                }
                
                // If out of energy and not on a reset square, cannot make further moves
                if (e == 0) {
                    continue;
                }
                
                for (int[] d : dirs) {
                    int nr = r + d[0];
                    int nc = c + d[1];
                    
                    // Check bounds and obstacles
                    if (nr < 0 || nr >= m || nc < 0 || nc >= n || classroom[nr].charAt(nc) == 'X') {
                        continue;
                    }
                    
                    int nextEnergy = e - 1;
                    char cell = classroom[nr].charAt(nc);
                    
                    // Reset area restores energy to full capacity
                    if (cell == 'R') {
                        nextEnergy = energy;
                    }
                    
                    // Collect litter if present
                    int nextMask = mask;
                    if (litterMap[nr][nc] != -1) {
                        nextMask |= (1 << litterMap[nr][nc]);
                    }
                    
                    // Pruning: Only proceed if this state reaches cell with strictly higher energy
                    if (nextEnergy > maxEnergy[nr][nc][nextMask]) {
                        maxEnergy[nr][nc][nextMask] = nextEnergy;
                        queue.offer(new int[]{nr, nc, nextMask, nextEnergy});
                    }
                }
            }
            moves++;
        }
        
        return -1;
    }
}