class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentMax = nums[0];

        for(int i=1; i<nums.length; i++) {
            currentMax = Math.max(nums[i], nums[i]+currentMax);
            maxSum = Math.max(currentMax, maxSum);
        }

        return maxSum;
    }
}