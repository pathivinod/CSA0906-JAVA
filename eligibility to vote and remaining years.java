import java.io.*;
import java.util.*;
class eligibilitytovoteandremainingyears
{
public static void main(String args[])
{
int age;
Scanner s=new Scanner(System.in);
System.out.println("Enter your age=");
age=s.nextInt();
if(age>=18)
{
System.out.println("your are eligible for voting");
}
else
{
int w=18-age;
System.out.println(w+" years to get right to vote ");
}
}
}
