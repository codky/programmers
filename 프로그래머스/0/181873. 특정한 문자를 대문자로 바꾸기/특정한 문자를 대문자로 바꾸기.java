class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder result = new StringBuilder();
        
        for (char ch : my_string.toCharArray()) {
            if (ch == alp.charAt(0)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}