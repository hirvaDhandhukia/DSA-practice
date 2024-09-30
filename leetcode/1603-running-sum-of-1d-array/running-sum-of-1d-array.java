class Solution {
    public int[] runningSum(int[] nums) {
        int currSum = 0;
        for(int i=1; i<nums.length; i++) {
            int val = nums[i-1] + nums[i];
            nums[i] = val;
        }
        return nums;
    }
}