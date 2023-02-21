//컴퓨터학과_20220740_가유빈
public class Eagle extends Animal{
	private int wings = 2;
	
	void fly() {
		System.out.print("fly()가 호출되었음");
	}
	void fly2() {
		sleep();
		System.out.print(" : ");
		fly();
	}
	
	public String toString() {
		rslt += "몸무게: " + getWeight();
		rslt += " - 그림 설명: " + picture;
		rslt += "- 날개: " + wings + "개";
		
		return rslt;
	}
}
