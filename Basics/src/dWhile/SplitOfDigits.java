package dWhile;

public class SplitOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=8998;
int split=0;
while (num!=0)
{
	split=num%10;
	System.out.print(split+" ");
	num=num/10;
}
	}

}
