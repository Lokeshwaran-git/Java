package dWhile;

public class ReverseOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=491;
int rev=0;
while(num!=0)
{
	rev=rev*10+num%10;
	num=num/10;
	
}
System.out.print(rev);
	}

}
