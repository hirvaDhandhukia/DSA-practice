class Solution {
    public int[][] merge(int[][] intervals) {
        
        // covering edge cases
        if(intervals.length <= 1) {
            return intervals;
        }

        // only using starting points of each interval to sort the array
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        // loading list wth intervals 
        List<int[]> ans = new ArrayList<>();
        // each interval is an array in itself so i gave int[]
        int[] newInterval = intervals[0];
        ans.add(newInterval);

        // 'intervals' is 2D array. int[] i is iterated through 'intervals' using for-each
        for(int[] i : intervals) {
            if(i[0] <= newInterval[1]){
                // intervals are overlapping, i.e. updating the end 
                newInterval[1] = Math.max(i[1], newInterval[1]);
            } else {
                // break interval and add newInterval to list
                newInterval = i;
                ans.add(newInterval);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}