package pkgShape;

import org.junit.jupiter.api.Test;

import pkgShape.Cuboid;
import pkgShape.Cuboid.SortByArea;
import pkgShape.Rectangle;
import pkgShape.Shape;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import org.junit.Assert;


public class ShapeTest {
	
	@Test
	public void RectangleTest() {
		
		int width = 1, length = 2;
		Shape rectangle = new Rectangle(width, length);
		
		System.out.println("Rectangle Width: " + width + "\nRectangle Length: " + length +
				"\nRectangle Area: " + rectangle.area() + "\nRectangle Perimeter: " + rectangle.perimeter() + "\n");
	}

	@Test
	public void getWidthTest() {
		int width = 1, length = 2;
		Rectangle rectangle = new Rectangle(width, length);
		System.out.println("Rectangle Width: " + rectangle.getWidth()); 
		
	}
	
	@Test
	public void setWidthTest() {
		int width = 1, length = 2;
		Rectangle rectangle = new Rectangle(width, length);
		rectangle.setWidth(6);
		System.out.println("Rectangle Width: " + rectangle.getWidth());
	}
	
	@Test
	public void getLengthTest() {
		int width = 1, length = 2;
		Rectangle rectangle = new Rectangle(width, length);
		System.out.println("Rectangle Length: " + rectangle.getLength()); 
		
	}
	
	@Test
	public void setLengthTest() {
		int width = 1, length = 2;
		Rectangle rectangle = new Rectangle(width, length);
		rectangle.setLength(8);
		System.out.println("Rectangle Length: " + rectangle.getLength());
	}
	
	@Test
	public void compareToTest() {
		int a = 1, b = 2;
		Rectangle rectangle = new Rectangle(a, b);
		int c = 3, d = 4;
		Rectangle rectangle2 = new Rectangle(c, d);
		System.out.println("Bigger Rectangle: " + rectangle.compareTo(rectangle2));
		
	}
	
	@Test
	public void CuboidTest() {
		
		int width = 1, length = 2, depth = 3;
		Cuboid cuboid = new Cuboid(width, length, depth);
		
		System.out.println("Cuboid Width: " + width + "\nCuboid Length: " + length + "\nCuboid Depth: " + depth +
				"\nSurface Area: " + cuboid.area() + "\nVolume: " +  cuboid.volume() + "\n");
	}
	
	@Test
	public void getDepthTest() {
		int width = 1, length = 2, depth = 3;
		Cuboid cuboid = new Cuboid(width, length, depth);
		System.out.println("Cuboid Depth: " + cuboid.getDepth());
	}
	
	@Test
	public void setDepthTest() {
		int width = 1, length = 2, depth = 3;
		Cuboid cuboid = new Cuboid(width, length, depth);
		cuboid.setDepth(7);
		System.out.println("Cuboid Depth: " + cuboid.getDepth());
	}
	
	@Test
	public void ExceptionTest() {
		try{
			Cuboid cuboid = new Cuboid(1,2,3);
			cuboid.perimeter();
		}
		catch(UnsupportedOperationException e) {		
		}
	}
	
	@Test 
	public void sortByAreaTest() {
		Cuboid c1 = new Cuboid(1,2,3);
		Cuboid c2 = new Cuboid(4,5,6);
		SortByArea Sort = c1.new SortByArea();
		
		Assert.assertTrue(Sort.compare(c1, c2) >=0);
		Assert.assertTrue(Sort.compare(c2, c1) < 0);
		
	}
	@Test
	public void sortByVolumeTest() {
		Cuboid c1 = new Cuboid(1,2,3);
		Cuboid c2 = new Cuboid(4,5,6);
		Cuboid c3 = new Cuboid(7,8,9);
		ArrayList<Cuboid> cube = new ArrayList<Cuboid>();
		cube.add(c1);
		cube.add(c2);
		cube.add(c3);

		Cuboid[] Cube = {c1, c2, c3};
		assertArrayEquals(Cube,cube.toArray());
	}
	
	
}