package sample03;

import java.text.DecimalFormat;
import java.util.Scanner;

import lombok.AllArgsConstructor;


//Constructor Injection
@AllArgsConstructor
public class SungJukImpl implements SungJuk {
	private SungJukDTO sungJukDTO;
    
	@Override
	public void calcTot() {
		sungJukDTO.setTot(sungJukDTO.getKor()+sungJukDTO.getEng()+sungJukDTO.getMath()); 
	}
	public void calcAvg() {
		sungJukDTO.setAvg(sungJukDTO.getTot()/3.0);
	}
	public void display() {
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(sungJukDTO);
	}
	public void modify() {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력: ");
		sungJukDTO.setName(scan.next());
		System.out.print("국어 입력: ");
		sungJukDTO.setKor(scan.nextInt());
		System.out.print("영어 입력: ");
		sungJukDTO.setEng(scan.nextInt());
		System.out.print("수학 입력: ");
		sungJukDTO.setMath(scan.nextInt());
	}

}
