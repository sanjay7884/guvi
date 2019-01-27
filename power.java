import java.io.*;
import java.util.Scanner;
class power
{
   public static void main(String arg[])
   {
	  long n,p,a=1;
	  Scanner s=new Scanner(System.in);
    System.out.println("input: ");
	   n=s.nextLong();
	   p=s.nextLong();
    System.out.println("output: ");
     if(n>=0&&p==0)
      {   
         a =1;
      }
     else if(n==0&&p>=1)
	    {   
          a=0;
	    } 
     else
	    { 
        for(int i=1;i<=p;i++)
	       { 
           a=a *n;
          }    
  	  }    
      System.out.println(a);
     }
  }
