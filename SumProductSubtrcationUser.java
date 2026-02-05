import java.util.Scanner;
class SumProductSubtrcationUser{
	static int a,b;
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a two numbers:");
	int a= sc.nextInt();
	int b= sc.nextInt();
	System.out.println("The sum of two numbers:" +(a+b));
	System.out.println("The product of two number:" +(a*b));
	System.out.println("The subtraction of two number:" +(a-b));
}
}
	