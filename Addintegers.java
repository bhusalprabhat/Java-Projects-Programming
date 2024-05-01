package JAVA;
import java.util.*;
public class Addintegers {
    @SuppressWarnings("resource")
	public static void main(String[] args) {

        //Scanner is used to take input from user//
        Scanner number=new Scanner(System.in);
        
        //Takes the number from num1
        System.out.print("Enter First number : ");
        int num1=number.nextInt();

        //Takes the input from the User of num2
        System.out.print("Enter Second number : ");
        int num2=number.nextInt();

        //Performs sum
        int Result=num1+num2;

        //Prints the result
        System.out.println("The sum of two numbers is: "+Result);
    }
}
