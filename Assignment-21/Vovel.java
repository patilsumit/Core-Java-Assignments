import java.util.Scanner;

/* ----------------------------------------------------------------------
Assignment No :21
Program       :Write a program to check entered characters is vowel or not using switch case
Date          :01-03-2019
Auther        :Sumit Patil
Institute     :WebStack Academy (P) Ltd.
------------------------------------------------------------------------ */
public class Vovel {
    public static void main(String[] args) {
     
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Choice: ");
        String ch=sc.nextLine();

        switch(ch){
            case "A": 
                    System.out.println("Is a Vovel");
                    break;
            case "E":
                    System.out.println("Is a Vovel");
                    break;
            case "I":
                    System.out.println("Is a Vovel");
                    break;
            case "O":
                    System.out.println("Is a Vovel");
                    break;
            case "U":
                    System.out.println("Is a Vovel");
                    break;        
            default :System.out.print("Is Not Vovel....");
                      break;       
        }
       
    }
}