//컴퓨터학과_20220740_가유빈
public class MaterialBox extends Box{
	private String attribute;
	
	public void setAttribute(String attribute) {this.attribute = attribute;}
	public String getAttribute() {return attribute;}
	
	public MaterialBox(int x, int y, int z, String attribute) {
		setX(x);
		setY(y);
		setZ(z);
		this.attribute = attribute;
	}
}
