import java.io.*;
import java.util.*;
class nin
{
public static void main(String args[])
{
int a[]=new int[90];
int b[]=new int[90];
int c[]=new int[90];
Scanner s=new Scanner(System.in);
System.out.println("enter quantity of 5 items=");
for(int i=1;i<=5;i++)
{
a[i]=s.nextInt();
}
System.out.println("enter price of 5 items=");
for(int i=1;i<=5;i++)
{
b[i]=s.nextInt();
}
for(int i=1;i<=5;i++)
{
c[i]=a[i]*b[i];
}
int sum=0;
for(int i=1;i<=5;i++)
{
sum=sum+c[i];
}
System.out.println("S.NO \t QUANTITY \t PRICE \t AMMOUNT" );
for(int i=1;i<=5;i++)
{
System.out.println((i)   +    "\t"    +  a[i]  + "\t"  +  b[i]  + "\t" +  c[i] );
}
System.out.println("total ammount="+sum);
}
}
