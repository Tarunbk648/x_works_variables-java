import java.util.Scanner;
class CountNumberWithoutArray{
   static int num, count=0;
     public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		while(num!=0){
			num=num/10;
			count++;
		}
     System.out.println("Number consists of ---> this digits:" +count);
}
}
		