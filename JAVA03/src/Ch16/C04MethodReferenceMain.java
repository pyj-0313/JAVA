package Ch16;

import java.util.ArrayList;

//(1) 문자열 -> 정수 변환
interface StrToInt {
	int convert(String s);
}

//(2) 문자열을 받아 출력만 (반환 없음)
interface StrConsumer {
	void accept(String s);
}

//(2-2) 테스트 클래스
class C04Person{
	
	static void print(String s) {
		System.out.println("Person's print : " + s);
	}
}

//(2-3) 테스트 클래스
class C04Person2{
	String name;
	int age;
	C04Person2(){}
	C04Person2(String name, int age){
		this.name = name;
		this.age = age;
	}
}



//(3) 문자열 -> 변형된 문자열 반환
interface  StrTostr{
	String apply(String s);
}

//(4) 두 문자열 비교 -> 정수 결과
interface PersonFactory {
	C04Person create();
}
interface PersonFactory2{
	C04Person2 create(String name, int age);
}
interface ListFactory{
	ArrayList<String> create();
}

public class C04MethodReferenceMain {
	// 정적 메서드 참조 실습용
	public static int toLength(String s) {
		return s.length();
	}

	public static void main(String[] args) {
		//(1) 문자열 -> 정수 변환
		StrToInt t1 = s -> Integer.parseInt(s); // 람다
		StrToInt t2 = Integer::parseInt; // 메서드참조형(::)
//		StrToInt t3 = (s)->{return C04MethodReferenceMain.toLength(s);};
		StrToInt t3 = C04MethodReferenceMain::toLength; // 단축
		
		System.out.println("(1-1) 람다		; " + t1.convert("123"));
		System.out.println("(1-2) 메서드 참조 : " + t2.convert("456"));
		System.out.println("(1-3) 메서드 참조(기존함수) : " + t3.convert("456"));
		
		//(2) 문자열을 받아 출력만 (반환 없음)
		StrConsumer t4 = (s)->{System.out.println(s);}; 
		StrConsumer t5 = System.out::println; //단축
//		StrConsumer t6 = (s)->{C04Person.print(s);};
		StrConsumer t6 = C04Person::print; //단축
		
		t4.accept("(2-1) HELLO WORLD1");
		t5.accept("(2-2) HELLO WORLD2");
		t6.accept("(2-3) HELLO WORLD3");
		
		//(3) 문자열 -> 변형된 문자열 반환
		StrTostr t7 = (s)->{return s.toUpperCase();};
		StrTostr t8 = String::toUpperCase; // 단축
		
		System.out.println("(3-1) : " + t7.apply("hello"));
		System.out.println("(3-2) : " + t7.apply("hello"));
		
		//(4) 두 문자열 비교 -> 정수 결과
		PersonFactory t9 = ()->{return new C04Person();};
		PersonFactory t10 = C04Person::new; // 단축
		PersonFactory2 t11 = C04Person2::new;
		
		System.out.println(t9.create());
		System.out.println(t10.create());
		System.out.println(t11.create("홍길동",11));
		
		ListFactory t12 = ()->{return new ArrayList<>();};
		ListFactory t13 = ArrayList::new;
	}

}
