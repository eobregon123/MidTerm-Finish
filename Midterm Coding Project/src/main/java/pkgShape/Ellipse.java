package pkgShape;


public sealed class Ellipse extends Circle permits Ellipsoid{
	private double minorRadius;
	
	public Ellipse(double R1,double R2) throws IllegalArgumentException {
		super(R1);
		Math.sqrt(R2);
		minorRadius = R2;
	}
	
	@Override
	public double area() {
		return Math.PI*this.minorRadius*getRadius();
	}
	
	
	public double getMinorRadius() {
		return minorRadius;
		}
	
	public void setMinorRadius(double minorR) {
		minorRadius = minorR;
	}
	
	public boolean isCircle() {
		return minorRadius == getRadius();
	}
	
	
	public int compareTo(Ellipse e) {
		return this.area()>e.area()? 1 : (this.area()<e.area() ? -1 : 0);
	}
}