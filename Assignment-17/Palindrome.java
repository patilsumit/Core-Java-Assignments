import java.util.Scanner;

/* ----------------------------------------------------------------------
Assignment No :17
Program       :Write a Java program to check whether the given number is Palindrome number or not.
Date          :28-02-2019
Auther        :Sumit Patil
Institute     :WebStack Academy (P) Ltd.
------------------------------------------------------------------------ */
public class Palindrome {

    public static void main(String[] args) {


     Scanner sc=new Scanner(System.in);
     System.out.print("Enter String: ");
     String str=sc.nextLine();

     String rev="";

     int len=str.length();
   
     for(int i=len-1; i>=0; i--){

         rev=rev + str.charAt(i);
     }

     if(str.equals(rev)){
     System.out.print("String is Palindrome");
     }
     else{
        System.out.print("String is Not Palindrome");
     }
        
    }
}