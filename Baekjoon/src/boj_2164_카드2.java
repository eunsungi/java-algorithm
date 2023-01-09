import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class boj_2164_카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            deque.add(i + 1);
        }

        for (int i = 0; i < n-1; i++) {
            deque.removeFirst();
            deque.addLast(deque.removeFirst());
        }
        System.out.println(deque.getFirst());
    }
}
