/* ----------------------------------------------------------------------
Assignment No :19
Program       : Write a program to check the prime number of a given number
Date          :01-03-2019
Auther        :Sumit Patil
Institute     :WebStack Academy (P) Ltd.
------------------------------------------------------------------------ */
public class Prime {

    int flag=0,i,m=0;
    
      public void primeNumber(int n)
      {
        m=n/2;
          if(n==0 || n==1){
             System.out.println( n +"number is not prime");
          }
          else
          {
            for(i=2;i<=m;i++){
                if(n%i==0){      
                    System.out.println(n+" is not prime number");      
                    flag=1;      
                    break;      
                   }      
            }
          if(flag==0){
            System.out.println(n + " Number is Prime");
          }
    }

      }

    public static void main(String[] args) {

        Prime obj=new Prime();
        obj.primeNumber(31);
       
    }
}