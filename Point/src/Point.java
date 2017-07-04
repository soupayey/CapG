


public class Point {

private float abs; // les attribus de type public doivent etre exceptionnels
private float ord;
public static float nb ; //static = variable de classe 
public static final double pi=3.14 ; 


//constructeur 1
public Point (float xa, float xb) {
	abs=xa ;
	ord=xb ;
	Point.nb ++ ;
}

//constructeur 2
public Point () {}


//methodes en lecture

		public float getAbs() 
		{
		return this.abs ;
		}

		public float getOrd() 
		{

		return this.ord ;
		}


// methodes en ecriture
		public void setAbs(float x)
		{
			this.abs = x ;
		}


		public void setOrd(int y)
		{
			this.ord = y ;
		}

		
//methode statique
		
public static boolean sontalignes (Point A, Point B, Point C)
{
	return((B.ord - A.ord)/(C.abs - A.abs)==(C.ord-A.ord)/(B.abs -A.abs));
}

public void afficher ()
{
	System.out.println("Abscisse =" + this.abs);
}

public static Point dupliquerPoint(Point A, float dx, float dy) {
	float x, y ;
	Point p ;
	x=A.getAbs() ;
	y=A.getOrd() ;
	
	p= new Point (x+dx, y+dy) ;
	return p ;
}

public static Point deplacerPoint(Point A, float dx, float dy) {
	float x, y; 
	Point p;
	x=A.getAbs()+dx;
	y=A.getOrd()+dy;
	
	p=new Point(x,y);
	return p;
}


public static void main (String[] args)
{
float x ;
float y ;
float dx, dy;
boolean align;
Point p11 ;

x=1; 
y=2;
Point p1=new Point(x, y);
p1.afficher();



x=5; 
y=2;
Point p2=new Point(x, y);
p2.afficher();

Point p3=p2.deplacerPoint(p2, 10, 10);
System.out.println("New Abscisse =" + p3.abs);

float r=2;
Cercle c1=new Cercle(x, y, r);

r=2;
Cercle c2=new Cercle(x, y, r);

r=2;
Cercle c3=new Cercle(p2, r);

boolean b=c2.sontEgaux(c3,c2);

System.out.println("Egaux=" + b);

/*p11= new Point(x,y);
p11=dupubliquerPoint(p1, dx, dy);
*/
}





		}

