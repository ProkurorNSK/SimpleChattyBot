import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int reese = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        System.out.println(reese >= 10 && reese <= 20 && !weekend || reese >= 15 && reese <= 25 && weekend);
    }
}