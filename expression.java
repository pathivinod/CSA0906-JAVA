import java.util.*;
import java.io.*;
import java.lang.Math;
class expression
{
public static void main(String args[])
{
int a,b,c;
Scanner s=new Scanner(System.in);
System.out.println("enter a,b,c values=");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
int w=((a*b)/c)+((b*c)/a)+((c*a)/b);
System.out.println("output value="+w);
}
}
