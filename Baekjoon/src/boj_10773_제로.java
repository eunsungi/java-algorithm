import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj_10773_제로 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(bufferedReader.readLine());
        int stackSum = 0;
        Stack<Integer> intStack = new Stack<>();

        while (k > 0) {
            int num = Integer.parseInt(bufferedReader.readLine());

            if (num == 0) {
                intStack.pop();
            } else {
                intStack.push(num);
            }

            k--;
        }

        for (int i = 0; i < intStack.size(); i++) {
            stackSum += intStack.get(i);
        }

        System.out.println(stackSum);
    }
}
