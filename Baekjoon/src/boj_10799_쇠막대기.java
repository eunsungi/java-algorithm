import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10799_쇠막대기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String metalStick = bufferedReader.readLine();
        int stick = 0;
        int answer = 0;
        char beforeBracket = '0';

        for (int i = 0; i < metalStick.length(); i++) {
            char bracket = metalStick.charAt(i);

            if (bracket == '(') stick++;
            else if (bracket == ')') {
                stick--;

                if (beforeBracket == '(') answer += stick;
                else if (beforeBracket == ')') answer += 1;
            }
            beforeBracket = bracket;
        }
        System.out.println(answer);
    }
}
