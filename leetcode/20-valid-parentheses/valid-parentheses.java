class Solution {
    public char checkValue(char ch) {
        switch(ch) {
            case ']' : return '[';
            case '}' : return '{';
            case ')' : return '(';
            default : return ' ';
        }
    }

    public boolean isValid(String s) {
        String opening = "({[";
        String closing = ")}]";
        Stack<Character> st = new Stack<>();

        for(char ch: s.toCharArray()) {
            if(opening.indexOf(ch) != -1) {
                // i.e. ch has an opening bracket
                st.push(ch);
            }
            else {
                // closing bracket aia hai
                if(st.size() == 0) 
                    return false;
                char temp=st.pop();

                if(checkValue(ch)!= temp) 
                    return false;
            }
        }
        return st.size() == 0;
    }
}