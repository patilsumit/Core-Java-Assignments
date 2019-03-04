/* ----------------------------------------------------------------------
Assignment No :03
Program       :Write a program to convert the given temperature in Fahrenheit to Celsius using the following conversion formula: C = F-32 / 1.8 and display the value in a tabular form.
Date          :25-02-2019
Auther        :Sumit Patil
Institute     :WebStack Academy (P) Ltd.
------------------------------------------------------------------------ */
import java.util.*;
public class F_To_C{
	public static void main(String[] args){

       double f=0,c=0;
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Fahrenhit: ");
       f=sc.nextDouble(); 
      
       c=(f-32) / 1.8;
       System.out.println("Celsuis : " + c);
       System.out.print("Enter Celsuis :");
       c=sc.nextDouble(); 

       double a=1.8 * c;
       f = a + 32;
       System.out.println("Fahrenhit : " + f);

       
            
	}
}

