package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=0;

	public Yakuza(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	
	public void extorquer(Commercant victime) {
		parler(victime.getNom()+", si tu tiens � ta vie donne moi ta bourse !");
		int gain=victime.seFaireExtorquer();
		gagnerArgent(gain);
		parler("J'ai piqu� les "+gain+" sous de "+victime.getNom()+", ce qui me fait "+getArgent()+" sous dans ma poche. Hi ! Hi!");
		
		
	}

}
