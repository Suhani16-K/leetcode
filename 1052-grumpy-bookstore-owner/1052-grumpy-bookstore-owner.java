class Solution {
    public int maxSatisfied(int[] c, int[] g, int m) {
        int n=c.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(g[i]==0) count+=c[i];
        }
        int sum=0;
        for(int i=0;i<m;i++){
            if(g[i]==1)
           sum+=c[i];
        }
        int ans=sum;
        for(int i=m;i<n;i++){
            if(g[i]==1) sum+=c[i];
            if(g[i-m]==1) sum-=c[i-m];
             ans=Math.max(sum,ans);
        }
        count+=ans;
        return count;
    }
}