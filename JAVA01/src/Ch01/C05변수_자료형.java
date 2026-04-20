package Ch01;

import java.nio.charset.StandardCharsets;

public class C05변수_자료형 {

	public static void main(String[] args) {
		//--------------------
		//정수 int - 4byte 정수 부호 o
		//--------------------
//		int n1 = 0b10101101;
//		int n2 = 173;			//10진수값
//		int n3 = 0255;			//8진쉬
//		int n4 = 0xad;			//16진수
//		System.out.printf("%d %d %d %d\n",n1,n2,n3,n4);

		
		//--------------------
		//정수 byte - 1byte 정수 부호 o
		//--------------------
		// 형변환 / 강제 형변환
//		byte n5 = (byte)-129;		//?
//		byte n6 = -30;
//		byte n7 = 30;
//		byte n8 = 127;
//		byte n9 = 129;		//?
//		System.out.println("n5 : " + n5);
//		System.out.println(Integer.toBinaryString(-129)); // 01111111
//		System.out.println("n6 : " + n6);
//		System.out.println(Integer.toBinaryString(-30)); // 11100010
		
		//--------------------
		//정수 short-2byte정수 부호 o | char-2byte정수 부호 x(양수만)
		//--------------------
//		char n1 = 65535;  //	(0~2^16-1)	(0~65535)양수최대값
//		short n2 = 32767; //	(-2^15 ~ +2^15-1)(-32768 ~ + 32767)
		
//		System.out.println("n1 : " + n1);   //왜 0이 나올까요?
//		char n3 = 100;
//		int  n5 = 100;
//		byte n6 = 100;
//		System.out.println("n1 : " + n1);
//		short n4 = (short)n1; 			//문제발생... 왜??
		
//		System.out.printf("%d\n",n4);
//		System.out.println(Integer.toBinaryString(65535));
		
		//--------------------
		//정수 long-8byte 정수 부호 o
		//--------------------
		
//		long n1 = 2150000000L;	//10억
//		long n2 = 20;	//L,1 (리터럴접미사) : long 자료형 사용하여 값 저장 (자동 형변환)
		
		// l,L 대소문자 구별 없이 사용
//		long n3 = 1000000000l;//문제발생.. 왜?
//		long n4 = 1000000000L;
		
		//---------------------
		//실수
		//---------------------
		//유리수와 무리수 통칭
		//소숫점이하값을 가지는 수 123.456
		//float : 4byte 실수(6-9자리)
		//double : 8byte 실수(15-18자리),기본자료형
		
		//정밀도 확인
//		float n1 = 0.123456789123456789F; //f,F:float형 접미사
//		double n2 = 0.123456789123456789;
		
//		System.out.println(n1);
//		System.out.println(n2);
		
		//오차 확인
//		float num = 0.1F;
//		for(int i=0; i<=1E5; i++) {
//				num=num+0.1F;
//				System.out.println(i);
//		}
//		System.out.println("num : " + num);
		
		
//		//--------------------
//		//단일문자 char 2byte 정수
//		//--------------------
//		char ch1 = 'a';
//		System.out.println(ch1);
//		System.out.println((int)ch1);
//		System.out.println(Integer.toBinaryString(ch1));
//		System.out.println("------------------");
		
//		char ch2 = 98;
//		System.out.println(ch2);
//		System.out.println((int)ch2);
//		System.out.println(Integer.toBinaryString(ch2));
//		System.out.println("------------------");
		
//		char ch3 = 'b' + 1;
//		System.out.println(ch3);
//		System.out.println((int)ch3);
//		System.out.println(Integer.toBinaryString(ch3));
//		System.out.println("------------------");
		
//		System.out.println((char)0b1010110000000000);
//		char ch4 = 0xac02;
//		System.out.println(ch4);
//		System.out.println((int)ch4);
//		System.out.println(Integer.toBinaryString(ch4)); //1010 1100 0000 0010
		
//		System.out.println("------------------");
		// \\u : 유니코드 이스케이프문자
//		System.out.printf("%c\n", 0xac03); //ac03은 갃의 유니코드
//		System.out.printf("%c\n", '\uac03');
	
		//-------------------
		//boolean : 논리형(true/false 저장)
		//-------------------
//		boolean flag = (10>11);		// 거짓(부정)
//		if(flag)
//		{
//			System.out.println("참인경우 실행");
//		}
//		else
//		{
//			System.out.println("거짓인경우 실행");
//		}
		
		//--------------------
		//문자열 : String (클래스자료형)
		//--------------------
		//기본자료형(원시타입)
		//byte n1;
		//short n2;
		//double n3;
		//long n4;
		
		//클래스자료형
		//클래스자료형으로 만든변수는 '참조변수'라고 하고
		//참조변수는 데이터가 저장된 위치정보(메모리주소값)이 저장된다.
		int n1 = 10;
		byte n2 = 20;
		char n3 = 40;
		
		String name = "홍길동"; //클래스자료형을 쓰는 순간 객체임
		String job = "프로그래머"; // 한글 문자열 하나당 3바이트 기존공간에서 추가가 아니라 새로운 공간을 사용 그래서 메모리 비효율적임 그래서 나온게 다양한 클래스들
		
		System.out.println("UTF-8기준 지정 크기: " + name.getBytes(StandardCharsets.UTF_8).length);
		System.out.println("UTF-8기준 지정 크기: " + job.getBytes(StandardCharsets.UTF_8).length);

		
		// 사이즈 확인
		char ch = '홍';		//16bit == 2byte 사용
		String str= "홍";	//24bit == 3byte 사용
		
		System.out.println("ch 실제 크기(bit): " + Integer.toBinaryString(ch).length());
		System.out.println("str 실제 크기(byte): " + str.getBytes(StandardCharsets.UTF_8).length);
		
		
		
		
		
	}

}
