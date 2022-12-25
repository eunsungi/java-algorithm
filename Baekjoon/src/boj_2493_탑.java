import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj_2493_탑 {

    static class Top {
        public int idx;
        public int height;

        public Top(int idx, int height) {
            this.idx = idx;
            this.height = height;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] tops = bufferedReader.readLine().split(" "); // String.Tokenizer
        StringBuilder stringBuilder = new StringBuilder();

        Stack<Top> stack = new Stack<>();
        stack.push(new Top(0, Integer.parseInt(tops[0])));
        stringBuilder.append("0 ");

        for (int i = 1; i < tops.length; i++) {
            int height = Integer.parseInt(tops[i]);
            int beforeHeight = 0;

            while (!stack.isEmpty()) {
                beforeHeight = stack.peek().height;

                if (beforeHeight <= height) {
                    stack.pop();
                } else {
                    int idx = stack.peek().idx + 1;
                    stringBuilder.append(idx + " ");
                    break;
                }
            }

            if (stack.isEmpty()) {
                stringBuilder.append("0 ");
            }
            stack.push(new Top(i, height));
        }
        System.out.println(stringBuilder);
    }
}
