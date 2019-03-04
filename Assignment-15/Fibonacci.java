/* ----------------------------------------------------------------------
Assignment No :15
Program       :Write a program in the sequence 1 1 2 3 5 8 13 21 ……………… and called Fibonacci numbers. Write a program using a do…while 	loop to calculate and print the first m Fibonacci numbers.
Date          :28-02-2019
Auther        :Sumit Patil
Institute     :WebStack Academy (P) Ltd.
------------------------------------------------------------------------ */
public class Fibonacci {

    public static void main(String[] args) {

        int n = 10, t1 = 0, t2 = 1,i;
        System.out.print("First " + n + " terms: ");

        i=1;
        do{
          
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

            i++;
      
        }while(i<=n);

        
    }
}