package question1;

//      write a program java to input 5 numbers from keyboard and find their average
import java.util.Scanner;

public class Scanners {
    public static void main(String[]args){
//        using scanners to allow input of values
        Scanner input = new Scanner (System.in);
        System.out.print("Input the first number: ");
        int num1 = input.nextInt();
        System.out.print("Input the second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.print("Input the third number: ");
        int num3 = input.nextInt();
        sum =num1 + num2 + num3;
        System.out.print("Input the fourth number: ");
        int num4 = input.nextInt();
        sum = num1 + num2 + num3;
        System.out.print("Input the fifth number: ");
        int num5 = input.nextInt();
        sum = num1 + num2+ num3 +num4;
        System.out.println();
        System.out.println("Sum: "+sum);
    }
 }
