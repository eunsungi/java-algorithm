import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class boj_10828_스택 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        List<Integer> stackList = new ArrayList<Integer>();

        while (n > 0) {
            String[] lines = bufferedReader.readLine().split(" ");
            String line = lines[0];

            // push
            if (line.equals("push")) {
                int pushNum = Integer.parseInt(lines[1]);
                stackList.add(pushNum);

            // pop
            } else if (line.equals("pop")) {
                if (stackList.size() == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stackList.get(stackList.size() - 1));
                    stackList.remove(stackList.size()-1);
                }

            // size
            } else if (line.equals("size")) {
                System.out.println(stackList.size());

            // empty
            } else if (line.equals("empty")) {
                if (stackList.size() == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }

            // top
            } else if (line.equals("top")) {
                if (stackList.size() == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stackList.get(stackList.size() - 1));
                }
            }
            n--;
        }
    }
}
