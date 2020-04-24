package sample02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CalcMul implements Calc {
    private int a, b;
    
    @Autowired
    public void setA(@Value("25")int x) {
    	this.a= a;
    	
    }
    @Autowired
    public void setB(@Value("36")int y) {
    	this.b = b;
    }
    
	@Override
	public void calculate() {
		System.out.println(a+" * "+b+" = "+a*b);

	}
	public void calculate(int a, int b) {
		System.out.println(a+" * "+b+" = "+a*b);
		
	}

}
