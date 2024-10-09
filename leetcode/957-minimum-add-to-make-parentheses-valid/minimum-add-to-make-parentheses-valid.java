class Solution {
    public int minAddToMakeValid(String s) {
        // we have s as string. so convert it to character first
        // ( for open and ) for close
        int open =0, close=0;
        for(char ch : s.toCharArray()) {
            if (ch == '('){
                open++;
            } else if (ch == ')') {
                if(open > 0)
                    open--;
                else 
                    close++;
            }
        }

        return open + close;
    }
}