package Ch01;

//손님이 카페사장에게 커피 1잔을 주문한다
//클래스 	: 손님
//속성 	: 보유금액
//		: 커피잔수
//기능 	: 주문하기(카페사장, 보유금액의 일부)
//
//클래스 	: 카페사장
//속성	: 보유금액
//		: 커피재고
//		: 커피가격
//기능	: 제조하기(손님의 돈) : 커피잔수

//손님이 카페사장에게 커피 1잔을 주문한다
//
//클래스 	: 손님(Customer)
//속성 	: 보유금액(myMoney : int)
//		: 커피잔수(coffeeCnt : int)
//
//기능 	: 주문하기(카페사장, 보유금액의 일부)
//		: order(CafeOwner owner , int money) : void
//
//
//클래스 	: 카페사장(CafeOwner)
//속성	: 보유금액(myMoney : int)
//		: 커피재고(coffeeCnt : int)
//		: 커피가격(price : int)
//
//기능	: 제조하기(손님의 돈) : 커피잔수
//		  make(int money) : int
	//클래스
class Customer {
	int myMoney;
	int coFFeeCnt;
	//생성자
	public Customer(int myMoney, int coFFeeCnt) {
		super();
		this.myMoney = myMoney;
		this.coFFeeCnt = coFFeeCnt;
	}
	//매서드
	void order(CafeOwner owner, int money) {
		//내보유금액에서 커피 수량만큼의 금액 차감
		myMoney-=money;
		//카페사장님께 구매금액전달
		//카페사장님은 고객에게 커피수량전달
		int receivedcoFFeeCnt = owner.make(money);
		//손님은 보유커피수량만큼 누적
		this.coFFeeCnt+=receivedcoFFeeCnt;
	}

	@Override
	public String toString() {
		return "Customer [myMoney=" + myMoney + ", coFFeeCnt=" + coFFeeCnt + "]";
	}

}
	//클래스
class CafeOwner {
	int myMoney;
	int coffeeCnt;
	int price;
	//생성자
	public CafeOwner(int myMoney, int coffeeCnt, int price) {
		super();
		this.myMoney = myMoney;
		this.coffeeCnt = coffeeCnt;
		this.price = price;
	}
	//매서드
	int make(int money) {
		//손님에게 받은 금액만큼 내보유금액에 누적
		this.myMoney+=money;
		
		//손님에게 받은 금액만큼 커피수량 계산
		int allcoffeeCnt = money/price;
		
		//카페주인의 보유 커피 수량에서 차감
		coffeeCnt-=allcoffeeCnt;
		
		//계산된 커피를 반환
		return allcoffeeCnt;
	}

	@Override
	public String toString() {
		return "CafeOwner [myMoney=" + myMoney + ", coffeeCnt=" + coffeeCnt + ", price=" + price + "]";
	}
}

public class C14Ex {

	public static void main(String[] args) {
		//손님
		Customer 홍길동 = new Customer(5000,0); //보유금액 5000원, 보유중인 커피 0개
		
		//사장
		CafeOwner 영커피 = new CafeOwner(100000,10,2500); //보유금액 100000원(10만원), 보유중인 커피 10잔, 커피 1잔 당 2500원)
		
		//손님이 사장한테 커피 1잔(2500원)을 주문
		홍길동.order(영커피, 2500);
		
		System.out.println(홍길동); //보유금액 5000-2500=2500원, 보유중인 커피 0+1=1잔
		System.out.println(영커피); //보유금액 100000+2500=102500원(10만2천5백원), 보유중인 커피 10-1=9잔)
	}

}