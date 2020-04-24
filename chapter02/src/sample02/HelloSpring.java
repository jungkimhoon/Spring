package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
    public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Calc calcAdd = context.getBean("calcAdd",CalcAdd.class);
		calcAdd.calculate();
		calcAdd.calculate(38,30);
		Calc calcMul = context.getBean("calcMul",CalcMul.class);
		calcMul.calculate();
		calcMul.calculate(20,30);
	}
}
