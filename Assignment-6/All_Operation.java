/* ----------------------------------------------------------------------
Assignment No :06
Program       :Write a java program for finding the sum, difference, product, quotient, minimum and maximum of any two integers.
Date          :25-02-2019
Auther        :Sumit Patil
Institute     :WebStack Academy (P) Ltd.
------------------------------------------------------------------------ */
import java.lang.Math; 
public class All_Operation{
	public static void main(String[] args){

		// logical or boolean operators and shor-circuit operators example example
        int a=45,b=35,add,mul,mines,div,min,max;
        
        
        add= a + b;
        mul= a* b;
        div=a /b;
        mines = a -b;
        
        System.out.println("Sum:" + add );
        System.out.println("Mul:" + mul );
        System.out.println("Div:" + div );
        System.out.println("Mines:" + mines );
        System.out.println("Min:" + Math.min(a,b) );
        System.out.println("Max:" + Math.max(a,b) );
	}
}

