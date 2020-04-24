package com.conf;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import sample05.HelloSpring;
import sample03.SungJukDTO;
import sample03.SungJukImpl;
import sample05.SungJukDTO2;
import sample05.SungJukDelete;
import sample05.SungJukInput;
import sample05.SungJukModify;
import sample05.SungJukOutput;

@Configuration
public class Instance {
	//메소드 명을 객체 명으로 인식한다.
	// 그래서 객체 명을 getSungJukImpl로 인식하기 때문에 추가로 name="sungJukImpl"를 부여
	@Bean(name="sungJukImpl")
    public SungJukImpl getSungJukImpl() {
    	
    	return new SungJukImpl();
    }
	
	@Bean
	public SungJukDTO sungJukDTO() {
		return new SungJukDTO();
	}
	@Bean
	public HelloSpring helloSpring() {
		return new HelloSpring();
	}
	
	@Bean
	@Scope("prototype")
	public SungJukInput sungJukInput() {
		return new SungJukInput();
	}
	@Bean
	public SungJukOutput sungJukOutput() {
		return new SungJukOutput();
	}
	@Bean
	public SungJukModify sungJukModify() {
		return new SungJukModify();
	}
	@Bean
	public SungJukDelete sungJukDelete() {
		return new SungJukDelete();
	}
	@Bean
	public ArrayList<SungJukDTO2> list(){
		return new ArrayList<SungJukDTO2>();
	}
	@Bean
	@Scope("prototype")
	public SungJukDTO2 sungJukDTO2() {
		return new SungJukDTO2();
	}
}
