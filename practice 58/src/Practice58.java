//컴퓨터학과_20220740_가유빈
import java.util.Scanner;
public class Practice58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Shape s = new Shape();
		System.out.println("Shape 객체 정보를 입력하세요.");
		System.out.print("x좌표: ");
		int x = sc.nextInt();
		s.x = x;
		System.out.print("y좌표: ");
		int y = sc.nextInt();
		s.y = y;

		Circle c1 = new Circle();
		System.out.println("첫번째 Circle 객체 정보를 입력하세요");
		System.out.print("x좌표: ");
		int x1 = sc.nextInt();
		c1.x = x1;
		System.out.print("y좌표: ");
		int y1 = sc.nextInt();
		c1.y = y1;
		System.out.print("반지름: ");
		int r1 = sc.nextInt();
		c1.radius = r1;
		
		Circle c2 = new Circle();
		System.out.println("두번째 Circle 객체 정보를 입력하세요");
		System.out.print("x좌표: ");
		int x2 = sc.nextInt();
		c2.x = x2;
		System.out.print("y좌표: ");
		int y2 = sc.nextInt();
		c2.y = y2;
		System.out.print("반지름: ");
		int r2 = sc.nextInt();
		c2.radius = r2;
		
		System.out.println("Shape 객체 정보입니다.");
		s.print();
		System.out.println("첫번째 Circle 객체 정보입니다.");
		c1.draw();
		System.out.println("두번째 Circle 객체 정보입니다.");
		c2.draw();
		
		if(Circle.compareArea(c1,c2) == 1)
			System.out.print("첫번째 원의 면적이 더 넓습니다.");
		else if(Circle.compareArea(c1,c2) == 0)
			System.out.print("두 원의 면적이 더 같습니다.");
		else
			System.out.print("두번째 원의 면적이 더 넓습니다.");
		
	}

}
