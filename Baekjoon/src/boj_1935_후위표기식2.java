import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class boj_1935_후위표기식2 {

    public static void main(String[] args) throws IOException {

        // Input & Variable Declaration
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        List<String> postfix = List.of(bufferedReader.readLine().split(""));
        List<Integer> numList = new ArrayList<>();
        Stack<Double> doubleStack = new Stack<>();

        // Alphabet-Number List
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(bufferedReader.readLine());
            numList.add(num);
        }

        for (int i = 0; i < postfix.size(); i++) {
            String part = postfix.get(i);
            int tmp = part.charAt(0);

            // Check Alphabet A-Z (Operands)
            if (tmp >= 65 && tmp <= 90) {
                doubleStack.push(Double.valueOf(numList.get(tmp - 65)));

            // Check Operators
            } else {
                double num2 = doubleStack.pop();
                double num1 = doubleStack.pop();

                if (part.equals("+")) {
                    doubleStack.push(num1 + num2);
                } else if (part.equals("-")) {
                    doubleStack.push(num1 - num2);
                } else if (part.equals("*")) {
                    doubleStack.push(num1 * num2);
                } else if (part.equals("/")) {
                    doubleStack.push(num1 / num2);
                }
            }
        }
        // Print Answer (Double Format)
        System.out.printf("%.2f", doubleStack.pop());
    }
}
