class Solution {
    public void moveZeroes(int[] nums) {
        int position = 0;
        for(int i=0; i< nums.length; i++) {
            if(nums[i] != 0 ) {
                nums[position++] = nums[i];
            }
        }
        for(int i=position; i<nums.length; i++) {
            nums[i] = 0;
        }
    }
}