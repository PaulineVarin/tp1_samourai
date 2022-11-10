package personnages.principaux;

import personnages.*;

public class Yakuza extends Humain{
	//Attributs
	private String clan ;
	private int reputation ; 
	
	//Constructeur(s)
	public Yakuza(String nom, int argent, String boisson, String clan) {
		super(nom,argent,boisson) ;
		this.clan=clan ; 
		this.reputation=0 ; 
	}
	
	//Méthode(s)
	public String getClan() {
		return clan ; 
	}
	
	public int getReputation() {
		return reputation ; 
	}
	
	public void extorquer(Commercant c) {
		//prend l'argent du commercant
		int argentCommercant = c.seFaireExtorquer() ;
		gagnerArgent(argentCommercant);
		
		//gagne un point de reputation
		this.reputation++ ;
		
		//annonce ce qu'il vient de faire
		super.parler("J’ai piqué le fric de Marchant");
		
	}
	
	public void gagnerDuel () {
		//gagne en réputation
		this.reputation++ ; 
		//crie sa victoire
		super.parler("J'ai gagné mon duel");
	}
	
	public int perdreDuel () {
		//stocke l'agent avant la perte + perd tout son argent 
		int argentYakuza = super.getArgent() ; 
		this.perdreArgent(argentYakuza);
		
		//perd de la réputation
		this.reputation-- ; 
		
		//annonce sa défaite
		super.parler("J’ai perdu mon duel et mes "+argentYakuza+" sous, snif...");
		
		//on retourne l'argent du Yakuza avant le duel
		return argentYakuza; 
	}
	
	public void direBonjour() {
		super.direBonjour();
		super.parler("Mon clan est celui de "+clan);
	}


}
