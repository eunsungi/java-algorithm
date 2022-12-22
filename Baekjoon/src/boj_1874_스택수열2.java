import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj_1874_스택수열2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        Stack stack = new Stack<>();
        StringBuilder answer = new StringBuilder();

        int cur = 1;
        boolean stopFlag = false;

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(bufferedReader.readLine());

            while (target >= cur) {
                stack.push(cur);
                cur++;
                answer.append("+\n");
            }

            if (target == (int) stack.peek()) {
                stack.pop();
                answer.append("-\n");
            } else {
                stopFlag = true;
                break;
            }
        }

        if (stopFlag) {
            System.out.println("NO");
        } else {
            System.out.println(answer);
        }
    }
}
