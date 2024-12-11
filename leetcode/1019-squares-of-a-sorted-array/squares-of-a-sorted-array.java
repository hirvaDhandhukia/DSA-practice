class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] ans = new int[nums.length];

        // square
        for(int i=0; i< nums.length; i++) {
            nums[i] = nums[i]*nums[i];
        }

        // putting the greatest integer at the end 
        int head=0, tail=nums.length-1;
        for(int i=nums.length -1; i >=0; i--) {
            if(nums[head] > nums[tail]) {
                ans[i] = nums[head];
                head++; 
            } else {
                ans[i] = nums[tail];
                tail--;
            }
        }

        return ans;
    }
}