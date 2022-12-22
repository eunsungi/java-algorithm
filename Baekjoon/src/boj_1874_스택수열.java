import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class boj_1874_스택수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        int cur = 1;
        boolean stopFlag = false;

        List<Integer> sequence = new ArrayList<>();
        Stack stack = new Stack<>();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(bufferedReader.readLine());
            sequence.add(tmp);
        }

        for (int seq : sequence) {
            while (true) {

                if (!stack.isEmpty() && (int)stack.peek() == seq) {
                    stringBuilder.append("-\n");
                    stack.pop();
                    break;
                } else if (!stack.isEmpty() && (int)stack.peek() > seq) {
                    stopFlag = true;
                    break;
                } else {
                    stringBuilder.append("+\n");
                    stack.push(cur);
                    cur++;
                }
            }

            if (stopFlag) {
                break;
            }
        }
        if (stack.isEmpty()) {
            System.out.println(stringBuilder);
        } else {
            System.out.println("NO");
        }
    }
}
