import java.util.Scanner;
import java.io.*;
public class armstrongnumberintervel
{
    public static void main(String args[])
    {
        int n, n1, n2, i, rem, temp, count=0;
        Scanner s= new Scanner(System.in);
	      System.out.print("input: ");
        n1 = s.nextInt();
        n2 = s.nextInt();
        for(i=n1+1; i<n2; i++)
        {
            temp = i;
            n = 0;
            while(temp != 0)
            {
                rem = temp%10;
                n = n + rem*rem*rem;
                temp = temp/10;
            }
            if(i == n)
            {
              if(count == 0)
                {
                    System.out.println("output:");
                }
                System.out.print(i);
                count++;
            }
        }
       
    }
}
