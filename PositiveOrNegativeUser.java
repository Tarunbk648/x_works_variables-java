import java.util.Scanner;
class PositiveOrNegativeUser{
static int a;
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
a=sc.nextInt();
if(a>0){
	System.out.println("Number" +a+"is positive");
}
else{
	System.out.println("Number"+a+"is negative");
}
}
}