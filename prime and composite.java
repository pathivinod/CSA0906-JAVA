import java.io.*;
import java.util.*;
public class pri 
{
public static void main(String[] args) 
{
int count; 
for (int i = 100; i <= 200; i++) 
{
count = 0;  
for (int j = 2; j <= i / 2; j++) 
{
if (i % j == 0) 
{
count++;  
break; 
}
}
if (count == 0)
{
System.out.println(i); 
}
}
}
}
