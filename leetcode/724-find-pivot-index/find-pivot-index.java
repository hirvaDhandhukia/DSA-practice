class Solution {
    public int pivotIndex(int[] nums) {
        int suml = 0, sumr;
        int totalsum = 0;
        for(int i=0; i<nums.length; i++) {
            totalsum += nums[i];
        }
        for(int i=0; i<nums.length; i++) {
            sumr = totalsum - suml - nums[i];
            if(suml == sumr) {
                return i;
            }
            suml += nums[i];
        }
        return -1;
    }
}