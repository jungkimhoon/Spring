package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring {
    public static void main(String[] args) {
//        ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.getBean("messageBean");
        MessageBean bean= (MessageBean)context.getBean("messageBean");
        bean.sayHello("Spring");
        System.out.println();
        
//        MessageBean bean2 = context.getBean("mb",MessageBean.class); //id, name 속성 모두 가능
//        bean2.sayHello("Spring");
//        System.out.println();
        
//        MessageBean bean3 = context.getBean("mb",MessageBean.class); //id, name 속성 모두 가능
//        bean3.sayHello("Spring");
//        System.out.println();
    }
}
