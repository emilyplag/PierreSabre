package personnages;
  
  
public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	
	
	public Humain(String nom, String boisson, int argent) {
		this.nom=nom;
		this.boisson=boisson;
		this.argent=argent;
	}



	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}


	public void parler(String texte) {
		System.out.println("� " + texte + "�");
	}
	
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+boisson);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+boisson+" ! GLOUPS !");
		
	}
	
	public void gagnerArgent(int gain) {
		argent=argent+gain;
	}
	
	public void perdreArgent(int perte) {
		argent=argent-perte;
	}
	
	public void acheter(String bien,int prix) {
		if (prix<=argent) {
			parler("J'ai "+argent+" sous en poche.Je vais pouvoir m'offrir "+bien+" � "+prix+" sous");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux m�me pas m'offrir "+bien+" � "+prix+" sous");
			
		}
	}
	
	
}
