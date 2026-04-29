package Ch06;

//일반 클래스상속관계
class Parent1 {
	// 완성? 미완성?
	void func() {
	}
}

class Son1 extends Parent1 {
	void func() {
		System.out.println("Son1's 에서 재정의한 func..");
	}

}

//추상클래스 상속관계
abstract class Parent2 {

	abstract void func(); // 추상 클래스 //강제조항 //구현전에 설계를 먼저하는 것
}

class Son2 extends Parent2 {

	@Override
	void func() {
		System.out.println("Son2's 에서 재정의한 func.."); // 추상메서드 재정의
	}

}

class Son3 extends Parent2 {
	
	@Override
	void func() {
		System.out.println("Son3's 에서 재정의한 func.."); // 추상메서드 재정의
	}
}

public class C01AbstractMain {

	public static void main(String[] args) {
		// 일반 클래스 간 상속관계
//		Parent1 ob1 = new Parent1(); // 상위클래스형 객체 생성 가능함 o
//		Son1 ob2 = new Son1(); // 하위클래스형 객체 생성 가능함 o
//		Parent1 ob3 = new Son1(); // UPCASTING 연결 o
//		ob3.func(); // 재정의된 func() 접근가능 o

		// 추상클래스 상속관계
		// Parent2 ob4 = new Parent2(); // 상위클래스형 객체 생성 불가능 x 미완성된 추상메서드 때문에 불가능
		Son2 ob5 = new Son2(); // 하위클래스형 객체 생성 가능 o 조건(상위클래스의 추상메서드를 재정의 해야 객체 생성 가능)
		Parent2 ob6 = new Son2(); // UPCASTING 연결가능 o
		ob6.func();
		ob6 = new Son3();
		ob6.func();

	}

}
