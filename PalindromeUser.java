import java.util.Scanner;
class PalindromeUser{
	static String rev="", str;
 public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the word:");
	str=sc.nextLine();
	for(int i=str.length()-1; i>=0; i--){
		rev=rev+str.charAt(i);
	}
	System.out.println("Reversed word are:" +rev);
	if(str.equals(rev)){
		System.out.println("PALINDROME");
	}
	else{
		System.out.println("NOT A PALINDROME");
	}
}
}