import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        int result = 1;
        long factorial = 1;
        while (factorial <= number) {
            result++;
            factorial *= result;
        }
        System.out.println(result);
    }
}