import java.util.Scanner;

public class Practice60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setName(sc.next());
		s1.setYear(sc.nextInt());
		s2.setName(sc.next());
		s2.setYear(sc.nextInt());
		
		System.out.println(s1.getName()+" 학생은 "+ s1.getYear()+"학년입니다.");
		System.out.println(s2.getName()+" 학생은 "+ s2.getYear()+"학년입니다.");
	}

}
