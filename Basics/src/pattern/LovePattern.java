package pattern;

public class LovePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=5;j++)
			{
				if(i==5||j==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=5;j++)
			{
				if(i==1||j==1||j==1||j==5||i==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=9;j++)
			{
				if(i==j||i+j==10)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=5;j++)
			{
				if(i==1||i==3||i==5||j==2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
