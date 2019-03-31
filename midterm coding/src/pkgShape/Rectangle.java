package pkgShape;

public class Rectangle extends Shape {
	
	private int width;
	private int length;
		
	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int w) {
		width = w;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int l) {
		length = l;
	}
	
	
	
	@Override
	public double area() {
		return length * width;
	}
	
	@Override
	public double perimeter() {
		return 2 * (width + length);
	}
	
	public int compareTo(Object myObject) {
		Rectangle myR = (Rectangle) myObject;
		return(Double.compare(this.area(), myR.area()));
	}

	

}
