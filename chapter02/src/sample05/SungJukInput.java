package sample05;

import java.util.List;
import java.util.Scanner;

import lombok.Setter;

@Setter
public class SungJukInput implements SungJuk {
    private List<SungJukDTO2> list;
    private SungJukDTO2 sungJukDTO2;
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력: ");
		sungJukDTO2.setName(scan.next());
		System.out.print("국어점수 입력: ");
		sungJukDTO2.setKor(scan.nextInt());
		System.out.print("영어점수 입력: ");
		sungJukDTO2.setEng(scan.nextInt());
		System.out.print("수학점수 입력: ");
		sungJukDTO2.setMath(scan.nextInt());
		
		int tot = sungJukDTO2.getKor() + sungJukDTO2.getEng() + sungJukDTO2.getMath();
		sungJukDTO2.setTot(tot);
		sungJukDTO2.setAvg(tot/3.0);
		list.add(sungJukDTO2);
		System.out.println(sungJukDTO2.getName()+"님의 데이터를 입력하였습니다.");
	}


}
