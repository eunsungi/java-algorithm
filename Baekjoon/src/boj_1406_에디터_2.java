import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1406_에디터_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String editor = bufferedReader.readLine();
        int cursor = editor.length();
        int m = Integer.parseInt(bufferedReader.readLine());

        // 2. 시간초과 (5%)
        for (int i = 0; i < m; i++) {
            String commands = bufferedReader.readLine();
            char command = commands.charAt(0);

            if (command == 'L') {
                if (cursor == 0) {
                    continue;
                }
                cursor--;
            } else if (command == 'D') {
                if (cursor == editor.length()) {
                    continue;
                }
                cursor++;
            } else if (command == 'B') {
                if (cursor == 0) {
                    continue;
                }
                editor = editor.substring(0, cursor - 1) + editor.substring(cursor);
                cursor--;
            } else if (command == 'P') {
                String lowerChar = String.valueOf((commands.charAt(2)));
                editor = editor.substring(0, cursor) + lowerChar + editor.substring(cursor);
                cursor++;
            }
        }
        System.out.println(editor);
    }
}
