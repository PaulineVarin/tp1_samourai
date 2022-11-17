package personnages.secondaires;

import java.util.Random;

import personnages.Humain;

public class GrandMere extends Humain {
	//Attributs
	private String nom ; 
	private int nbConnaissances ; 
	private static java.util.Random r = new Random() ; 
	private Humain[] memoire = new Humain [30] ; 
	
	//Constructeur 
	public GrandMere(String nom) {
		super(nom,0,"Tisane") ; 
	}
	
	//Methodes
	private String HumainHasard() {
		int indiceI = r.nextInt(1,6) ; 
		String typeHumain = "" ; 
		switch(indiceI) {
			case 1 : {
				typeHumain = "Commercant" ; 
				break ; 
			}
			case 2 : {
				typeHumain = "Ronin" ; 
				break ; 
			}
			case 3 : {
				typeHumain = "Yakuza" ; 
				break ; 	
			}
			case 4 : {
				typeHumain = "Samourai" ; 
				break ; 
			}
			
			default : {
				typeHumain = "Humain";
				break ; 
			}
			
		}

		return typeHumain ; 
	}
	
	public void ragoter() {
		this.HumainHasard() ; 
	}
	
	

}
