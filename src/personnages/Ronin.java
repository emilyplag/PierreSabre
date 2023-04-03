package personnages;

public class Ronin extends Humain{
	private int honneur=1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int a=(int) (getArgent()*0.90);
		perdreArgent(a);
		beneficiaire.recevoir(a);
		
	}

}
