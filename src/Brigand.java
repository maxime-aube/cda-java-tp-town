public class Brigand extends Humain implements HorsLaLoi, VisagePale {

    // properties
    public String look = "méchant";
    private int nbDame;
    public int recompense = 100;
    private boolean imprisoned = false;

    // constructors

    Brigand (String nom) {
        super(nom);
        this.boisson = "tord-boyaux";
    }

    Brigand (String nom, String boisson) {
        super(nom);
        this.boisson = boisson;
    }

    // METHODS

    public void presenter() {
        this.parler("Héhé ! C'est moi " + this.getName() + " et j'aime le " + this.boisson);
        this.parler("J'ai l’air " + this.look + " et j’ai déjà kidnappé " + this.nbDame + " dames !");
        this.parler("Ma tête est mise à prix à " + this.recompense + "$ ! Pas mal hein ?");
    }

    /**
     * se faire capturer
     * @param cowbow
     */
    public void emprisonner (Cowboy cowbow) {
        this.parler("Damned, je suis fait ! " + cowbow.getName() + ", tu m’as troué le cuir !");
        this.imprisoned = true;
    }

    /**
     * kidnapper une dame
     * @param dame
     */
    public void kidnapper (Dame dame) {
        this.parler("Ah ah ! " + dame.getName() + ", tu es mienne désormais !");
        dame.kidnapper();
        this.nbDame++;
    }

    /**
     * renvoie le montant de la récompense offerte pour la capture du Brigand
     */
    public int getRecompense() {
        return this.recompense;
    }

    public String getName() {
        return this.nom + " le " + this.look;
    }

    public void scalp() {
        this.parler("Aïe ma tête !");
    }
}
