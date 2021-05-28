class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        // O(n)으로, division 없이 풀어라..
        // 자기 자신을 제외하고 곱할 수 있는 방법
        // -> 단방향 + 단방향으로, for문 두번으로 해결하자
        
        int numsLen = nums.length;
        int[] result = new int[numsLen];
        
        // 1부터 자기자신의 값을 곱해서 result[index+1]에 넣기를 반복
        int product = 1;
        
        for(int i=0; i<numsLen; i++) {
            result[i] = product;
            product *= nums[i];
        }
        
        // 위의 과정을 반대로 진행하면.. 결국 자기 자신을 제외한 곱을 획득
        product = 1;
        
        for(int i=numsLen-1; i>=0; i--) {
            result[i] *= product;
            product *= nums[i];
        }
        
        return result;        
    }
}