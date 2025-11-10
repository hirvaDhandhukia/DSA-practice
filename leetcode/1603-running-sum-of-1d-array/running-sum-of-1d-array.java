import java.util.ArrayList;

class Solution {
    public int[] runningSum(int[] nums) {
        // ArrayList<Integer> arr = new ArrayList<>();
        // int curr_sum = nums[1];
        // for(int i=1; i<=nums.length; i++) {
        //     curr_sum = (i*(i+1))/2;
        //     arr.add(curr_sum);
        // }
        // return arr.stream().mapToInt(Integer::intValue).toArray();

        for(int i=1; i<nums.length; i++) {
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}