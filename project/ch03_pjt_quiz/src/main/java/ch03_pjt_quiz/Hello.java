package ch03_pjt_quiz;

import java.util.Scanner;

public class Hello {
	
	public void sayHello() {
		System.out.println("Hello maven project!!");
	}
	
	public void selectHello() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select language! 1.korea, 2.english");
		int selectNum = sc.nextInt();
		
		if(selectNum == 1) {
			System.out.println("안녕하세요");
		}else {
			System.out.println("Hello");
		}
		sc.close();
		
	}

}
