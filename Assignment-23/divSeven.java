/* ----------------------------------------------------------------------
Assignment No :23
Program       :Write a program to find sum of all integers greater than 100 and less than 200 that are divisible by 7.
Date          :01-03-2019
Auther        :Sumit Patil
Institute     :WebStack Academy (P) Ltd.
------------------------------------------------------------------------ */
public class divSeven {
    public static void main(String[] args) {
     
       int sum=0;
        for (int i = 100; i <= 200 ; i++)
        {
            
            if( i %7 == 0){
                sum=sum + i;
                
            }   
        }
        System.out.println(sum);

      
    }
}