import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = scanner.nextInt();
        int count = 0;
        int number = 1;
        int countNumber = 0;
        while (count < goal) {
            if (countNumber == number) {
                number++;
                countNumber = 0;
            }
            System.out.println(number + " ");
            count++;
            countNumber++;
        }
    }
}