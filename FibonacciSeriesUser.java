import java.util.Scanner;
class FibonacciSeriesUser{
static int a=0,b=1,c,n;
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
n=sc.nextInt();
for(int i=1; i<=n; i++){
System.out.println(a+"");
	c=a+b;
	a=b;
	b=c;
}
}
}