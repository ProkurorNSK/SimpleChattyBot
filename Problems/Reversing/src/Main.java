import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a1 = number % 10;
        number /= 10;
        int a2 = number % 10;
        number /= 10;
        int a3 = number % 10;

        System.out.println(a1 * 100 + a2 * 10 + a3);
    }
}