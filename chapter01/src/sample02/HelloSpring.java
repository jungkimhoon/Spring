package sample02;

public class HelloSpring {
    public static void main(String[] args) {
//		MessageBeanEn bean = new MessageBeanEn(); // 1:1관계, 결합도 100%
    	MessageBean bean = new MessageBeanEn();
    	
		bean.sayHello("Spring");
	}
}
