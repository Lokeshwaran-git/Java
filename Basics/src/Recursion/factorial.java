package Recursion;

public class factorial {
	int fact = 1;

	void m(int i) {
		fact = fact * i;
		i++;
		if (i <= 5) {
			m(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial a = new factorial();
		a.m(1);
		System.out.println(a.fact);

	}

}
