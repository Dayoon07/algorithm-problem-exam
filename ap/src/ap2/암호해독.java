package ap2;

public class 암호해독 {

    public String solution(String cipher, int code) {
        String answer = "";
        for (int i = 0; i < cipher.length(); i++) {
            if ((i + 1) % code == 0) {
                answer += cipher.charAt(i);
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        System.out.println(new 암호해독().solution("dfjardstddetckdaccccdegk", 4));        
        System.out.println(new 암호해독().solution("pfqallllabwaoclk", 2));        
    }

}
