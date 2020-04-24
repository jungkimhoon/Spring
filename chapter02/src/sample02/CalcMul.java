package sample02;

import lombok.Setter;

public class CalcMul implements Calc {
	@Setter
    private int a, b;
	@Override
	public void calculate() {
		System.out.println(a+" * "+b+" = "+a*b);

	}
	public void calculate(int a, int b) {
		System.out.println(a+" * "+b+" = "+a*b);
		
	}

}
