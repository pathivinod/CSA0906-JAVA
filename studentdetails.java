import java.io.*;
import java.util.*;
class studentdetails
{
public static void main(String args[])
{
int m1,m2,m3,m4,m5,reg,tot;
String name;
float avg;
Scanner s=new Scanner(System.in);
System.out.println("enter your name=");
name=s.nextLine();
System.out.println("enter reg number=");
reg=s.nextInt();
System.out.println("enter 5 subject marks=");
m1=s.nextInt();
m2=s.nextInt();
m3=s.nextInt();
m4=s.nextInt();
m5=s.nextInt();
if(m1>50 && m2>50 && m3>50 && m4>50 && m5>50)
{
tot=m1+m2+m3+m4+m5;
avg=tot/5;
System.out.println("TOTAL MARKS="+tot);
System.out.println("AVERAGE="+avg);
if(avg>90)
{
System.out.println("GRADE=A+");
}
else if(avg>=80 && avg<90)
{
System.out.println("GRADE=A");
}
else if(avg>=70 && avg<80)
{
System.out.println("GRADE=B");
}
else if(avg>=60 && avg<70)
{
System.out.println("GRADE=C");
}
else
{
System.out.println("GRADE=D");
}
}
else
{
System.out.println("FAILED");
}
}
}
