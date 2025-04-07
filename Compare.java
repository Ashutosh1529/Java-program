import java.util.Scanner;

public class Compare {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Enter first number (a): ");
          double a = input.nextDouble();
          System.out.println("Enter second number(b):");
          double b=input.nextDouble();
    if(a>b){
        System.out.println("a is greater"+a);
        
    }
    else{
        System.out.println("b is greater"+b);
    }

       }
}
