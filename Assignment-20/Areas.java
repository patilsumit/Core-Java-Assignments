import java.util.Scanner;

/* ----------------------------------------------------------------------
Assignment No :20
Program       :Write a program to calculate area of circle, rectangle, square using switch case
Date          :01-03-2019
Auther        :Sumit Patil
Institute     :WebStack Academy (P) Ltd.
------------------------------------------------------------------------ */
public class Areas {
    public static void main(String[] args) {
      
        double circle,rect,square,r=5;
        double PI=3.14;
        double l=6,b=4;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Choice: ");
        int ch=sc.nextInt();

        switch(ch){
            case 1: circle= PI * r * r;  
                    System.out.println("Circle: "+ circle);
                    break;
            case 2:rect =l * b;
                    System.out.println("Rect: "+ rect);
                    break;
            case 3:square =l * l;
                    System.out.println("Square: "+ square);
                    break;
             default :System.out.print("Invalid Input");
                      break;       
        }
       
    }
}