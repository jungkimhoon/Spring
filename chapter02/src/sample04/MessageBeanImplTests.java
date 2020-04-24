package sample04;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.Assert;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class MessageBeanImplTests {
	@Autowired
    MessageBeanImpl messageBean2;
	@Test
	public void test() {
		assertEquals("홍길동", messageBean2.getName());
	}

}
