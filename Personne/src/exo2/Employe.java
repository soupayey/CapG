package exo2;

public class Employe extends Personne {
	private double salaire;
	
	public Employe (String n, double s) {
		super (n); salaire = s; }
	
	
	public void affiche() { //méthode polymorphe ou redéfinie
		

		
		super.affiche(); // appel de la méthode héritée
		System.out.println ("salaire : " + salaire );
	}
}