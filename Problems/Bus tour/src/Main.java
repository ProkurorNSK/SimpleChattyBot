import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int count = scanner.nextInt();
        boolean isCrash = false;
        for (int i = 0; i < count; i++) {
            int a = scanner.nextInt();
            if (h >= a) {
                System.out.println("Will crash on bridge " + (i + 1));
                isCrash = true;
                break;
            }
        }
        if (!isCrash) {
            System.out.println("Will not crash");
        }
    }
}