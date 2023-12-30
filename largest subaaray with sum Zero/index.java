class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> memo= new HashMap<>();
        int prefixsum = 0;
        int ans = 0;
        for(int i=0;i<n;i++){
            prefixsum = prefixsum +arr[i];
            if(prefixsum==0){
                ans=i+1;
            }
            if(memo.containsKey(prefixsum)){
                ans=Math.max(ans,i-memo.get(prefixsum));
                
            }
            else{
                memo.put(prefixsum,i);
            }
        }
        return ans;
    }
}
