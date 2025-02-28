class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> a = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int complement = target - nums[i];

            if(a.containsKey(complement)) {
                return new int[]{a.get(complement), i};
            }
            a.put(nums[i], i);
        }
        return new int[]{}; 
    }
}
