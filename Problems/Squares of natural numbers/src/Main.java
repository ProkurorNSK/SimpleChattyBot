import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int x = 1;
        while (x * x <= number) {
            System.out.println(x * x);
            x++;
        }
    }
}