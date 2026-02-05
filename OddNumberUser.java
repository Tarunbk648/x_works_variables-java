import java.util.Scanner;
class OddNumberUser{
static int a;
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	a= sc.nextInt();
	if(a%2!=0){
		System.out.println("Number"  +a+  "is odd");
	}
	else{
		System.out.println("Number"  +a+  "is even");
	}
}
}
	