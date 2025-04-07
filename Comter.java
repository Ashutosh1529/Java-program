
 import java.util.Scanner;

public class Comter{
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Enter first number (a): ");
          double a = input.nextDouble();
          System.out.println("Enter second number(b):");
          double b=input.nextDouble();
          double greater= (a>b)?a:b;
          System.out.println("Greater number is: " +greater);


       }
}
 
    

