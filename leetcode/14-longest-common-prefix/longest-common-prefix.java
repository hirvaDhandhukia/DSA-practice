class Solution {
    public String longestCommonPrefix(String[] strs) {
        // taking the 1st string as ans initially and eliminate unmatched letters from 2nd string in the array

        if(strs.length == 0) 
            return "";
        
        // prefix = "flower";
        // ["flower","flow","flight"]
        String prefix = strs[0];
        for(int i=1; i<strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}