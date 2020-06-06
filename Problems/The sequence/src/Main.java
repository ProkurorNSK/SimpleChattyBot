import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < number; i++) {
            int x = scanner.nextInt();
            if (x % 4 == 0 && x > result) {
                result = x;
            }
        }
        System.out.println(result);
    }
}