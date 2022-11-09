package personnages.principaux;
import personnages.Humain;

public class Commercant extends Humain{
	
	//Attributs
	
	//Constructeur 
	public Commercant (String nom, int argent ) {
		super(nom,argent,"thé") ; //appel au constrcuteur de la classe mère
	}
	
	// Méthodes
	public int seFaireExtorquer () {
		int n = getArgent() ;
		perdreArgent(n);
		parler("J’ai tout perdu! Le monde est trop injuste !!!");
		return n ;
	}
	
	public void recevoir (int n) {
		gagnerArgent(n);
		parler("Je te remercie, généreux donnateur !!!") ; 
		
	}

}
