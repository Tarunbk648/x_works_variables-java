import java.util.Scanner;
class ReverseAlphabetUser{
public static void main(String[] args){
       String str;
       String rev="";
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the String:");
       str=sc.nextLine();   // nextLine used to read the entire String Line
       for(int i=str.length()-1; i>=0; i--){
		rev=rev+str.charAt(i);
	}
System.out.println(rev);
}
}
	