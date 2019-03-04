import java.util.Scanner;

/* ----------------------------------------------------------------------
Assignment No :16
Program       :Determine If an Year Is a Leap Year
Date          :28-02-2019
Auther        :Sumit Patil
Institute     :WebStack Academy (P) Ltd.
------------------------------------------------------------------------ */
public class LeapYear {

    public static void main(String[] args) {


     Scanner sc=new Scanner(System.in);
     System.out.print("Enter Year: ");
     int year=sc.nextInt();

     if(year %4==0){
         System.out.println("Year is Leap Year..");
     }
     else{
        System.out.println("Year is Not Leap Year..");
     }

        
    }
}