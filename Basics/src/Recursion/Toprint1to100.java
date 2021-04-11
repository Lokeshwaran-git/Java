package Recursion;


public class Toprint1to100 {
	void m(int i) {
		System.out.println(i);
		i++;
		if (i <= 100) {
			m(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toprint1to100 obj = new Toprint1to100();
		obj.m(1);
	}

}
