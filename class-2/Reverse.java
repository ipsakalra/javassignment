class Reverse{
public static void main(String[] args){
int n=123;
int a,b,c,d,e;
a=n/100;
b=n%100;
c=b/10;
d=b%10;
e=(d*100)+(c*10)+(a*1);
System.out.println(e);
}
}