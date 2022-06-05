import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ10828 {

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int times = Integer.parseInt(br.readLine());

        for (int i = 0; i < times; i++) {
            String cmd = br.readLine();
            String[] input = cmd.split(" ");

            if (input[0].equals("push")) {
                int num = Integer.parseInt(input[1]);
                stack.push(num);
            } else if (input[0].equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.pop());
                }
            } else if (input[0].equals("size")) {
                System.out.println(stack.size());
            } else if (input[0].equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (input[0].equals("top")) {
                if (stack.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.peek());
                }
            }
        }
    }
}
