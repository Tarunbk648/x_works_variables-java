import java.util.Scanner;
class ReverseNumberUser{
	static int num, rev=0;
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number:");	
	num=sc.nextInt();
	while(num!=0){
		int digit=num%10;  //get last digit
		rev= rev*10+digit;
		num=num/10;  //remove last digit
	}
System.out.println("The reversed format of  is:"  +rev);
}
}