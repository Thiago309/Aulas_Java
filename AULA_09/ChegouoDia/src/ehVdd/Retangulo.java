package ehVdd;

public class Retangulo {
	private double h;
	private double b;
	private double a;
	private double p;
	
	
	public Retangulo(double h, double b) {
		this.h = h;
		this.b = b;
	}
	
	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
			
	public double getArea() {
		return a;
	}
	
	public void setArea() {
		this.a = b * h;
	}
		
	public double getPerim() {
		return p;
	}
	
	public void setPerim(double p) {
		this.p = 2*(b+h);
	}
}

	