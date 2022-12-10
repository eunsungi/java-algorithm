import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj_9012_괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuffer sb = new StringBuffer();

        while (n > 0)
        {
            String ps = bufferedReader.readLine();
            String[] stringList = ps.split("");
            Stack<String> stack = new Stack<>();
            boolean checkFlag = false;

            for (String s : stringList) {
                if (s.equals("(")) {
                    stack.add("(");
                } else if (s.equals(")")) {
                    if (stack.isEmpty() || stack.peek().equals(")")) {
                        //System.out.println("NO");
                        sb.append("NO\n");
                        checkFlag = true;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (!checkFlag) {
                if (stack.isEmpty()) {
                    //System.out.println("YES");
                    sb.append("YES\n");
                } else {
                    //System.out.println("NO");
                    sb.append("NO\n");
                }
            }
            n--;
        }
        System.out.println(sb);

    }
}

