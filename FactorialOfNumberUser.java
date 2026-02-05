import java.util.Scanner;
class  FactorialOfNumberUser{
static int a, fact=1;
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:" );
	a= sc.nextInt();
	for(int i=1; i<=a; i++){
		fact=fact*i;
	}
	System.out.println("The factorial of number is:" +fact);
}
}
	