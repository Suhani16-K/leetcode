class Solution {
    public int search(int[] a, int t) {
        int n=a.length;
        int ans=-1;
        for(int i=0;i<n;i++){
            if(a[i]==t){
                ans=i;
            }
        }
        return ans;
    }
}