/*
In this section we will how to find armstrong number :
________________________________________________________
Question : find that the given number is armstrong or not.
____________________________________________________________
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a , temp , count = 0 , digit , product , sum = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER YOU WANT TO CHECK ARMSTRONG : ");
        a = sc.nextInt();
        temp = a ;
        while (temp > 0){
            temp = temp / 10;
            count++;
        }
        System.out.println("Printing number of digits that present in number : " + count);
        temp = a;
    while (temp > 0){
     digit = temp % 10 ;
     product = 1;
     for (int i = 1; i <= count; i++)
         product = product * digit;
         sum = sum + product;
         temp = temp / 10;
}
        System.out.println();
    if (sum == a){
        System.out.println("THE GIVEN NUMBER IS ARMSTRONG : " +  a);
    }else {
        System.out.println("THE NUMBER IS NOT A ARMSTRONG : " +  a);
    }
    }
}