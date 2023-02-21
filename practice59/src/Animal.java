//컴퓨터학과_20220740_가유빈
public class Animal {
	private double weight;
	String picture;
	String rslt = "";
	
	public void setWeight(double weight) {this.weight = weight;}
	public double getWeight() {return weight;}
	private String printMsg() {
		return("eat()가 호출되었음");
	}
	void eat() {
		String msg = printMsg();
		System.out.print(msg);
	}
	void sleep() {
		System.out.print("sleep()가 호출되었음");
	}
	public String toString() {
		rslt += "몸무게: " + getWeight();
		rslt += " - 그림 설명: " + picture;
		
		return rslt;
	}
}
