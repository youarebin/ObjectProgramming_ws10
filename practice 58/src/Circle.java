//컴퓨터학과_20220740_가유빈
public class Circle extends Shape{
	int radius;
	
	void setRadius(int radius) {
		this.radius = radius;
	}
	public Circle() {
		x = 0;
		y = 0;
	}
	double getArea() {
		return 3.14 * radius * radius;
	}
	
	public void draw() {
		String rslt = "";
		
		rslt += "(" + x + ", " + y + ") :: ";
		rslt += "반지름: " + radius;
		
		System.out.print(rslt);
		System.out.print(" :: 면적: " + String.format("%.2f",getArea()));
		System.out.print(" :: 둘레: " + String.format("%.2f",2 * 3.14 * radius));

	}
	
	public static int compareArea (Circle c1, Circle c2) {
		if(c1.getArea() > c2.getArea())
			return 1;
		else if(c1.getArea() == c2.getArea())
			return 0;
		else
			return -1;
	}

}
