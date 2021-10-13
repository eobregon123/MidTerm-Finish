package pkgShape;


public final class Ellipsoid extends Ellipse {
	private double HeightRadius;
	
	public Ellipsoid(double R1, double R2,double R3)  {
		super(R1, R2);
		if (R3 < 0 ) {
			throw new IllegalArgumentException();
		}
		HeightRadius = R3;
	}
	
	
	public double volume() {
		return 4.0/3.0*Math.PI*HeightRadius*getRadius()*getMinorRadius();
	}
	

	public int compareTo(Ellipsoid el) {
		return this.volume()>el.volume()? 1 : (this.volume()<el.volume() ? -1 : 0);
	}
	
}
