package personnages;

public class Commercant extends Humain{

	public Commercant(String nom, int argent) {
		super(nom, "th�", argent); //j'ai cr�e le constructeur depuis source
		
		
	}
	
	public int seFaireExtorquer() { //car getargent et perdreargent et gagnerargent sont publics, je peux donc les utiliser
		int a=getArgent();
		perdreArgent(a);
		parler("J'ai tout perdu! Le monde est vraiment trop injuste...");
		return a;
		
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent+" sous ! Je te remercie g�n�reux donateur!");
	}
	
	
}
