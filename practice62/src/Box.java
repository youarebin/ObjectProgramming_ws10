//컴퓨터학과_20220740_가유빈
public class Box {
	private int x, y, z;
	private boolean empty;
	
	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}
	public void setZ(int z) {this.z = z;}
	
	public int getX() {return x;}
	public int getY() {return y;}
	public int getZ() {return z;}
	
	public void fillBox() {
		empty = false;
	}
	public void emptyBox() {
		empty = true;
	}
	public Box(int x, int y, int z) {
		empty = true;
		setX(x);
		setY(y);
		setZ(z);
	}
	public Box() {
		//this(0, 0, 0);
		empty = true;
	}
	public String toString() {
		String rslt = "";
		
		rslt += "가로: " + getX();
		rslt += ", 세로: " + getY();
		rslt += ", 높이: " + getZ();
		
		return rslt;
	}
	public int getVolume() {
		return getX()*getY()*getZ();
	}
	public double getWeight () {
		return getX()*getY()*getZ()*1.1;
	}
}
