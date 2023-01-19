/*
In this we see how we can find the reminder, quotient, and number of digit.
 */
import java.util.Scanner;
public class FindNoDigit {
    public static void main(String[] args) {
        int ans ;
        int count = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER :");
        int a = sc.nextInt();
        int temp ;
        ans =  a / 10; // it will give quotient.
        temp = a % 10; // it will give reminder.
        System.out.println("IT WILL PROVIDE QUOTIENT (/) : " + ans);
        System.out.println("IT WILL PROVIDE ORIGINAL VALUE : " + a);
        System.out.println("IT WILL PROVIDE REMINDER (%): " + temp);
        System.out.println();
        while (a > 0){
            a = a / 10 ;
            count++;
        }
        System.out.println("PRINTING NUMBER OF DIGITS : ");
        System.out.println(count);
    }
}
