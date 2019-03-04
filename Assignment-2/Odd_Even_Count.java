/* ----------------------------------------------------------------------
Assignment No :02
Program       :Write a java program to prints the count of odd and even no’s entered
Date          :25-02-2019
Auther        :Sumit Patil
Institute     :WebStack Academy (P) Ltd.
------------------------------------------------------------------------ */

public class Odd_Even_Count{
	public static void main(String[] args){

       int e=0,o=0;
      
   
       for(int i=1;i<=7;i++){
    
         if(i %2 == 0)
         {
           e=e +1;
         }
         else
         {
             o =o +1;
         }
       }

       System.out.println("even : " + e);
       System.out.println("odd : " + o);
            
	}
}

