import java.io.*;
import java.util.*;
class arthemeticoperationswitchcase
{
public static void main(String args[])
{
int a,b;
String c;
Scanner s=new Scanner(System.in);
System.out.println("enter your choice");
c=s.nextLine();
System.out.println("enter 2 integers");
a=s.nextInt();
b=s.nextInt();
switch(c)
{
case "+":
int sum=a+b;
System.out.println("sum of"+a+" and "+b+"="+sum);
break;
case "-":
int sub=a-b;
System.out.println("difference of "+a+" and "+b+"="+sub);
break;
case "*":
int mul=a*b;
System.out.println("product of "+a+" and "+b+"="+mul);
break;
case "/":
int div=a/b;
System.out.println("division of "+a+" and "+b+"="+div);
break;
case "%":
int mod=a%b;
System.out.println("modulus of "+a+" and "+b+"="+mod);
break;
default:
System.out.println("enter valid choice");
}
}
}
