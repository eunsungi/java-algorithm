import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class boj_18258_큐2 {
    public static void main(String[] args) throws IOException {
        // 1. 22% 시간초과
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> queue = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] command = bufferedReader.readLine().split(" ");

            if (command[0].equals("push")) {
                queue.add(Integer.parseInt(command[1]));
            } else if (command[0].equals("pop")) {
                if (queue.isEmpty()) {
                    stringBuilder.append("-1\n");
                } else {
                    stringBuilder.append(queue.get(0) + "\n");
                    queue.remove(0);
                }
            } else if (command[0].equals("size")) {
                stringBuilder.append(queue.size() + "\n");
            } else if (command[0].equals("empty")) {
                if (queue.isEmpty()) {
                    stringBuilder.append("1\n");
                } else {
                    stringBuilder.append("0\n");
                }
            } else if (command[0].equals("front")) {
                if (queue.isEmpty()) {
                    stringBuilder.append("-1\n");
                } else {
                    stringBuilder.append(queue.get(0) + "\n");
                }
            } else if (command[0].equals("back")) {
                if (queue.isEmpty()) {
                    stringBuilder.append("-1\n");
                } else {
                    stringBuilder.append(queue.get(queue.size()-1) + "\n");
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
