/* ----------------------------------------------------------------------
Assignment No :09
Program       :Create a java program and use private variable. Try to access that variable in some other class?
Date          :26-02-2019
Auther        :Sumit Patil
Institute     :WebStack Academy (P) Ltd.
------------------------------------------------------------------------ */
class car{
    private int num=10;

   void Display(){
        System.out.print(num);
    }
       

}

public class PrivateAcess{

    public static void main(String args[]){
         
          car obj=new car();
        //  int a= obj.num;
            obj.Display();         
        // System.out.print(a);

    }
}