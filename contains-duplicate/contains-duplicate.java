class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Map<Integer, Boolean> numsMap = new HashMap<Integer, Boolean>();
        
        int numsLen = nums.length;
        
        for(int i=0; i<numsLen; i++) {
            if(numsMap.get(nums[i]) == null) {
                numsMap.put(nums[i], true);
            } else {
                return true;
            }
        }
        
        return false;
        
    }
}