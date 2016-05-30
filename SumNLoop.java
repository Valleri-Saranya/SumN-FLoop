import java.io.*;
import java.util.*;
import java.util.Scanner;
public class SumNLoop
{
public static void main(String args[]) 
{
int sum=0,n; 
System.out.print("Enter the number:");
Scanner sc = new Scanner(System.in);
n= sc.nextInt();
for (int i = 1; i<=n; i++)
{ 
sum=sum+i;                                           
System.out.println(sum);
}
}
}