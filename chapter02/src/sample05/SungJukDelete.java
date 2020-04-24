package sample05;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import lombok.Data;

@Data
public class SungJukDelete implements SungJuk {

	private List<SungJukDTO2> list;
	private SungJukDTO2 sungJukDTO2;
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제 이름 입력: ");
		String name = scan.next();
		int sw = 0;
		Iterator<SungJukDTO2> iterator = list.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getName().equals(name)) {
				iterator.remove();
				sw=1;
				System.out.println(name+"님의 데이터를 삭제했습니다.");
			}
		}
		if(sw==0) System.out.println("찾고자하는 이름이 없습니다.");
	}

	

}
