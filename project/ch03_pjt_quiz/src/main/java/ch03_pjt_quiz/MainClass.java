package ch03_pjt_quiz;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
	    GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
	    
	    Hello hello = ctx.getBean("hello", Hello.class);
	    //Bean 연결해줌
	    
	    hello.sayHello();
	    hello.selectHello();
	    
	    ctx.close();
	}

}