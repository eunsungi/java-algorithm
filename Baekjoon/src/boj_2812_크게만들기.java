import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj_2812_크게만들기 {
    public static void main(String[] args) throws IOException {

        // 75% 틀렸습니다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bufferedReader.readLine().split(" ");
        String nums = bufferedReader.readLine();

        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        Stack<Integer> leftStack = new Stack<>();
        leftStack.push(nums.charAt(0) - '0');

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < n; i++) {
            int num = nums.charAt(i)-'0';

            while (k > 0 && !leftStack.isEmpty() && leftStack.peek() < num) {
                leftStack.pop();
                k--;
            }
            leftStack.push(num);
        }

        while (k > 0) {
            leftStack.pop();
            k--;
        }

        for (int anw : leftStack) {
            stringBuilder.append(anw);
        }
        System.out.println(stringBuilder);
    }
}
