package ch02_pjt_01;

import java.util.Scanner;

public class CalAssembler {
	
	MyCalculator calculator;
	CalAdd calAdd;
	CalSub calSub;
	CalMul calMul;
	CalDiv calDiv;
	CalMod calMod;
	
	public CalAssembler() {
		calculator = new MyCalculator();
		calAdd = new CalAdd();
		calSub = new CalSub();
		calMul = new CalMul();
		calDiv = new CalDiv();
		calMod = new CalMod();
		
		assemble();
	}
	
	public void assemble() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자를 입력해주세요 : ");
		int num2 = sc.nextInt();
		
		System.out.print("Add - ");
		calculator.calculate(num1, num2, calAdd);
		System.out.print("Sub - ");
		calculator.calculate(num1, num2, calSub);
		System.out.print("Mul - ");
		calculator.calculate(num1, num2, calMul);
		System.out.print("Div - ");
		calculator.calculate(num1, num2, calDiv);
		System.out.print("Mod - ");
		calculator.calculate(num1, num2, calMod);
	}
}
