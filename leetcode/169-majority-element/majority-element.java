class Solution {
    public int majorityElement(int[] nums) {
    // Boyer-moore voting algorithm
        int ans = nums[0], vote = 1;
        for(int i=0; i< nums.length; i++) {
            if(vote == 0) {
                ans = nums[i];
                vote++;
            } else if (ans == nums[i]) {
                vote++;
            } else {
                vote--; 
                if (vote == 0) {
                    ans = nums[i];
                    vote = 1;
                }
            }
        }
        return ans; 
    }
}