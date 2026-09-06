class Solution {
    public int maxScore(int[] c, int k) {
        int n=c.length;
        int s=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=c[i];  
        }
        int ans=sum; 
        for(int i=0;i<k;i++){
             sum-=c[k-1-i];
             sum+=c[n-1-i];
        ans=Math.max(ans,sum);
        }
        return ans;
    }
}