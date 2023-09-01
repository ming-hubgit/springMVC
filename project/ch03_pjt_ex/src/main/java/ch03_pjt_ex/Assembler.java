package ch03_pjt_ex;

import java.util.Scanner;

public class Assembler {
	GreetingPrinter gp;
	Korean kr;
	English en;
	
	public Assembler(Korean kr, English en, GreetingPrinter gp) {
		this.kr = kr;
		this.en = en;
		this.gp = gp;
	}
	
	public void print() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n == 1) {
			gp.printer(kr);
		}else {
			gp.printer(en);
		}
		sc.close();
	}
	

}
