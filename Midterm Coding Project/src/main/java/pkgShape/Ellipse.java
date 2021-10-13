package pkgShape;


public sealed class Ellipse extends Circle permits Ellipsoid{
	private double MinorRadius;
	
	public Ellipse(double R1,double R2) throws IllegalArgumentException {
		super(R1);
		Math.sqrt(R2); //Checks if R2 is negative
		MinorRadius = R2;
	}
	
	@Override
	public double area() {
		return Math.PI*this.MinorRadius*getRadius();
	}
	
	
	public double getMinorRadius() {
		return MinorRadius;
		}
	
	public void setMinorRadius(double minorR) {
		MinorRadius = minorR;
	}
	
	public boolean isCircle() {
		return MinorRadius == getRadius();
	}
	
	
	public int compareTo(Ellipse e) {
		return this.area()>e.area()? 1 : (this.area()<e.area() ? -1 : 0);
	}
}
