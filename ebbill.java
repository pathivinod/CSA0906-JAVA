import java.io.*;
import java.util.*;
class ebbill
{
public static void main(String args[])
{
int cno,cmr,lmr,unit;
String name;
double amm;
Scanner s=new Scanner(System.in);
System.out.println("enter consumer name=");
name=s.nextLine();
System.out.println("enter consumer number=");
cno=s.nextInt();
System.out.println("enter current month reading=");
cmr=s.nextInt();
System.out.println("enter last month reading=");
lmr=s.nextInt();
unit=cmr-lmr;
if(unit>0)
{
if(unit<100)
{
amm=unit*0;
System.out.println("EB ammount="+amm);
}
else if(unit>100 && unit<=300)
{
int a=unit-100;
int a1=100*0;
double b=a*2.25;
amm=a1+b;
System.out.println("EB ammount="+amm);
}
else if(unit>300 && unit<=500)
{
int a2=unit-100;
int a3=100*0;
int a4=a2-200;
double a5=200*2.25;
double a6=a4*3.75;
amm=a3+a5+a6;
System.out.println("EB ammount="+amm);
}
else
{
int a2=unit-100;
int a3=100*0;
int a4=a2-200;
double a5=200*2.25;
int a6=a4-200;
double a7=200*3.75;
double a8=a6*5.50;
amm=a3+a5+a7+a8;
System.out.println("EB ammount="+amm);
}
}
else
{
System.out.println("re-enter current month and last month readings");
}
}
}
