import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class boj_18258_큐2_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        StringBuilder stringBuilder = new StringBuilder();
        Queue<String> queue = new LinkedList<>();
        String last = null;
        
        for (int i = 0; i < n; i++) {
            String[] command = bufferedReader.readLine().split(" ");
            
            if (command[0].equals("push")) {
                queue.add(command[1]);
                last = command[1];
            } else if (command[0].equals("pop")) {
                if (queue.isEmpty()) {
                    stringBuilder.append("-1\n");
                } else {
                    stringBuilder.append(queue.poll() + "\n");
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
                    stringBuilder.append(queue.peek() + "\n");
                }
            } else if (command[0].equals("back")) {
                if (queue.isEmpty()) {
                    stringBuilder.append("-1\n");
                } else {
                    stringBuilder.append(last + "\n");
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
