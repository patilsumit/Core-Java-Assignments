/* ----------------------------------------------------------------------
Assignment No :11
Program       :Write a program to count the same character in the String.
Date          :27-02-2019
Auther        :Sumit Patil
Institute     :WebStack Academy (P) Ltd.
------------------------------------------------------------------------ */

public class count_Array{
  
       
    public static void main(String args[]){
      
        String s="EMERTXE";
        char[] ch=s.toCharArray();
        int i,j;
        int find=0;
        int count[] = new int[256]; 

        for (i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++; 
        }
       for( i=0;i<s.length();i++)
       {
           ch[i]=s.charAt((i));
           
           for(j=0;j<=i;j++){
            if(s.charAt(i) == ch[j] )
            {
                find++;
            }
       }
       System.out.println(ch[i] +" = " + count[s.charAt(i)] );
           
        }
          

       
        

    }
}