/* ----------------------------------------------------------------------
Assignment No :08
Program       :By using recursion calculate factorial of given number? 
Date          :25-02-2019
Auther        :Sumit Patil
Institute     :WebStack Academy (P) Ltd.
------------------------------------------------------------------------ */
class fact{
  int output;
    public int Face(int n)
    {

   if(n==1){
      return 1;
   }
   else{
      output=Face(n-1) * n;
       return output;
   }
  
  }

}
public class Factorial{
	public static void main(String[] args){

       fact obj=new fact();
       System.out.println( obj.Face(5));
            
	}
}

