class Solution {
    public int missingNumber(int[] a) {
        int n=a.length;
        for(int i=0;i<a.length;i++){
             n=n^i;
             n=n^a[i];
        }
        return n;
    }
}