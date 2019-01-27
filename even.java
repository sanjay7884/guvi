import java.util.Scanner;
import java.io.*;
public class even
{	
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("input: ");
		int i = s.nextInt();
		int n = s.nextInt();
		System.out.println("output:");
		for(;i < n; i++)
		   {
			if( i % 2 == 0)
			  System.out.print(i + " ");
                   }
		
	}
}
