package jcs;

public class CounterLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=20;
int count=0;
for (int i=1;i<=num;i++)
{
	if(num%i==0)
	{
		System.out.println(i);//To Print the factors itself
		count=count+1;
	}
}
System.out.println("count"+count);//To print count of factors
	}

}
