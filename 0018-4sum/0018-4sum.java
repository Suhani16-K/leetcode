class Solution {
    public List<List<Integer>> fourSum(int[] a, int t) {
        int n=a.length;
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(a);
        for(int i=0;i<n-3;i++){
            if(i>0 && a[i]==a[i-1]) continue; 
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && a[j]==a[j-1]) continue; 
            int k=j+1;
            int l=n-1;
            while(k<l){
                long sum=(long)a[i]+a[j]+a[k]+a[l];
                if(sum<t){
                   k++;
                }
                else if(sum>t){
                    l--;
                }
                else{
                    ans.add(Arrays.asList(a[i],a[j],a[k],a[l]));
                    k++;
                    l--;
                    while(k<l && a[k]==a[k-1]) k++;
                    while(k<l && a[l]==a[l+1]) l--;
                }
            }
        }}
        return ans;
    }
}