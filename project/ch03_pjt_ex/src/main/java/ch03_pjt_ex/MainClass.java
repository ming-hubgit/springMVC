package ch03_pjt_ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Select Language 1.Korea 2.English");
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");

		Assembler as = ctx.getBean("as", Assembler.class);

		as.print();

		ctx.close();
	}

}
