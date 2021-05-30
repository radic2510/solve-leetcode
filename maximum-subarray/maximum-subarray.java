class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];   //nums의 크기가 1이거나 첫번째 수가 가장 큰 경우를 위한 가정
        int maxsum=nums[0]; //첫번째 숫자가 가장 큰 수인걸로 가정
        
        for(int i=1; i<nums.length; i++)
        {
            sum=Math.max(nums[i],sum+nums[i]); //가능한 합
            maxsum=Math.max(maxsum,sum);       //index부터 최대값 저장
        }
        
        return maxsum;
    }
}