package personnages.principaux;


public class Samourai extends Ronin {
	//Attributs
	private String seigneur ;
	
	//Constructeur
	public Samourai(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson) ; 
		this.seigneur = seigneur ; 
	}
	
	
	//Méthodes
	public void direBonjour() {
		super.direBonjour();
		super.parler("Mon seigneur est "+this.seigneur);
	}
	
	public void boire(String boisson) {
		parler("Mmmm, un bon verre de "+boisson+" ! GLOUPS !");
		
	}
}
