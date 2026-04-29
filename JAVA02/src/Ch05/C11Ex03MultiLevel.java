package Ch05;

// Exercise 3: Multi Level
class Shape {
    void draw() {
        System.out.println("도형을 그립니다");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("원을 그립니다");
    }
    
    void calculateArea() {
        System.out.println("원의 넓이를 계산합니다");
    }
}

class ColoredCircle extends Circle {
    void draw() {
        System.out.println("색칠된 원을 그립니다");
    }
    
    void applyColor() {
        System.out.println("원에 색을 칠합니다");
    }
}

public class C11Ex03MultiLevel {
    public static void main(String[] args) {
        System.out.println("=== 연습문제 3: 다중 레벨 ===");
        // 문제: 다음 단계를 수행하는 코드를 작성하세요
        // 1. ColoredCircle 인스턴스를 생성하고 Shape 타입으로 업캐스팅하세요
        ColoredCircle num1 = new ColoredCircle();
        Shape num2 = new ColoredCircle();
        // 2. 업캐스팅된 참조로 draw() 메서드를 호출해보세요
        num2.draw();
        // 3. Shape -> Circle로 다운캐스팅하고 calculateArea() 메서드를 호출해보세요
        Circle num3 = (Circle)num2;
        num3.calculateArea();
        // 4. Circle -> ColoredCircle로 다운캐스팅하고 applyColor() 메서드를 호출해보세요
        ColoredCircle num4 = (ColoredCircle)num3;
        num4.applyColor();
        System.out.println("----------");
        
        // 5. 각 단계에서 어떤 메서드에 접근 가능한지 확인해보세요
        num1.applyColor(); //"원에 색을 칠합니다"
        num1.calculateArea(); //"원의 넓이를 계산합니다"
        num1.draw(); //"색칠된 원을 그립니다"
        System.out.println("----------");
        num2.draw(); //"색칠된 원을 그립니다"
        System.out.println("----------");
        num3.calculateArea(); // "원을 넓이를 계산합니다"
        num3.draw(); //"색칠된 원을 그립니다"
        System.out.println("----------");
        num4.applyColor(); //"원에 색을 칠합니다"
        num4.calculateArea(); //"원의 넓이를 계산합니다"
        num4.draw(); //"색칠된 원을 그립니다"

        // 실행 결과 예시:
        // 색칠된 원을 그립니다
        // 원의 넓이를 계산합니다
        // 원에 색을 칠합니다
        
   
    }
} 