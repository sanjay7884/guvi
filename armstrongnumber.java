import java.util.Scanner;
import java.io.*;
public class armstrongnumber
{
public static void main(String args[])
    {
        int n, temp, num=0, rem;
        Scanner s= new Scanner(System.in);
	      System.out.print("input:");
        n = s.nextInt();
        temp=n;
	System.out.println("output:");
	      while(temp != 0)
        {
            rem = temp%10;
            num = num + rem*rem*rem;
            temp = temp/10;
        }
        if(num == n)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}
