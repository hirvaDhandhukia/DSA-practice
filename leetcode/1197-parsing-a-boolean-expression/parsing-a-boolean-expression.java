class Solution { 
    public boolean parseBoolExpr(String expression) {
        Stack<Character> st = new Stack<>();

        // to iterate our expression
        for(int i=0; i<expression.length(); i++) {
            char ch = expression.charAt(i);

            // char is a closing bracket (i.e. now we evaluate the bracket data & operator)
            if(ch==')') {
                ArrayList<Character> list = new ArrayList<>();
                while(st.peek() != '(') {
                    list.add(st.pop());
                }
                st.pop(); 
                char operator = st.pop();
                char ans = calculate(list, operator);
                st.push(ans);
            } else {
                if(ch != ',') {
                    st.push(ch);
                }
            }
        }
        return st.peek() == 't'; 
    }
    public char calculate(ArrayList<Character> list, char operator) {
        // solve with '&' operator
        if(operator == '&') {
            if(find(list, 'f')) {
                return 'f';
            } else {
                return 't';
            }
        } else if(operator == '|') { // solve with '|' operatror
            if(find(list, 't')) {
                return 't';
            } else {
                return 'f';
            }
        } else { // not (!) operator
            return (list.get(0) == 't'? 'f': 't');
        }
    }
    public boolean find(ArrayList<Character> list, char ans) {
        // iterating through list of characters
        for(char ch : list) {
            if(ch == ans) {
                return true; 
            }
        }
        // fix boolean return value
        return false;
    }
}