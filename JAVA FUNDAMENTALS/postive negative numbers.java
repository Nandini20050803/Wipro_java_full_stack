import java.util.Scanner;
public class integerposneg{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int a=scan.nextInt();
        if (a>0 && a!=0){
            System.out.println("The number is positive.");
        } if (a<0) {
            System.out.println("The number is negative.");
        } if (a==0) {
            System.out.println("The number is zero.");
        }
    }
}