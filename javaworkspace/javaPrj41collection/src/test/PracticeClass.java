package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import mob.Pokemon;

public class PracticeClass {
	
	//List
	public void method01() {
		System.out.println("------List------");
		List al = new ArrayList();
		
		Pokemon p = new Pokemon();
		int num = 10;
		String str = "hello";
		
		al.add(p); //p, num, str 세개를 넣어도 중복 가능 !!
		al.add(num);
		al.add(str);
		
//		System.out.println(al.get(0));
//		System.out.println(al.get(1));
//		System.out.println(al.get(2));
		
		System.out.println(al);  //tostring()
		
//		al.add(0,"안녕");
//		al.clear(); //내용을 지워주는 메소드
//		boolean result = al.contains(10);
//		System.out.println(result);
		
		System.out.println(al); //tostring()
	}
	
	public void method02() {
		System.out.println("------Set------");
		
		HashSet s = new HashSet();
		
		s.add("one");
		s.add("one");
		s.add("two");
		s.add("three");
		s.add(4);
		s.add(5);
		
		System.out.println(s);
	}
	
	public void method03() {
		System.out.println("------Map------");
	}
	
	public void method04() {
		System.out.println("------Stack------");
	}
	
	public void method05() {
		System.out.println("-------Queue------");
	}
}
