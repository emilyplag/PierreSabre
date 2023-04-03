package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {

	
	
	
	public static void main(String[] args) {
		Humain prof=new Humain("Prof","kombucha",54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		Commercant Marco=new Commercant("Marco",20);
		Marco.direBonjour();
		Marco.seFaireExtorquer();
		Marco.recevoir(15);
		Marco.boire();
		
		Yakuza Yaku=new Yakuza("Yaku Le Noir","whisky",0);
		Yaku.direBonjour();
		Yaku.parler("Tiens, tiens, ne serait-ce pas un faible marchant qui passe par là");
		Yaku.extorquer(Marco);
		
		
	}

}
