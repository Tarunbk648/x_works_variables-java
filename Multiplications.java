import java.util.Scanner;
class Multiplications{
static int a;
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
a=sc.nextInt();
System.out.println();
for(int i=1; i<=10; i++){
System.out.println( a +"x" + i + "="  +(a*i));
 }
}
}