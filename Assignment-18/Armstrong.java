import java.util.Scanner;

/* ----------------------------------------------------------------------
Assignment No :18
Program       :Write a Java program to find whether the given is number is Armstrong number or not.
Date          :28-02-2019
Auther        :Sumit Patil
Institute     :WebStack Academy (P) Ltd.
------------------------------------------------------------------------ */
public class Armstrong {

    public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);
     System.out.print("Enter Number: ");
     int num=sc.nextInt();

     int originalNumber, remainder, result = 0;

     originalNumber = num;

     while (originalNumber != 0)
     { 
         remainder = originalNumber % 10;
         result += Math.pow(remainder, 3);
         originalNumber /= 10;
     }
        
     if(result == num)
         System.out.println(num + " is an Armstrong number.");
     else
         System.out.println(num + " is not an Armstrong number.");

        
    }
}