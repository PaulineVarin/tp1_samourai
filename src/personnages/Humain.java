package personnages;

public class Humain {
	
	//Attributs
	private String nom;
	private int argent;
	private String boisson ;
	
	
	//Constructeur 
	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
	
	
	//Getters 
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	public String getBoisson() {
		return boisson;
	}
	
	
	//Setters
	
	
	//Méthodes
	public void parler(String texte) {
		System.out.println("("+this.nom+")"+" - "+texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle"+this.nom+", j’aime boire du"+this.boisson+
				"et j’ai"+this.argent+"sous en poche"); 
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de"+this.boisson+"! GLOUPS !");
	}
	
	public void gagnerArgent(int n) {
		this.argent = this.argent + n; // faire des vérifications 
		//this.argent += n 
	}

	public void perdreArgent(int n) {
		this.argent = this.argent - n ; // faire des vérifications 
		//this.argent -= n 
	}
}
