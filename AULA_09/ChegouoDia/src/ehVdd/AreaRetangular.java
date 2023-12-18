package ehVdd;

public class AreaRetangular {

	public static void main(String[] args) {
		
		Retangulo f1 = new Retangulo(4, 2);
		
		Retangulo f2 = new Retangulo();
		f2.setB(6);
		f2.setH(3);
		f2.setArea();
		double resp3 = f2.getArea();
		System.out.println(resp3);
		
		
		
		f1.setB(2);
		f1.setH(4);
		double b1 = f1.getB();
		double h1 = f1.getH();
		double resp1 = f1.getArea();
		double resp2 = f1.getPerim();
		
		System.out.println("Sua base eh:" +b1);
		System.out.println("Sua altura eh:" +h1);
		System.out.println("A area da sua figura geometrica eh: "+resp1);
		System.out.println("O perimetro da sua figura geometrica eh: "+resp2);
	}

}
