import java.util.*;
class Prime{
public static void main(String[] args){
int i,j,n,isprime;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n");
n=sc.nextInt();
for(i=2;i<=n;i++)
{
isprime=0;
for(j=2;j<=i/2;j++)
{
if(i%j==0)
{
isprime=1;
break;
}
}
if(isprime==0 && n!=1)
{
System.out.print(i+" ");
}
}
}
}
