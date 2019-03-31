package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle{
	private int depth;
	public Cuboid(int width, int length, int depth){
		super(width, length);
		this.depth = depth;
		if(depth <= 0)
			throw new IllegalArgumentException();
	}
	public int getDepth(){
		return depth;
	}
	public void setDepth(int newDepth){
		depth = newDepth;
	}
	public double volume(){
		return  (depth * super.getWidth()*super.getLength());
	}
	@Override
	public double area(){
		return (2 * (super.getLength() * super.getWidth() + 
				depth * super.getLength() + depth * super.getWidth()));
	}
	@Override
	public double perimeter(){
		throw new UnsupportedOperationException();
	}
	@Override
	public int compareTo(Object Ob){
		Cuboid myC = (Cuboid) Ob;
		return Double.compare(myC.area(),this.area());
	}
	class SortByArea implements Comparator<Cuboid>{
		SortByArea(){
		}
		@Override
		public int compare(Cuboid a, Cuboid b) {
			return a.compareTo(b);
		}
	}
	class SortByVolume implements Comparator<Cuboid>{
		SortByVolume(){
		}
		@Override
		public int compare(Cuboid a, Cuboid b) {
			return (int) (a.volume() - b.volume());
		}
	}
}
		


	
	

