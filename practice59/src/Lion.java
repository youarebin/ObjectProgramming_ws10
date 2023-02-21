//컴퓨터학과_20220740_가유빈
public class Lion extends Animal{
	private int legs = 4;
	
	void roar() {
		System.out.print("roar()가 호출되었음");
	}
	void roar2() {
		eat();
		System.out.print(" : ");
		roar();
	}
	public String toString() {
		rslt += "몸무게: " + getWeight();
		rslt += " - 그림 설명: " + picture;
		rslt += "- 다리: " + legs + "개";
		
		return rslt;
	}
}
