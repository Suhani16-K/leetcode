class Solution {
    public int maxScore(int[] a, int k) {
        int n=a.length;
        int sum=0; int t=0;
        for(int i=0;i<n;i++){
            t+=a[i];
        }
        for(int i=0;i<n-k;i++){
            sum+=a[i];
        }
        int min=sum;
        for(int i=n-k;i<n;i++){
            sum=sum+a[i]-a[i-(n-k)];
            min=Math.min(sum,min);
        }
        return t-min;
    }
}