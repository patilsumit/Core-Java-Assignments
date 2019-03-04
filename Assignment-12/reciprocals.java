/* ----------------------------------------------------------------------
Assignment No :12
Program       :Write a java program that computes the sum of the reciprocals: 1/1 + 1/2 + 1/3 + ... + 1/10
Date          :26-02-2019
Auther        :Sumit Patil
Institute     :WebStack Academy (P) Ltd.
------------------------------------------------------------------------ */

public class reciprocals{
  
    
    public static void main(String args[]){
         double sum=0;
        for(double i=1;i<10;i++){

         sum = sum +  (1/i) ;

         

        }
        System.out.print(sum);
    }
}