package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
    public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Calc calcAdd = context.getBean("CalcAdd",CalcAdd.class);
		calcAdd.calculate(25, 36);
		Calc calcMul = context.getBean("CalcMul",CalcMul.class);
		calcMul.calculate(25, 36);
		((AbstractApplicationContext) context).close();
	}
}
