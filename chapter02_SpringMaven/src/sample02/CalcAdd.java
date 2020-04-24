package sample02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class CalcAdd implements Calc {
    private @Value("25") int a;
    private @Value("25") int b;
    
    public CalcAdd(@Value("25")int a, @Value("36") int b) {
        this.a = a;
        this.b = b;
	}

    
	@Override
	public void calculate() {
        System.out.println(a+" + "+b+" = "+(a+b));
	}
	public void calculate(int a, int b) {
		System.out.println(a+" + "+b+" = "+(a+b));
	}

}
