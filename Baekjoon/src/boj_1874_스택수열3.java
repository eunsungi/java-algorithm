import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class boj_1874_스택수열3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        Stack stack = new Stack<>();
        StringBuilder answer = new StringBuilder();
        List<Integer> sequence = new ArrayList<>();
        int cur = 0;

        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(bufferedReader.readLine());
            sequence.add(tmp);
        }

        for (int i = 1; i <= n; i++) {
            stack.push(i);
            answer.append("+\n");

            while (!stack.isEmpty() && (int) stack.peek() == sequence.get(cur)) {
                stack.pop();
                answer.append("-\n");
                cur++;
            }
        }

        if (stack.isEmpty()) {
            System.out.println(answer);
        } else {
            System.out.println("NO");
        }
    }
}
