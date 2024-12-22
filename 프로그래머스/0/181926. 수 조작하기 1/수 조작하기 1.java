class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        for(int i=0; i<control.length(); i++) {
            char wasd = control.charAt(i);
            
            if (wasd == 'w') {
                n += 1;
            } else if(wasd == 's') {
                n -= 1;
            } else if(wasd == 'd') {
                n += 10;
            } else if(wasd == 'a') {
                n -= 10;
            }
            
        answer = n;
        }
        return answer;
    }
}