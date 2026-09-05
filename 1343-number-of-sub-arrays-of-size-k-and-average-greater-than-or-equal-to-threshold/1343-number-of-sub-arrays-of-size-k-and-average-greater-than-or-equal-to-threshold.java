class Solution {
    public int numOfSubarrays(int[] a, int k, int t) {
        int n=a.length;
        int sum=0;
        int c=0;
        for(int i=0;i<k;i++){
            sum+=a[i];
        }
        for(int i=k;i<n;i++){
            double avg=(double) sum/k;
            if((double) sum / k >= t) c++;
            sum=sum-a[i-k]+a[i];
        }
        if((double) sum / k >= t) c++;
        return c;
    }
}