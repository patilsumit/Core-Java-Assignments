/* ----------------------------------------------------------------------
Assignment No :05
Program       :Write a java program to find the roots of a quadratic equation. Assign the values of a, b and c of the equations in the program itself.
Date          :25-02-2019
Auther        :Sumit Patil
Institute     :WebStack Academy (P) Ltd.
------------------------------------------------------------------------ */
public class Quadratic_Equation{
	public static void main(String[] args){

		// logical or boolean operators and shor-circuit operators example example
         double a=44,b=55,c=5;

         double x1,x2;

         double x= (b * b) - (4 * a *c);
         

         x1= ( (-b) + Math.sqrt(x) ) / (2 * a) ;

         x2=( (-b) - Math.sqrt(x) ) / (2 * a) ;
        
        System.out.println("Quadrtic_Equation x1:" +x1);
        System.out.println("Quadrtic_Equation x2:" +x2);
	}
}

