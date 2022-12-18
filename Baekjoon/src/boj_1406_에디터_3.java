import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1406_에디터_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder editor = new StringBuilder(bufferedReader.readLine());
        int cursor = editor.length();
        int m = Integer.parseInt(bufferedReader.readLine());

        // 1. 런타임 에러 (StringIndexOutBounds)
        // 2. 시간 초과 (58%)
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
                editor.deleteCharAt(--cursor);
            } else if (command == 'P') {
                editor.insert(cursor++, commands.charAt(2));
            }
        }
        System.out.println(editor);
    }
}
