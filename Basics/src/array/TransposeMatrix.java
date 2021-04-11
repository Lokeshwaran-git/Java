package array;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int c[][]={{7,8,3},{2,1,11},{4,1,3}};
int d[][]=new int[3][3];
for (int i=0;i<c.length;i++)
{
	for(int j=0;j<c[i].length;j++)//row
	{
		d[i][j]=c[j][i];
		System.out.print(d[i][j]+" ");//column
	}
	System.out.println();
}
	}

}
