package pkgShape;


public final class Ellipsoid extends Ellipse {
	private double HeightRadius;
	
	public Ellipsoid(double R1, double R2,double R3) throws IllegalArgumentException {
		super(R1, R2);
		Math.sqrt(R3); //Checks if negative
		HeightRadius = R3;
	}
	
	
	public double volume() {
		return 4.0/3.0*Math.PI*HeightRadius*getRadius()*getMinorRadius();
	}
	

	public int compareTo(Ellipsoid el) {
		return this.volume()>el.volume()? 1 : (this.volume()<el.volume() ? -1 : 0);
	}
	
}
