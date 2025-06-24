class Solution {
    public String solution(String myString) {
        StringBuilder result = new StringBuilder();
        
        for(char ch : myString.toCharArray()) {
            if (ch == 'a') { //a면 A로
                result.append('A');
            } else if (Character.isUpperCase(ch) && ch != 'A') { //대문자면서 'A'는 아닐때 소문자로
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}