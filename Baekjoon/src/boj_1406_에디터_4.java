import java.io.*;
import java.util.Stack;

public class boj_1406_에디터_4 {
    public static void main(String[] args) throws IOException {
        // Scanner, BufferedReader, BufferedWriter
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> leftEditor = new Stack<>();
        Stack<Character> rightEditor = new Stack<>();
        String str = bufferedReader.readLine();

        // Input left stack
        for (int i = 0; i < str.length(); i++) {
            leftEditor.add(str.charAt(i));
        }

        int m = Integer.parseInt(bufferedReader.readLine()); // # of test cases

        for (int i = 0; i < m; i++) {
            String commands = bufferedReader.readLine();
            char command = commands.charAt(0);

            // L : move to left (leftStack > rightStack)
            if (command == 'L') {
                if (leftEditor.size() != 0) {
                    rightEditor.push(leftEditor.pop());
                }
            // D : move to right (rightStack > leftStack)
            } else if (command == 'D') {
                if (rightEditor.size() != 0) {
                    leftEditor.push(rightEditor.pop());
                }
            // B : remove front value (remove leftStack)
            } else if (command == 'B') {
                if (leftEditor.size() != 0) {
                    leftEditor.pop();
                }
            // P : add value (add leftStack)
            } else if (command == 'P') {
                leftEditor.push(commands.charAt(2));
            }
        }
        bufferedReader.close();

        for (int i = 0; i < leftEditor.size(); i++) {
            bufferedWriter.write(leftEditor.get(i));
        }

        for (int i = rightEditor.size()-1; i >= 0; i--) {
            bufferedWriter.write(rightEditor.get(i));
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
