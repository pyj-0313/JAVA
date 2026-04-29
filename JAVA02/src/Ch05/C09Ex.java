package Ch05;


class Employee{
	//속성
	public String name;
	int age;
	String addr;
	//속성
	// 기본 생성자
	Employee(){} 
	// 모든 속성 받는 생성자
	public Employee(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	//기능
	public String getName() {
		return name;	
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	//toString()
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
}

class Parttimer extends Employee{
	//Parttimer클래스에서 추가된 속성
	private int hour_pay;
	//속성(부모클래스의 생성자 추가)
	public Parttimer(String name, int age, String addr,int hour_pay) {
		super(name,age,addr);
		this.hour_pay = hour_pay;
	}
	//getter
	public int getHour_pay() {
		return hour_pay;
	}
	//toString()
	@Override
	public String toString() {
		return "Parttimer [hour_pay=" + hour_pay + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
}

class Regular extends Employee{
	//Regular크랠스에서 추가된 속성
	private int salary;
	//속성(부모클래스의 생성자 추가)

	public Regular(String name, int age, String addr,int salary) {
		super(name,age,addr);
		this.salary = salary;
	}
	//getter
	public int getSalary() {
		return salary;
	}
	//toString()
	@Override
	public String toString() {
		return "Regular [salary=" + salary + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
}



public class C09Ex {
	
	public static void main(String[] args) {
		Parttimer emp1 = new Parttimer("홍길동", 25, "대구", 20000);
		
		
		Regular emp2 = new Regular("서길동", 45, "울산", 50000000);
		System.out.println(emp1);
		System.out.println(emp2);
		
	}
}


