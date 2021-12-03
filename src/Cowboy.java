public class Cowboy extends Humain {

    public int popularite = 0;
    public String trait = "vaillant";

    Cowboy(String nom) {
        super(nom);
        this.boisson = "whisky";
    }

    public void presenter() {
        this.parle("Bonjour, je m'appelle " + nom + " et je bois du " + boisson + ".");
        this.parle("On dit de moi que je suis " + this.trait + ".");
        this.parle("La taille de ma popularité est de " + this.popularite + " !");
    }

    public void tirer (Brigand brigand) {
        this.parle("Tiens bollos !");
        System.out.println("<narrateur> - Le " + this.trait + " " + this.nom + " tire sur " + brigand.nom + ". PAN !");
    }

    public void liberer (Dame dame) {
        this.parle(dame.quel_est_ton_nom() + " vous êtes libre et bientôt je vous flatterai selon la tradition.");
        dame.liberer(this);
        this.popularite++;
    }
}
