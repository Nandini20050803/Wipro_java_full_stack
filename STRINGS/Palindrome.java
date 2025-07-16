import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the string input");
        String s = sc.nextLine();
        int n=s.length();
        int first=0,end=n-1;
        while(first<=end){
             if (s.charAt(first) != s.charAt(end)) { 
                  first++;
        end--; 
               
        }
            else{
                
                System.out.println("The given string is a palindrome");
                break;
            }
            System.out.println("The given string is not a palindrome");
            break;
        }
    }