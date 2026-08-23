class Solution {
    public int[] twoSum(int[] a, int t) {
         int n=a.length;
         int[] ans = new int[2];
         for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                 if(a[i]+a[j]==t){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                 }
            }
         }
         return ans;
    }
}