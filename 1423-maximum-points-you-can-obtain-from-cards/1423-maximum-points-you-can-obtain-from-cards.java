class Solution {
    public int maxScore(int[] a, int k) {
        int n=a.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=a[i];
        }
        int ans=sum;
        for(int i=0;i<k;i++){
            sum=sum-a[k-1-i]+a[n-1-i];
            ans=Math.max(sum,ans);
        }
        return ans;
    }
}