import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class boj_10866_덱 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        Deque<String> deque = new ArrayDeque<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String[] commands = bufferedReader.readLine().split(" ");
            String command = commands[0];

            if (command.equals("push_front")) {
                deque.addFirst(commands[1]);
            } else if (command.equals("push_back")) {
                deque.addLast(commands[1]);
            } else if (command.equals("pop_front")) {
                if (deque.isEmpty()) {
                    stringBuilder.append("-1\n");
                } else {
                    stringBuilder.append(deque.removeFirst() + "\n");
                }
            } else if (command.equals("pop_back")) {
                if (deque.isEmpty()) {
                    stringBuilder.append("-1\n");
                } else {
                    stringBuilder.append(deque.removeLast() + "\n");
                }
            } else if (command.equals("size")) {
                stringBuilder.append(deque.size() + "\n");
            } else if (command.equals("empty")) {
                if (deque.isEmpty()) {
                    stringBuilder.append("1\n");
                } else {
                    stringBuilder.append("0\n");
                }
            } else if (command.equals("front")) {
                if (deque.isEmpty()) {
                    stringBuilder.append("-1\n");
                } else {
                    stringBuilder.append(deque.getFirst() + "\n");
                }
            } else if (command.equals("back")) {
                if (deque.isEmpty()) {
                    stringBuilder.append("-1\n");
                } else {
                    stringBuilder.append(deque.getLast() + "\n");
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
