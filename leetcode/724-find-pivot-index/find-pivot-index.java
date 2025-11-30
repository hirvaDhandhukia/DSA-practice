class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int n : nums) total += n; 

        int leftsum = 0;

        for(int i=0; i<nums.length; i++) {
            // go through each item in a loop & calculate individual right sum
            int rightsum = total - leftsum - nums[i];
            
            // checking pivot index criteria
            if(leftsum == rightsum) return i;

            // update new leftsyum for the next loop
            leftsum = leftsum + nums[i];
        }
        return -1;
    }
}