package Ch05;


class Super{
	int n1;
	
}
class Sub extends Super{
	int n2;
}

public class C06UpDownCastingMain {

	public static void main(String[] args) {
		//casting : 클래스 형변환
		
		//Nocasting : 형변환 x
		Super ob1 = new Super();
		ob1.n1 = 10;
		
		Sub ob2 = new Sub();
		ob2.n1 = 10;
		ob2.n2 = 20;
		
		//Upcasting[★★★★★] 	: 상위클래스형 참조변수 = 하위클래스형 객체
		//					: 자동형변환(메모리 영역의 침범우려 우려가 없기 때문에)
		//이유				: 1) !상속관계로 구성된 모든 하위객체를 연결할 수 있다
		//					: 2) !Upcasting된 상태에서는 재정의된 메서드(함수)에 접근 가능하다
		
		Super ob3 = new Sub(); // UPCASTING
		ob3.n1 = 10;
		//ob3.n2 = 20;		// x 접근할 수 없다
		
		Super ob4 = ob2; 	// UPCASTING
		ob4.n1=100;
//		ob4.n2=200;			//ob4에서는 n2 접근 불가능
		
		
		//Downcasting[★★★★]	: 하위클래스형 참조변수 = 상위클래스형 객체
		//					: 강제형변환
		//					: Upcasting을 전제로 작업을 진행하는 경우가 많다
		
//		Sub ob5 = (Sub)new Super();
//		ob5.n1 = 100;
//		ob5.n2 = 200; //실제 Super에는 n2 공간이 없기 때문에 오류가 나옴 컴파일수준에서는 에러가 안나옴 런타임에러발생
		
		Sub down = (Sub)ob4;		//
		down.n1=100;
		down.n2=200;
		
	}

}
