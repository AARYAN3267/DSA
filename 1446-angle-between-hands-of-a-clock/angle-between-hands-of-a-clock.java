class Solution {
    public double angleClock(int hour, int minutes) {
    double hourMovement= 30.0*(hour%12)+ 0.5*minutes;
    double minMovement= 6*minutes;    
    double diff= Math.abs(hourMovement- minMovement);
    return Math.min(diff, 360-diff);
    }
}