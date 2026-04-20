package Ch02;

public class C07TypeChange_String {

	public static void main(String[] args) {
		//-------------------------
		// 문자열 + 문자열
		//-------------------------
		System.out.println("문자열1" + "문자열2");			// 문자열 + 문자열
		System.out.println("문자열1" + ',' + "문자열2");	// 문자열 + 문자 + 문자열
		System.out.println("문자열1" + 2);				// 문자열 + 숫자 ->숫자를 문자열로 해석! 단순연결
		System.out.println( "문자열"+','+'!');
		System.out.println(','+'!'+"문자열");				// (int)',' = 44 / (int)'!' = 33
		System.out.println("문자열1" + "문자열2");

	}

}
