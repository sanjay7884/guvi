import java.util.Scanner;
public class palindrome 
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("input:");
int n= s.nextInt();
int n1=n;
int r=0;
System.out.println("output:");
while (n1 != 0) 
{
int r1 = n1 % 10;
r = r * 10 + r1;
n1 = n1 / 10;
} 
if(n == r)
System.out.println("yes");
else
System.out.println("no");
}
}
