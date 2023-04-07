package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.beans.TestBean4;
import kr.co.softsoldesk.beans.TestBean5;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("=================JAVA==================");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

		//type
		System.out.println("Type");
		TestBean1 java1 = ctx.getBean(TestBean1.class);
		System.out.println("java1 : " + java1);
		System.out.println("-------------------------------------------");
		
		//name
		System.out.println("Name");
		TestBean2 java2 = ctx.getBean("t3", TestBean2.class);
		System.out.println("java2 : " + java2);
		TestBean2 java3 = ctx.getBean("t4", TestBean2.class);
		System.out.println("java3 : " + java3);
		System.out.println("-------------------------------------------");
		
		//lazy
		System.out.println("Lazy");
		TestBean3 java4 = ctx.getBean(TestBean3.class);
		System.out.println("java4 : " + java4);
		System.out.println("-------------------------------------------");
		//singleton
		System.out.println("Scope prototype");
		TestBean4 java5 = ctx.getBean(TestBean4.class);
		System.out.println("java5 : " + java5);
		TestBean4 java6 = ctx.getBean(TestBean4.class);
		System.out.println("java6 : " + java6);
		System.out.println("-------------------------------------------");
		
		//post-construct | pre-destroy
		System.out.println("PostConstruct / PreDestroy");
		TestBean5 java7 = ctx.getBean(TestBean5.class);
		System.out.println("java7 : " + java7);
	
		
		ctx.close();
	}

}
