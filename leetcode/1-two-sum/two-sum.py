class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        ans = {}
        for i in range(len(nums)):
            difference = target - nums[i]
            if difference in ans: 
                return [ans[difference], i]
            ans[nums[i]] = i
        return []