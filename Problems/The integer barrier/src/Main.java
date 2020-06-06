import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean isBarrier = false;
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            if (a == 0) {
                break;
            }
            sum += a;
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                isBarrier = true;
                break;
            }
        }
        if (!isBarrier) {
            System.out.println(sum);
        }
    }
}