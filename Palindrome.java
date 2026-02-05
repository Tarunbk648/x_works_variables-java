class Palindrome{
public static void main(String[] args){
	String rev="";
	String str="TARUN";
	System.out.println("Entered Letter are:" +str);
	for(int i=str.length()-1; i>=0; i--){
		rev=rev+str.charAt(i);
	}
	System.out.println("Reverse of letter:" +rev);
	if(str.equals(rev)){
		System.out.println("PALINDROME");
	}
	else{
		System.out.println("NOT A PALINDROME");
	}
}
}

