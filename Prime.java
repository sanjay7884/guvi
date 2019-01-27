import java.util.*;
import java.io.*;
public class Prime 
{

    public static void main(String[] args)
	{
        Scanner s=new Scanner(System.in);
	System.out.println("input:");
        int n=s.nextInt();
	int j=0;
        for(int i = 2; i <= n/2; ++i)
        {
            if(n%i == 0)
              j=1;
	    
        }
	    if(j==1)
		System.out.println("no");  
            else
            System.out.println("yes");
    }
}
