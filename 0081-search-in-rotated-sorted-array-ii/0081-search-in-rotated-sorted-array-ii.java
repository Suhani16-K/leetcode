class Solution {
    public boolean search(int[] a, int t) {
        int n=a.length;
        int l=0;int r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(t==a[mid]) return true;
            else if(a[l]==a[mid] && a[mid]==a[r]){
                l++; r--;
            }
            else if(a[mid]>=a[l]){
                if(a[l] <= t && t < a[mid]){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(a[mid] < t && t <= a[r]){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
        }
        return false;
    }
}