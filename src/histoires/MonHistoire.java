package histoires;
import personnages.*;
import personnages.principaux.*;


public class MonHistoire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humain humain = new Humain("Prof", 10, "Porto");
		humain.direBonjour();
		humain.boire();
		Commercant commercant = new Commercant("Marchand", 35);
		commercant.direBonjour();



	}

}
