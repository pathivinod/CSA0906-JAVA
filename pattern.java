import java.io.*;
import java.util.*;
class pa
{
public static void main(String args[])
{
int i,j,n;
Scanner s=new Scanner(System.in);
System.out.print("enter no of rows=");
n=s.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(i);
}
System.out.println(" ");
}
for(i=n-1;i>=1;i--)
{
for(j=1;j<=i;j++)
{
System.out.print(i);
}
System.out.println(" ");
}
}
}
