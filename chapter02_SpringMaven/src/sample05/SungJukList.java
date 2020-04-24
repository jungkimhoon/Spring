package sample05;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SungJukList {
	@Bean
    public ArrayList<SungJukDTO2> list(){
    	return new ArrayList<SungJukDTO2>();
    }
}
