import java.util.Scanner;
class demo
{
int n,i,f=0;
void input()
{
Scanner obj=new Scanner(System.in);
System.out.println("enter a no");
n=obj.nextInt();
}
void cal()
{
for(i=2;i<n;i++)
{
if(n%i==0)
f=1;
break;
}
}
void show()
{
if(f==0)
System.out.println("prime");
else
System.out.println("not prime");
}
}
class prime
{
public static void main(String args[])
{
demo obj=new demo();
{
obj.input();
obj.cal();
obj.show();
}
}
}