class ReverseNumber{
public static void main(String[] args){
	int num=123, rev=0;
	while(num!=0){
		int digit=num%10;     //get the last digit (remainder)
		rev=rev*10+digit;
		num=num/10;   //remove last digit ie 3 (remaining is 12 is considered as num=12 for next iterations)
	}
System.out.println(rev);
}
}