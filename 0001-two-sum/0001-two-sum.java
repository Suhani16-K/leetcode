class Solution {
    public int[] twoSum(int[] a, int t) {
        int n=a.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            if(h.containsKey(t-a[i])){
                return new int[]{h.get(t-a[i]),i};
            }
            h.put(a[i],i);
        }
        return new int[]{};
    }
}