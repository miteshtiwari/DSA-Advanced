class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> memo = new HashMap<>();
        ArrayList<Integer> set = new ArrayList<>();
        for(int curr:nums1)
        {
            if(!memo.containsKey(curr)){
                memo.put(curr,1);
            }
            memo.put(curr,memo.get(curr)+1);
        }
        for(int i=0;i<nums2.length;i++){
            int curr = nums2[i];
            if(memo.containsKey(curr)){
                set.add(curr);
                memo.remove(curr);
            }
        }
        int [] arr = new int[set.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=set.get(i);
        }
        return arr;


    }
}
