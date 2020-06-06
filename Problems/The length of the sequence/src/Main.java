import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string;
        int sum = 0;
        do {
            string = sc.nextLine();
            sum++;
        } while (!string.equals("0"));
        System.out.println(sum - 1);
    }
}