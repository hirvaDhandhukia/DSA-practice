class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        // if number required == 0
        if(numRows == 0) return ans;

        // universal 1st row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        ans.add(firstRow);
        if(numRows == 1) return ans;

        // iterating through loop to get previous row values
        for(int i=1; i<numRows; i++) {
            List<Integer> prevRow = ans.get(i-1);

            // new row adding
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=0; j<i-1; j++) {
                row.add(prevRow.get(j) + prevRow.get(j+1));
            }
            row.add(1);

            // final result updating
            ans.add(row);
        }
        return ans;
    }
}