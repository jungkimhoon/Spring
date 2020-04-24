package sample05;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ComponentScan("com.conf")
//@Component
@Scope("prototype")
public class SungJukDTO2 {
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int tot;
    private double avg;
    
    public String toString() {
    	return  name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+String.format("%.2f", avg);
    }
}
