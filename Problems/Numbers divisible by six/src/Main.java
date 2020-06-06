import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < count; i++) {
            int a = scanner.nextInt();
            if (a % 6 == 0) {
                result += a;
            }
        }
        System.out.println(result);
    }
}