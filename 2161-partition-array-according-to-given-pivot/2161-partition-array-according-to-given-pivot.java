class Solution {
    public int[] pivotArray(int[] a, int p) {
        int n=a.length;
        int i=0;
        int[] sm=new int[n];
        int nos=0;
        int noe=0;
        for(i=0;i<n;i++){
           if(a[i]<p) nos++;
           else if(a[i]==p) noe++;
        }
        int l=noe+nos;
         i=0;
         int s=0;
         int m=nos;
        while(i<n){
            if(a[i]<p && s<nos){
                sm[s]=a[i];
                s++; i++;
            }
            else if(a[i]>p && l<n){
                sm[l]=a[i];
                l++; i++;
            }
            else if(a[i]==p && m<l){
                sm[m]=a[i];
                m++; i++;
            }
        }
        return sm;
    }
}