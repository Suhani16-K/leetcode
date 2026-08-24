class Solution {
    public int repeatedNTimes(int[] a) {
        int n=a.length;
        int ans =0;
        Arrays.sort(a);
        for(int i=1;i<n;i++){
            if(a[i]==a[i-1]){
                ans=a[i-1];
            }
        }
        return ans ;
    }
}