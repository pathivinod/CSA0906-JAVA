import java.util.*;
import java.io.*;
import java.lang.Math;
class expression2
{
public static void main(String args[])
{
int a,b,c;
Scanner s=new Scanner(System.in);
System.out.println("enter a,b,c values=");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
double w=((Math.pow(b,2)-4*a*c)/2*a);
System.out.println("output value="+w);
}
}
