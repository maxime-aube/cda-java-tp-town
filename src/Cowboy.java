public class Cowboy extends Humain {

    public int popularite = 0;
    public String trait = "vaillant";

    Cowboy(String nom) {
        super(nom);
        this.boisson = "whisky";
    }

    public void presenter() {
        this.parler("Bonjour, je m'appelle " + this.getName() + " et je bois du " + boisson + ".");
        this.parler("On dit de moi que je suis " + this.trait + ".");
        this.parler("La taille de ma popularité est de " + this.popularite + " !");
    }

    public void tirer (HorsLaLoi outlaw) {
        this.parler("Tiens bollos !");
        Narrateur.raconter("Le " + this.trait + " " + this.nom + " tire sur " + outlaw.getName() + ". PAN !");
    }

    public void liberer (Dame dame) {
        this.parler(dame.getName() + " vous êtes libre et bientôt je vous flatterai selon la tradition.");
        dame.liberer(this);
        this.popularite++;
    }
}
