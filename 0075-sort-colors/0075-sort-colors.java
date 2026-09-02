class Solution {
    public void sortColors(int[] a) {
        int n=a.length;
        int s=0;
        int m=0;
        int l=n-1;
        while(m<=l){
            if(a[m]==0){
                int temp=a[m];
                a[m]=a[s];
                a[s]=temp;
                s++;
                m++;
            }
            else if(a[m]==1){
                m++;
            }
            else{
                int temp=a[l];
                a[l]=a[m];
                a[m]=temp;
                l--;
            }
        }
    }
}