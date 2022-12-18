import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class boj_1406_에디터 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // UnsupportedOperationException
        List<String> tmpList = Arrays.asList(bufferedReader.readLine().split(""));
        List<String> editor = new ArrayList<>(tmpList);

        int cursor = editor.size();
        int m = Integer.parseInt(bufferedReader.readLine());

        StringBuffer answer = new StringBuffer();

        // 1. 시간초과 (2%)
        for (int i = 0; i < m; i++) {
            String[] command = bufferedReader.readLine().split(" ");

            if (command[0].equals("L")) {
                if (cursor == 0) {
                    continue;
                }
                cursor -= 1;
            } else if (command[0].equals("D")) {
                if (cursor == editor.size()) {
                    continue;
                }
                cursor += 1;
            } else if (command[0].equals("B")) {
                if (cursor == 0) {
                    continue;
                }
                editor.remove(--cursor);
            } else if (command[0].equals("P")) {
                String lowerChar = command[1];
                editor.add(cursor++, lowerChar);
            }
        }

        for (String item : editor) {
            answer.append(item);
        }
        System.out.println(answer);
    }
}
