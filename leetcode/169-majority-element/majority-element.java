class Solution {
    public int majorityElement(int[] nums) {
        // a majority varibale & vote 
        int major = nums[0], vote = 0;

        // traversing loop and updating vote 
        for(int i=0; i<nums.length; i++) {
            if(vote == 0) {
                major = nums[i];
                vote = 1;
            }
            else {
                if(major == nums[i]) {
                    vote++;
                } else vote--;
            }
        }

        return major;
    }
}