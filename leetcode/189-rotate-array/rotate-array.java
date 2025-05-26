class Solution {
    public void rotate(int[] nums, int k) {
        // using an extra space
        // k = k % nums.length;
        // while(k>0) {
        //     int x = nums [nums.length-1]; 
        //     for(int i=nums.length-1; i>0; i--) {
        //         nums[i] = nums[i-1];
        //     }
        //     nums[0] = x;
        //     k--;
        // }


        // reverse entire array, then 1st half followed by 2nd half 
        int n = nums.length;
        k = k % n-1;

        reverse(nums, 0, n-1);
        reverse(nums, 0, k);
        reverse(nums, k+1, n-1);
    }

    public void reverse(int[] nums, int start, int end) {
        while(start<end) {
            int temp = nums[start];
            nums[start] = nums[end]; 
            nums[end] = temp; 

            start++; end--;
        }
    }
}