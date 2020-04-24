package sample05;

import java.util.List;
import java.util.Scanner;

import lombok.Data;

@Data
public class SungJukModify implements SungJuk {
	private List<SungJukDTO2> list;
	private SungJukDTO2 sungJukDTO2;
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		System.out.print("수정할 이름 입력: ");
		String name = scan.next();
		int index = -1;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("찾고자하는 이름이 없습니다.");
		}else {
			System.out.print("국어점수 입력: ");
			int kor = scan.nextInt();
			System.out.print("영어점수 입력: ");
			int eng = scan.nextInt();
			System.out.print("수학점수 입력: ");
			int math = scan.nextInt();
			int tot = kor+eng+math;
			double avg = tot/3.0;
			sungJukDTO2 = list.get(index);
			sungJukDTO2.setKor(kor);
			sungJukDTO2.setEng(eng);
			sungJukDTO2.setMath(math);
			sungJukDTO2.setTot(tot);
			sungJukDTO2.setAvg(avg);
			System.out.println(sungJukDTO2.getName()+"님의 데이터를 수정했습니다.");
		}
	}

}
