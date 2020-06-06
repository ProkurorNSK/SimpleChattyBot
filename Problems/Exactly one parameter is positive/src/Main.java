import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean aPositive = a > 0 && b <= 0 && c <= 0;
        boolean bPositive = b > 0 && a <= 0 && c <= 0;
        boolean cPositive = c > 0 && b <= 0 && a <= 0;
        System.out.println(aPositive || bPositive || cPositive);
    }
}