package pkgShape;



public sealed abstract class Shape permits Circle{
	public Shape() {
	}
	
	protected abstract double area();
}
