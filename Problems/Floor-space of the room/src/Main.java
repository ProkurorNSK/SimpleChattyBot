import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        switch (s) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double p = (a + b + c) / 2;
                System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                break;
            case "rectangle":
                double x = scanner.nextDouble();
                double y = scanner.nextDouble();
                System.out.println(x * y);
                break;
            case "circle":
                double r = scanner.nextDouble();
                System.out.println(r * r * 3.14d);
                break;
        }
    }
}