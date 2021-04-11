package Recursion;

public class Toprint100to1 {
	void m(int i) {
		
		System.out.println(i);
		i++;
		if (i <=100) {
			m(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toprint100to1 obj = new Toprint100to1();
		obj.m(1);
	}

}
