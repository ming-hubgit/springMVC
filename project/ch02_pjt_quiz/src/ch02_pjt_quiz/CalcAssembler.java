package ch02_pjt_quiz;

public class CalcAssembler {
	
	  ICalculator calculator;

	  public static ICalculator assemble(char operator) {
	    switch (operator) {
	    case '+':
	      return new Add();

	    case '-':
	      return new Subtract();

	    case '*':
	      return new Multiply();

	    case '/':
	      return new Divide();

	    case '%':
	      return new Modulo();
	    default:
	      return null;
	    }
	  }
	
	//자바 17버전부터 가능
//	ICalculator calculator;
//	
//	public static ICalculator assemble(char operator) {
//		return switch (operator) {
//			case '+' -> new Add();
//			case '-' -> new Subtract();
//			case '*' -> new Multiply();
//			case '/' -> new Divide();
//			case '%' -> new Modulo();
//			default -> throw new IllegalArgumentException();
//		};
//	}
}