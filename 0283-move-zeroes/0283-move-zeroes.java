class Solution {
    public void moveZeroes(int[] a) {
        int n=a.length;
        int i=0;
        int j=0;
       while(i<n && n>0){
          if(a[i]!=0){
            a[j]=a[i];
            i++;
            j++;
          }
          else{
            i++;
          }
       }
       while(j<n){
         a[j]=0;
         j++;
       }
    }
}