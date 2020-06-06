import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = 0;
        int numbersOfDay = 0;
        while (true) {
            numbersOfDay++;
            x += a;
            if (x >= h) break;
            x -= b;
        }
        System.out.println(numbersOfDay);
    }
}