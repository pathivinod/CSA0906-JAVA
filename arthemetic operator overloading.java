import java.io.*;
import java.util.*;
import java.lang.Math;
class arithm
{
int a,b,c,d,x;
double e,f,g,h,z;
void opp(int m1,int m2)
{
a=m1;
b=m2;
System.out.println("sum of "+a+" and "+b+" is "+(a+b));
}
void opp(int m3,double m4)
{
c=m3;
e=m4;
System.out.println("difference of "+c+" and "+e+" is "+(c-e));
}
void opp(double m5,double m6)
{
f=m5;
g=m6;
System.out.println("product of "+f+" and "+g+" is "+(f*g));
}
void opp(double m7,int m8)
{
h=m7;
d=m8;
System.out.println("division of "+d+" and "+h+" is "+(d/h));
}
void opp(int m9)
{
x=m9;
System.out.println("power of "+x+" and 8 is "+(Math.pow(x,8)));
}
void opp(double m10)
{
z=m10;
System.out.println("power of "+z+" and 10 is "+(Math.pow(z,10)));
}
}
class deep
{
public static void main(String args[])
{
arithm y=new arithm();
y.opp(2);
y.opp(2.5);
y.opp(12,15);
y.opp(15.3,89);
y.opp(90,18.56);
y.opp(11.26,89.65);
}}
