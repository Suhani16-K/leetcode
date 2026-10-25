class Solution {
    public int searchInsert(int[] a, int t) {
        int n=a.length;
        int l=0;
        int r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(a[mid]==t){
                return mid;
            }
            else if(a[mid]<t){
                    l=mid+1;
            }
            else{
                    r=mid-1;
            }
        }
       return l;
    }
}