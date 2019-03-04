/* ----------------------------------------------------------------------
Assignment No :14
Program       :Write a program to print this triangle
Date          :26-02-2019
Auther        :Sumit Patil
Institute     :WebStack Academy (P) Ltd.
------------------------------------------------------------------------ */

public class Triangle{
  
       
    public static void main(String args[]){
      
        int number=1;
        for(int i=1;i<=5;i++){

            for(int j=0;j<i;j++){
                System.out.print(number + " ");
                ++number;
            }

            
            System.out.println();    
        }
        

    }
}