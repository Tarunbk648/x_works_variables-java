import java.util.Scanner;
class DividedByFive{
   static int a;
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number:");
	a=sc.nextInt();
	if(a%5==0){
		System.out.println("The Number" +a+ "Divided by 5");
	}
	else{
		System.out.println("The Number" +a+ "cannot divisible by 5");
	    }
	}
  }