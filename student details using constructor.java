import java.io.*;
import java.util.*;
class student
{
int reg,a,b,c,d,e,tot;
double avg;
String name;
student(String name,int reg)
{
System.out.println("name="+name);
System.out.println("register number="+reg);
}
student(int m1,int m2,int m3,int m4,int m5)
{
a=m1;
b=m2;
c=m3;
d=m4;
e=m5;
}
void cal()
{
tot=a+b+c+d+e;
avg=tot/5;
System.out.println("total="+tot);
System.out.println("average="+avg);
}
void display()
{
if(avg>=90)
{
System.out.println(name+ " GRADE IS A+");
}
else if(avg>=80 && avg<90)
{
System.out.println(name+ " GRADE IS A");
}
else if(avg>=70 && avg<80)
{
System.out.println(name+ " GRADE IS B");
}
else if(avg>=60 && avg<70)
{
System.out.println(name+ " GRADE IS C");
}
else if(avg>=50 && avg<60)
{
System.out.println(name+ " GRADE IS D");
}
}
}
class prad
{
public static void main(String args[])
{
student a=new student("pradeep",19);
student b=new student(65,70,89,78,67);
b.cal();
b.display();
}
}
