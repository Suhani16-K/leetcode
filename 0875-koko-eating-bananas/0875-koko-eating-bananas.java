 class Solution {
    public int minEatingSpeed(int[] a, int h) {
        int l = 1;
        int r = 0;
        for (int x : a) {
            r = Math.max(r, x);
        }
        int ans = r;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long hours = 0;
            for (int x : a) {
                hours += (x + (long) mid - 1) / mid;
            }
            if (hours <= h) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}