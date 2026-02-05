import java.util.Scanner;
class MaxUsingInterfaceMethod{
	static int a,b,c;
public static void main(String[] args){
	MaxUsingInterfaceMethod mi= new MaxUsingInterfaceMethod();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number:");
	a=sc.nextInt();
	System.out.println("Enter the second number:");
	b=sc.nextInt();
	System.out.println("Enter the third number:");
	c=sc.nextInt();
	if(a>b&&a>c){
		System.out.println("a is greater:" +a);
	}
	else if(b>a&&b>c){
		System.out.println("b is greater:" +b);
	}
	else{
		System.out.println("c is greater:" +c);
	}
}

}

	



	
	