import java.io.*;
import java.util.*;
class sarray
{
public static void main(String args[])
{
int x[]=new int[50],temp,sum,dif,n,k,l;
Scanner s=new Scanner(System.in);
System.out.println("enter no of  values in array=");
n=s.nextInt();
System.out.println("enter k value to find k th maximum in array=");
k=s.nextInt();
System.out.println("enter k value to find l th minimum in array=");
l=s.nextInt();
System.out.println("enter "+n+" values");
for(int i=1;i<=n;i++)
{
x[i]=s.nextInt();
}
for(int i=1;i<=n;i++)
{
for(int j=i+1;j<=n;j++)
{
if(x[i]>x[j])
{
temp=x[i];
x[i]=x[j];
x[j]=temp;
}}}
System.out.println("sorted array is");
for(int i=1;i<=n;i++)
{
System.out.println(x[i]);
}
System.out.println(k+"maximum numberis ="+x[n+1-k]);
System.out.println(l+" minimum number is ="+x[l]);
sum=x[n+1-k]+x[l];
dif=x[n-k+1]-x[l];
System.out.println("sum of "+k+"maximum number and "+l+" minimum number is ="+sum);
System.out.println("difference of "+k+"maximum number and "+l+" minimum number is ="+dif);
}
}
