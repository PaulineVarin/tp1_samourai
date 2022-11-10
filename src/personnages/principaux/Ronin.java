package personnages.principaux;

import personnages.*;


public class Ronin extends Humain {
	//Attributs
	private int honneur ; 
	
	
	//Constructeur
	public Ronin(String nom, int argent, String boisson) {
		super(nom,argent,boisson);
		this.honneur = 1 ;
	}
	
	//Méthodes
	public void donner (int n, Commercant c) {
		super.parler("Tiens Marchant voilà "+n+" sous");
		c.recevoir(n);
		super.perdreArgent(n);
	}
	
	public void provoquer(Yakuza y) {
		//recuperation de l'honneur * 2 
		int honneurRonin = this.honneur*2 ; 
		
		if (honneurRonin>y.getReputation()) {
			//gagne l'argent du yakuza 
			int argentSuppRonin = y.perdreDuel() ;
			super.gagnerArgent(argentSuppRonin);
			
			//gagne en honneur
			this.honneur++ ;
			
			//annonce sa vicoire
			super.parler("Je t’ai eu petit yakusa!");
		} else {
			//decrementation honneur
			this.honneur-- ; 
			//rale a cause de sa defaite
			super.parler("J'ai perdu mon duel contre le Yakuza");
			
			//yakuza gagne son duel
			y.gagnerDuel();
		}
	}
	
}
