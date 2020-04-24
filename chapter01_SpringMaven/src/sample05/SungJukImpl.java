package sample05;

import java.text.DecimalFormat;
import java.util.Scanner;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SungJukImpl implements SungJuk {
    String name;
    int kor, eng, math, total;
    double  avg;
    
	public SungJukImpl() {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력: ");
		name = scan.nextLine();
		System.out.print("국어 입력: ");
		kor = scan.nextInt();
		System.out.print("영어 입력: ");
		eng = scan.nextInt();
		System.out.print("수학 입력: ");
		math = scan.nextInt();
		scan.close();
	}
	public void calc() {
        total = kor + eng + math;
        avg = total/3.0;
	}

	@Override
	public void display() {
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+df.format(avg));

	}

}
