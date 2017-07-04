
public class Cercle extends Point {

	float AbsCercle ;
	float OrdCercle ;
	float rayon ;
	double pi=3.14 ;
	
	
	//Constructeur 1
	Cercle(float xa, float xb, float r){
		super(xa, xb);
		rayon=r;
		
	}
	
	Cercle(Point A, float r){
		float xa=super.getAbs();
		float xb=super.getOrd();
		rayon=r;
		
	}
	
	//Constructeur 2
	Cercle(){}

		public float getAbsCercle(){
			 return super.getAbs();
			}
		public float getOrdCercle(){
			return super.getOrd();
			 
			}
		public float getrayonCercle(){
			return this.rayon;
			}
		
		
		public Cercle deplacerCercle (Point A, float dx, float dy, float r){
			float x, y, rayon; 
			rayon=r;
			x=getAbsCercle()+dx;
			y=getOrdCercle()+dy;
			

			Cercle c=new Cercle(x, y, rayon);
			return c;
		};
		
		
		

public static boolean sontEgaux(Cercle A, Cercle B) {
	boolean bool=false;
if (A.getAbs()==B.getAbs()&& A.getOrd()==B.getOrd() && A.getrayonCercle()==B.getrayonCercle()) {
	bool=true;
};
return bool;
}

		
		
/*		
			
			Dupliquer (arg){};
			SontEgaux(){}*/
	}
	
