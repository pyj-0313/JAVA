package Ch01;

//학생이 서점주인에게 책 1권을 구매한다
//클래스 	: 학생
//속성 	: 보유금액
//		: 책개수
//기능 	: 구매하기(서점주인, 보유금액의 일부)
//
//클래스 	: 서점주인
//속성	: 보유금액
//		: 책개수
//		: 책가격
//기능	: 판매하기(구매자의 돈) : 책개수

//
//클래스 	: 학생(Student)
//속성 	: 보유금액(myMoney : int)
//		: 책개수(bookCnt : int)
//
//기능 	: 구매하기(서점주인, 보유금액의 일부)
//		: buy(BookSeller seller , int money) : void
//
//
//클래스 	: 서점주인(BookSeller)
//속성	: 보유금액(myMoney : int)
//		: 책개수(bookCnt : int)
//		: 책가격(price : int)
//
//기능	: 판매하기(구매자의 돈) : 책개수
//		  sell(int money) : int

	//클래스
class Student {
	int myMoney;
	int bookCnt;

	//생성자
	public Student(int myMoney, int bookCnt) {
		super();
		this.myMoney = myMoney;
		this.bookCnt = bookCnt;
		
	}
	//메서드
	void buy(BookSeller seller, int money) {
		//내돈에서 구매의사 금액만큼 차감(내보유금액-구매의사금액)
		myMoney-=money;
		//서점주인에게 구매의사금액 전달
		//서점주인은 학생에게 책개수 전달
		int receivedBookCnt = seller.sell(money);
		//책개수를 현재 책보유개수에 누적
		this.bookCnt+=receivedBookCnt;
	}
	@Override
	public String toString() {
		return "Student [myMoney=" + myMoney + ", bookCnt=" + bookCnt + "]";
	}
}
	//클래스
class BookSeller{
	int myMoney;
	int bookCnt;
	int price;
	//메서드
	int sell(int money) {
		//학생에게로 부터 받은 금액을 내 보유금액에 누적
		this.myMoney+=money;
		//학생에게 받은 금액만큼 책 개수를 계산
		int allbookCnt = money/price;
		//서점주인의 보유책 개수에서 차감
		bookCnt-=allbookCnt;
		//계산된 책을 반환
		return allbookCnt;
	}
	
	//생성자
	public BookSeller(int myMoney, int bookCnt, int price) {
		super();
		this.myMoney = myMoney;
		this.bookCnt = bookCnt;
		this.price = price;
		
	}

	
	@Override
	public String toString() {
		return "BookSeller [myMoney=" + myMoney + ", bookCnt=" + bookCnt + ", price=" + price + "]";
	}

}


public class C13Ex {

	public static void main(String[] args) {
		//학생
		Student 홍길동 = new Student(10000,0); //보유금액:50000원(5만원), 현재 보유중인 책 수량 0개
		
		//서점주인
		BookSeller 주인 = new BookSeller(50000,10,1000); //보유금액 100000원(10만원), 보유중인 책 수량 50개, 책 개당 가격 1000원
		홍길동.buy(주인,1000); //홍길동이 서점주인에게 책 1권을 구매한다
		
		System.out.println(홍길동); //보유금액:50000-20000=30000원, 보유중인 책 수량 20개 
		System.out.println(주인); //보유금액:100000+20000=120000원, 보유중인 책 수량 50-20=30개
	}

}