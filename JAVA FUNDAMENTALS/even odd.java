import java.util.Scanner;
public class evenodd{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int a=scan.nextInt();
        if(a%2==0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}