package Ch02;

public class C04TypeChange {

	public static void main(String[] args) {
		
		// 정수 연산식 자동형변환(int 보다 작은 변수 자료형간의 산술연산시 -> int 로 자동형변환)
		// byte , short , char
		byte x = 10;
		byte y = 20;
		byte result = x + y;	// 왜?
		int result2 = x + y;	// ?

	}

}
