package sample05;

import java.util.List;

import lombok.Data;

@Data
public class SungJukOutput implements SungJuk{
	private List<SungJukDTO2> list;
	@Override
	public void execute() {
		System.out.println();
		for(SungJukDTO2 sungJukDTO2 : list) {
			System.out.println(sungJukDTO2);
		}
	}


}
