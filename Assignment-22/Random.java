/* ----------------------------------------------------------------------
Assignment No :22
Program       :Write a program to generate 5 Random nos. between 1 to 100, and it should not follow with decimal point.
Date          :01-03-2019
Auther        :Sumit Patil
Institute     :WebStack Academy (P) Ltd.
------------------------------------------------------------------------ */
public class Random {
    public static void main(String[] args) {
     

        for (int i = 1; i <= 5 ; i++)
        {
         int Random = (int)(Math.random()*100);
         System.out.println(Random);
        }

      
    }
}