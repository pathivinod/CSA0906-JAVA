import java.io.*;
import java.util.*;
class simpleintrest
{
public static void main(String args[])
{
int p,t,r;
Scanner s=new Scanner(System.in);
System.out.println("enter principle ammount,time and rate of intrest values=");
p=s.nextInt();
t=s.nextInt();
r=s.nextInt();
int z=(p*t*r)/100;
System.out.println("intrest ammount ="+z);
}
}
