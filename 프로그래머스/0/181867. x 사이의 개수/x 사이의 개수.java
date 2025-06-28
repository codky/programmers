class Solution {
    public int[] solution(String myString) {
        
        String[] part = myString.split("x", -1);
        int[] lengths = new int[part.length];
        
        for(int i = 0; i < part.length; i++) {
            lengths[i] = part[i].length();
        }
        return lengths;
    }
}