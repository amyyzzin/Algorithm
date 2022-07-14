import java.util.*;

public class BOJ1535 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int friend = sc.nextInt();

        int [] hearth = new int[friend];
        for (int i = 0; i < friend; i++) {
            hearth[i] = sc.nextInt();
        }

        int [] happiness = new int[friend];
        for (int i = 0; i < friend; i++) {
            happiness[i] = sc.nextInt();
        }

        int [] arr = new int[100+1];

        for (int i = 0; i < hearth.length; i++) {
            for (int j = 100; j > hearth[i]; j--) {
                arr[j] = Math.max(arr[j], arr[j-hearth[i]] + happiness[i]);
            }
        }
        System.out.println(arr[100]);
    }
}