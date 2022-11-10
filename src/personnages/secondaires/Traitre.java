package personnages.secondaires;
import personnages.principaux.*;

public class Traitre extends Samourai {
	//Attributs
	private int niveauTraitrise ; 
	
	//Constructeur
	public Traitre(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson, seigneur) ; 
		this.niveauTraitrise = 0 ; 
	}
	
	//Méthodes
	public void direBonjour() {
		super.direBonjour();
		parler("Mon niveau de traîtrise est de "
		+this.niveauTraitrise);
	}
	
	public void extorquer (Commercant c) {
		//cas ou le traitre peut extorquer
		if (this.niveauTraitrise <3) {
			int argentCommercant = c.getArgent() ;
			c.perdreArgent(argentCommercant);
			this.niveauTraitrise++ ; 
		} else {
			parler("Je ne peux plus extorquer");
		}
		
	}

}
