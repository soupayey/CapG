package exo2;

public class Compta {
	static public void main (String args[]) {
		Personne Durand = new Personne ("DURAND");
		Employe Martin = new Employe ("MARTIN", 15000);
		Durand.affiche(); // nom : DURAND
		Martin.affiche(); // nom : MARTIN
		// salaire : 15000
		Personne p = Martin; // l'objet Martin est
		// une Personne
		p.affiche(); // nom : MARTIN
		// salaire : 15000
	}
}