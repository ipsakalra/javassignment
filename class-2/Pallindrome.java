class Pallindrome{
public static void main(String[] args){
int n=121;
int rev=0;
int b,i;
i=n;
while(n>0){
b=n%10;
rev= rev * 10 + b;
n=n/10;
}
if(i==rev)
{
System.out.println("pallindrome number");
}
else
{
System.out.println("not a pallindrome number");
}
}
}