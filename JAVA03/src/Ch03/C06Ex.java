package Ch03;

//https://velog.io/@9to0/%EC%9E%90%EB%B0%94%EC%9D%98-%EC%A0%95%EC%84%9D-3%ED%8C%90-12-%EC%97%B0%EC%8A%B5%EB%AC%B8%EC%A0%9C-%EC%A0%9C%EB%84%A4%EB%A6%AD%EC%8A%A4-%EC%97%B4%EA%B1%B0%ED%98%95-%EC%95%A0%EB%84%88%ED%85%8C%EC%9D%B4%EC%85%98
//----------------------------------------------------------- 
//문제: [12-1] 클래스 Box가 다음과 같이 정의되어 있을 때, 다음 중 오류가 발생하는 문장은? 경고가 발생하는 문장은?
//-----------------------------------------------------------
class Box<T> { // 지네릭 타입 T를 선언
	T item;

	void setItem(T item) {
		this.item = item;
	}

	T getItem() {
		return item;
	}
}
// a.Box<Object> b = new Box<String>(); // 에러. 참조변수와 생성자의 제네릭은 동일해야 함.
// b.Box<Object> b = (Object) new Box<String>(); // (타입 불일치) 에러. Object타입을 Box<Object>타입의 참조변수에 저장불가.
// c.new Box<String>().setItem(new Object()); // 에러. 대입된 타입이 String이므로, setItem(T item)의 매개변수 역시, String타입만 허용한다.
// new Box<String>().setItem("ABC"); // OK, 대입된 타입인 String과 일치하는 타입을 매개변수로 지정했기 때문에 OK.
//
// -----------------------------------------------------------


//[12-2] 지네릭 메서드 makeJuice()가 아래와 같이 정의되어 있을 때, 이 메서드를 올바르게 호출한 문장을 모두 고르시오.
//(Apple과 Grape는 Fruit의 자손이라고 가정하자.)

//class Juicer {
// static <T extends Fruit> String makeJuice(FruitBox<T> box) {
//     String tmp = "";
//     for (Fruit f : box.getList()) tmp += f + " ";
//     return tmp;
// }
//}

//     a.	Juicer.<Apple>makeJuice(new FruitBox<Fruit>()); 
			// 에러. 제네릭 메서드에서 대입된 타입이 Apple이므로, 이 메서드의 매개변수는 'FruitBox<Apple>'타입이 된다.
			//new FruitBox<Fruit>()는 매개변수의 타입과 일치하지 않으며, 자동형변화도 불가능한 타입이므로 에러이다.
//     b.	Juicer.<Fruit>makeJuice(new FruitBox<Grape>());
			// Grape가 Fruit의 자손이라고 해도, 타입이 다르기 때문에 같은 이유로 에러
//     c.	Juicer.<Fruit>makeJuice(new FruitBox<Fruit>()); 
			// OK
//     d.	Juicer.makeJuice(new FruitBox<Apple>());		
			// OK. 제네릭 메서드의 타입 호출이 생략된 형태, 생략하지 않았다면, 'Juicer.<Apple>makeJuice(new FruitBox<Apple>());'과 같다. 대부분 이처럼 생략함.
//     e.	Juicer.makeJuice(new FruitBox<Object>());
			// 에러. 제네릭 메서드의 타입 호출이 생략되지 않았다면 'Juicer.<Object>makeJuice(new FruitBox<Object>());'과 같다. 타입은 일치하지만 <T extends Fruit> 제한이 걸려 있으므로 T는 Fruit의 자손이어야함.
// 정답 : c, d 
//-----------------------------------------------------------
////[12-3] 다음 중 올바르지 않은 문장을 모두 고르시오.
//
//    a.	Box<?> b = new Box();
	  		// OK. Box<?>는 Box<? extends Object>를 줄여쓴 것. 객체 생성에 제너릭 타입을 지정해 주지 않았지만 문제가 되지 않는다. new Box() 대신 new Box()를 사용하는 것이 좋다.
//    b.	Box<?> b = new Box<>();
			// OK. new Box<>();는 타입을 생략한 것으로, 일반적으로는 참조변수의 타입과 같은 타입으로 간주됨. 참조변수의 타입이 <?>, 즉 <? extends Object>이므로 생략된 타입은 Object이라고 생각하기 쉬운데
			// 여기서는 제네릭 클래스 Box에 정의된 타입이 <T extends Fruit>와 같이 제한되어 있기 때문에, 'Object'가 아니라 'Fruit'이 생략된 것으로 봐야한다. Object는 Fruit의 자손이 아니기 때문이다.
//    c.	Box<?> b = new Box<Object>();
			// 에러. b 설명 참조
//    d.	Box<Object> b = new Box<Fruit>();
			// 에러. 타입 불일치
//    e.	Box	b = new Box<Fruit>();
			// OK. 바람직하지 않음 'Box<?> b' 가 더 나음
//    f.	Box<? extends Fruit> b = new Box<Apple>();
			// OK.
//    g.	Box<? extends Object> b = new Box<? extends Fruit>();
			// 에러. new연산자는 타입이 명확해야하므로 와일드 카드와 같이 사용불가
// 정답 : c, d, g
//-----------------------------------------------------------

//[12-4] 아래의 메서드는 두 개의 ArrayList를 매개변수로 받아서,
//하나의 새로운 ArrayList로 병합하는 메서드이다.
//이를 지네릭 메서드로 변경하시오.

//public static ArrayList<?extends Product> merge( ArrayList<?extends Product> list, ArrayList<?extends Product> list2)
//{
//  ArrayList<?extends Product> newList = new ArrayList<>(list);
//  newList.addAll(list2);
//  return newList;
//}


public class C06Ex {

	public static void main(String[] args) {


	}

}