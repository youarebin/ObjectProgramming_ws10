//컴퓨터학과_20220740_가유빈
public class Practice61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaterialBox box1 = new MaterialBox(2,3,4,"wood");
		MaterialBox box2 = new MaterialBox(10,5,5,"paper");
		
		System.out.print("box1의 정보입니다.\n");
		System.out.println(box1.toString());
		System.out.println("재질: " + box1.getAttribute());
		System.out.println("부피: " + box1.getX()*box1.getY()*box1.getZ());
		System.out.println("무게: " + String.format("%.2f",box1.getX()*box1.getY()*box1.getZ()*1.1));
		
		System.out.print("\nbox2의 정보입니다.\n");
		System.out.println(box2.toString());
		System.out.println("재질: " + box2.getAttribute());
		System.out.println("부피: " + box2.getX()*box2.getY()*box2.getZ());
		System.out.println("무게: " + String.format("%.2f",box2.getX()*box2.getY()*box2.getZ()*1.1));
	}

}
