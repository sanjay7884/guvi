import java.util.Scanner;
import java.io.*;
class factorial
{
	public static void main(String arg[])
  {
	  long n,fact=1;
	  Scanner s=new Scanner(System.in);
    System.out.println("input:  ");
	  n=s.nextLong();
    System.out.println("output:");
    for(int i=1;i<=n;i++)
	   {
	    fact=fact*i;
      }
      System.out.println(fact);
    }
 }
