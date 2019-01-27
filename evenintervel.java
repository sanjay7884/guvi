import java.util.Scanner;
import java.io.*;
public class evenintervel
{	
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("input: ");
		int n = s.nextInt();
		System.out.println("output:");
		for(int i = 2; i <= n; i = i + 2)
		System.out.print(i+" ");
	}
}
