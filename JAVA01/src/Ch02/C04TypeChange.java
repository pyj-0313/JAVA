package Ch02;

public class C04TypeChange {

	public static void main(String[] args) {
		
		// 정수 연산식 자동형변환(int 보다 작은 변수 자료형간의 산술연산시 -> int 로 자동형변환)
		// byte , short , char
//		byte x = 10;
//		byte y = 20;
//		byte result = (byte)(x + y);	// 왜? int로 자동형변환이 발생되기 때문에 byte로 결과값을 강제형변환 시켜야 표현 가능하다.
//		int result2 = x + y;	// ?

//		// 정수 연산식 자동형변환(int 보다 큰 변수 자료형간의 산술연산시 -> 큰 자료형(long)으로 자동형변환)
		byte var1 = 10;
		int var2 = 100;
		long var3 = 1000L;
		int result = (int)(var1 + var2 + var3); // 왜? var3는 int값 보다 큰 값으로 long으로 자동형변환 되기 때문에 결과값을 int로 강제형변환 시켜야 한다

		// 실수 연산식
		// 큰 타입으로 자동 형 변환
		//byte > short,char > int > long > float > double
		int intvar = 10;
		float flvar = 3.3F;
		double dbvar = 5.5;
		int result3 = (int)(intvar + flvar + dbvar);	//intvar , flvar 가 각각 double 형으로 형변환됨
		double result4 = intvar + flvar + dbvar;
		System.out.println(result3); // result3 값을 int형으로 강제 형변환하여 정수로만 표현하기 때문에 10 + 3 + 5 = 18
		

	}

}
