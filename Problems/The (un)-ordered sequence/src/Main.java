import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int past = scanner.nextInt();
        boolean isAscending = true;
        boolean isDescending = true;
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if (x == 0) {
                break;
            } else if (x >= past) {
                isDescending = false;
            } else {
                isAscending = false;
            }
            past = x;
        }
        System.out.println(isAscending || isDescending);
    }
}