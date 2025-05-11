class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(evenDigits(nums[i])) {
                count++;
            }
        }
        return count;
    }
    static boolean evenDigits(int num) {
        int count = 0;
        while(num > 0) {
            count++;
            num = num/10;
        }
        return count%2 == 0;
    }
}