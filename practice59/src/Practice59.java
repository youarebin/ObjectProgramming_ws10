//컴퓨터학과_20220740_가유빈
import java.util.Scanner;
public class Practice59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Animal a = new Animal();
		System.out.println("Animal 객체 animal을 생성합니다.");
		System.out.print("사진에 추가할 문장을 입력하세요: ");
		String p = sc.next();
		a.picture = p;
		System.out.print("몸무게를 입력하세요: ");
		a.setWeight(sc.nextDouble());
		a.eat();
		
		Lion l = new Lion();
		System.out.println("\nLion 객체 buba를 생성합니다.");
		System.out.print("사진에 추가할 문장을 입력하세요: ");
		String p1 = sc.next();
		l.picture = p1;
		System.out.print("몸무게를 입력하세요: ");
		l.setWeight(sc.nextDouble());
		l.roar2();
		
		Eagle e = new Eagle();
		System.out.println("\nEagle 객체 paco 를 생성합니다");
		System.out.print("사진에 추가할 문장을 입력하세요: ");
		String p2 = sc.next();
		e.picture = p2;
		System.out.print("몸무게를 입력하세요: ");
		e.setWeight(sc.nextDouble());
		e.fly2();
		
		System.out.println("\nAnimal 객체 animal의 정보입니다.");
		System.out.print(a.toString());
		System.out.println("\nLion 객체 buba의 정보입니다.");
		System.out.print(l.toString());
		System.out.println("\nEagle 객체 paco의 정보입니다.");
		System.out.print(e.toString());
		
	}

}
