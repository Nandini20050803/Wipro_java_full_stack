import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the characters:");
        char var = scan.next().charAt(0);

        if (var >= 'a' && var <= 'z') {
            System.out.println("Lower case character");
        }

        if (var >= 'A' && var <= 'Z') {
            System.out.println("Upper case character");
        }
    }
}