package Ch18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//(1) 인자o / 반환x - 표준 Consumer<String> 과 모양 같음
@FunctionalInterface // 함수형 인터페이스는 추상메서드를 하나만 넣을 수 있다.
interface Func1{
	void say(String message);
}

//(2) 가변인자 Integer... 받아 int 반환
@FunctionalInterface
interface Func2{
	int sum(Integer ...args);
}

//(3) 가변인자 Object... 받아 List<Integer> 반환
@FunctionalInterface
interface Func3{
	List<Integer> sum(Object ...args);
}

public class C01FunctionalInterfacemain {

	public static void main(String[] args) {
		
		//(1) 인자o / 반환x
		Func1 func1 = (message) -> System.out.println(message + "_!");
		func1.say("HELLO WORLD");

		//(2) 가변인자 Integer... 받아 int 반환
//		Func2 func2 = (arr)->{
//			return Arrays.stream(arr).reduce(0,(sum,item)->{return sum+item;});
//		};
		Func2 func2 = arr->Arrays.stream(arr).reduce(0,(sum,item)->sum+item); //줄이기
		
		System.out.println("func2(sum) = " + func2.sum(10, 20, 30, 40, 50, 60));
		
		//(3) 가변인자 Object... 받아 List<Integer> 반환
//		Func3 func3 = (arr)->{
//					return Arrays	.stream(arr)
//									.filter((el)->{return el instanceof Integer;}) //Integer가 맞는지 판별 true / false
//									.map((el)->{return (Integer)el;}) //Integer로 형변환
//									.collect(Collectors.toList());
//				};
		// 줄이기
		Func3 func3 = (arr)->Arrays .stream(arr)
									 .filter(el->el instanceof Integer) //Integer가 맞는지 판별 true / false
									 .map(el->(Integer)el) //Integer로 형변환
									 .collect(Collectors.toList());
	
		System.out.println("func3(sum) = " + func3.sum(10, 20, 30.5, "홍길동", true));	
	}
}

