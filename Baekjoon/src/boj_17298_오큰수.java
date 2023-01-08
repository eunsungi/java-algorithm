import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class boj_17298_오큰수 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        String[] sequence = bufferedReader.readLine().split(" ");
        Stack<Integer> stack = new Stack<>();

        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> answer = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {

            int seq = Integer.parseInt(sequence[i]);

            if (stack.isEmpty()) {
                answer.add(-1);
            } else {
                while (!stack.isEmpty() && stack.peek() <= seq) {
                    stack.pop();
                }

                if (!stack.isEmpty() && stack.peek() > seq) {
                    answer.add(stack.peek());
                } else {
                    answer.add(-1);
                }
            }
            stack.push(seq);
        }

        for (int i = n - 1; i >= 0; i--) {
            stringBuilder.append(answer.get(i) + " ");
        }
        System.out.println(stringBuilder);
    }
}
