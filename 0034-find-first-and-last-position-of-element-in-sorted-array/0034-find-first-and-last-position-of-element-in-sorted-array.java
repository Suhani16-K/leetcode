class Solution {
    public int[] searchRange(int[] a, int t) {
        int n = a.length;
        int[] ar = {-1, -1};

        int l = 0, r = n - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (a[mid] == t) {
                ar[0] = mid;
                r = mid - 1;
            } else if (a[mid] < t) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        l = 0;
        r = n - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (a[mid] == t) {
                ar[1] = mid;
                l = mid + 1;
            } else if (a[mid] < t) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return ar;
    }
}