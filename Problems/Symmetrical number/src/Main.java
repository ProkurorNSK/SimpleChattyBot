import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int copy = number;

        int a = copy % 10;
        copy /= 10;
        int b = copy % 10;
        copy /= 10;
        int c = copy % 10;
        copy /= 10;
        int d = copy % 10;
        copy /= 10;

        int newNumber = 1000 * a + 100 * b + 10 * c + d;
        if (number == newNumber) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}