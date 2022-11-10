package histoires;
import personnages.*;
import personnages.principaux.*;


public class MonHistoire {

	public static void main(String[] args) {
		Humain humain = new Humain("Prof", 10, "Porto");
		humain.direBonjour();
		humain.boire();
		Commercant commercant = new Commercant("Marchand", 35);
		commercant.direBonjour();
		Yakuza yakuza = new Yakuza("Yaku le noir", 42,"biere", "WarSong");
		yakuza.direBonjour();
		yakuza.extorquer(commercant);
		Ronin ronin = new Ronin("Roro", 61, "sake");
		ronin.donner(10, commercant );
		ronin.provoquer(yakuza);
		ronin.direBonjour();
		
		//Test pour les samourais
		Ronin roninSamourai = new Samourai("Pauline", 10, "jus d'ananas", "Varin");
		roninSamourai.direBonjour();
		roninSamourai.boire();
		// appel ci-dessous impossible car la méthode de la classe fille n'est pas accessible dans la classe mère
		//roninSamourai.boire("jus de pomme");
		
		Samourai samourai = new Samourai("Pauline", 10, "jus d'ananas", "Varin");
		samourai.direBonjour();
		samourai.boire("jus de pomme");
		
		
		
		//Lignes pour vérifier certains elements
		//System.out.println("argent commercant après extorquer "+commercant.getArgent());
		//System.out.println("argent yakuza apres extorquer"+yakuza.getArgent());
		//System.out.println("reputation yakuza apres extorquer"+yakuza.getReputation());
	}
}
