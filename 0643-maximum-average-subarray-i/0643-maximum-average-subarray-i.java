class Solution {
    public double findMaxAverage(int[] a, int k) {
        int n=a.length;
        int sum=0;  
        for(int i=0;i<k;i++){
            sum+=a[i];
        }
        double ans = (double) sum / k;
        for(int i=k;i<n;i++){
            sum=sum-a[i-k]+a[i];
            double avg=(double)sum/k;
            ans=Math.max(avg,ans);
         }
       return ans ;
    }
}