import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj_10799_쇠막대기_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String metalStick = bufferedReader.readLine();
        Stack stack = new Stack();

        int answer = 0;
        char beforeBracket = '0';

        for (int i = 0; i < metalStick.length(); i++) {
            char bracket = metalStick.charAt(i);

            if (bracket == '(') {
                stack.push(bracket);
            } else if (bracket == ')') {
                stack.pop();

                if (beforeBracket == '(') {
                    answer += stack.size();
                } else if (beforeBracket == ')') {
                    answer += 1;
                }
            }
            beforeBracket = bracket;
        }
        System.out.println(answer);
    }
}
