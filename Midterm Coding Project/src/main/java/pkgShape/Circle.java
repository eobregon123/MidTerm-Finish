package pkgShape;


public sealed class Circle extends Shape permits Ellipse{
	private double Radius;
	
	public Circle(double R1)  {
		
			if (R1 < 0 ) {
				throw new IllegalArgumentException();
			}
			Radius = R1;
	}
	@Override
	public double area() {
		return Math.PI*this.Radius*this.Radius;
	}
	
	
	protected double getRadius() {
		return Radius;
	}
	
	protected void setRadius(double rad) {
		Radius = rad;
	}
	
	
	public int compareTo(Circle c) {
		return this.Radius>c.getRadius()? 1 : (this.Radius<c.getRadius() ? -1 : 0);
	}
	
}
