import java.util.Scanner;
class Increment{
	static int a;
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:" );
	a=sc.nextInt();
	System.out.println("The increment of the number is:" +(a+1));
}
}
	