import java.io.*;
import java.util.*;
class employee
{
public static void main(String args[])
{
double sal,hra,da,pf,lic,ca,ta,home,gsal,nsal,bo;
String name;
int id,l,h;
Scanner s=new Scanner(System.in);
System.out.println("enter employee name=");
name=s.nextLine();
System.out.println("enter employee id=");
id=s.nextInt();
System.out.println("enter salary=");
sal=s.nextFloat();
System.out.println("enter home loan %=");
h=s.nextInt();
System.out.println("enter lic %=");
l=s.nextInt();
hra=sal*0.2;
System.out.println("HRA="+hra);
da=sal*0.2;
System.out.println("DA="+da);
ca=sal*0.05;
System.out.println("CA="+ca);
ta=0.1*sal;
System.out.println("TA="+ta);
pf=0.12*sal;
System.out.println("PF="+pf);
home=sal*0.01*h;
System.out.println("HOME LOAN="+home);
lic=sal*0.01*l;
System.out.println("LIC="+lic);
gsal=sal+hra+da+ca+ta;
System.out.println("GROSS sALARY="+gsal);
nsal=gsal-(pf+home+lic);
System.out.println("NET SALARY="+nsal);
if(nsal<=10000)
{
bo=nsal*0.05;
System.out.println("bonus="+bo);
}
if(nsal>10000 && nsal<=30000)
{
bo=nsal*0.10;
System.out.println("bonus="+bo);
}
if(nsal>30000 && nsal<=50000)
{
bo=nsal*0.20;
System.out.println("bonus="+bo);
}
if(nsal>50000)
{
bo=nsal*0.30;
System.out.println("bonus="+bo);
}
}
}
