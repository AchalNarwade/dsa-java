// https://leetcode.com/problems/angle-between-hands-of-a-clock/?envType=daily-question&envId=2026-06-18

class Solution {
    public double angleClock(int hour, int minutes) {
        hour %=12; // 12 hr format
        double angle = Math.abs(30*hour-5.5*minutes);
        return Math.min(angle,360-angle);
    }
}