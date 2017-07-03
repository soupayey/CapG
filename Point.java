
public class Point {

	private float abs, ord;


	public Point(float x, float y) {
		abs=x;
		ord=y;
	}



	public float getAbs()
	{
		return this.abs;

	}
	public float getOrd()
	{
		return this.ord;

	}

	public float setAbs(float x)
	{
		abs=x;
		return abs;
	}

	public float setOrd(float y)
	{
		ord=y;
		return ord;
	}


	// Deplacer point
	
	public Point deplacerPoint(Point A, float dx, float dy) {
		abs=A.getAbs()+dx ;
		ord=A.getOrd()+dy ;
		
		Point p1=new Point(abs, ord);

		return p1;
		
	}
	
	
	// Dupliquer point
	public Point dupliquerPoint(Point A, float dx, float dy) {
		abs=A.getAbs()+dx ;
		ord=A.getOrd()+dy ;
		
		Point p1=new Point(abs, ord);

		return p1;
		
	}
	
	
	
	

	public static void main (String args[]) {

		
		Point p=new Point (3,5);
		//p.setOrd(9);

		System.out.println("abscisse="+p.getAbs());
		System.out.println("ordonnee="+p.getOrd());
		
		System.out.println(p.deplacerPoint(p, 2, 0).abs);
		System.out.println(p.deplacerPoint(p, 2, 3).ord);


	}


}
