package Ch02;

public class C02TypeChange {

	public static void main(String[] args) {
		//강제 형변환
		//좁은 범위 공간에 큰값을 넣으려고 하는경우
		//기본적으로 불가능하기 때문에 강제로 자료형을 바꾸어 전달한다.
		//데이터 손실의 염려가 있다.
		int intValue = 20000;
		char charValue = (char)intValue;
		System.out.println(charValue); // int는 4byte이고 char는 2byte이므로 큰 값을 작은 값에 넣을 수 없어 오류가 발생 / char로 강제 형변환
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue); // long은 8byte이고 int는 4byte이므로 큰 값을 작은 값에 넣을 수 없어 오류가 발생 / int를 사용해서 강제 형변환
		
		//데이터 손실!
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue); // double을 int로 강제 형변환해서 해결 

	}

}
