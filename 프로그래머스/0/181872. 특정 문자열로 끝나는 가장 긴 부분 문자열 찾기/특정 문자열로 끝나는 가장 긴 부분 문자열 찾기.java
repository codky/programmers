class Solution {
    public String solution(String myString, String pat) {
        int lastIndex = myString.lastIndexOf(pat); // 마지막으로 등장하는 인덱스를 찾기
        return myString.substring(0, lastIndex + pat.length());
    }
}