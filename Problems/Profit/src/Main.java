import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float m = scanner.nextFloat();
        float p = scanner.nextFloat();
        float k = scanner.nextFloat();
        int result = 0;
        while (m < k) {
            result++;
            m *= 1 + p / 100;
        }
        System.out.println(result);
    }
}