package exo2;

public class Employe extends Personne {
	private double salaire;
	
	public Employe (String n, double s) {
		super (n); salaire = s; }
	
	
	public void affiche() { //m�thode polymorphe ou red�finie
		

		
		super.affiche(); // appel de la m�thode h�rit�e
		System.out.println ("salaire : " + salaire );
	}
}