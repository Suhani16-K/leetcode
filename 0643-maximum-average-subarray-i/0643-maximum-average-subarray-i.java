class Solution {
    public double findMaxAverage(int[] a, int k) {
        int n=a.length;
        int sum=0;
        for(int i=0;i<k;i++){
             sum+=a[i];
        }
        double s=(double)sum/k;
        for(int i=k;i<n;i++){
            sum=sum+a[i]-a[i-k];
           double avg=(double)sum/k;
            s=Math.max(s,avg);
        }
        return s;
    }
}