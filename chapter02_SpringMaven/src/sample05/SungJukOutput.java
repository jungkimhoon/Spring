package sample05;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ComponentScan("com.conf")
//@Component
public class SungJukOutput implements SungJuk{
	@Autowired
	private ArrayList<SungJukDTO2> list;
	@Override
	public void execute() {
		System.out.println();
		for(SungJukDTO2 sungJukDTO2 : list) {
			System.out.println(sungJukDTO2);
		}
	}


}
