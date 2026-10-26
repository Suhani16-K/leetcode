class Solution {
    public int findMin(int[] a) {
      int n=a.length;
      int ans=Integer.MAX_VALUE;
      for(int i=0;i<n;i++){
        ans=Math.min(ans,a[i]);
      }
      return ans;
    }
}