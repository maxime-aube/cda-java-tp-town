public class Brigand extends Humain {

    public String look = "méchant";
    private int nbDame;
    public int recompense = 100;
    private boolean imprisoned = false;

    Brigand (String nom) {
        super(nom);
        this.boisson = "tord-boyaux";
    }

    public void presenter() {
        this.parler("Héhé ! Moi c'est " + this.quel_est_ton_nom() + " et j'aime le " + this.boisson);
        this.parler("J'ai l’air " + this.look + " et j’ai déjà kidnappé " + this.nbDame + " dames !");
        this.parler("Ma tête est mise à prix à " + this.recompense + "$ ! Pas mal hein ?");
    }

    /**
     * kidnapper une dame
     * @param dame
     */
    public void kidnapper (Dame dame) {
        this.parler("Ah ah ! " + dame.quel_est_ton_nom() + ", tu es mienne désormais !");
        dame.kidnapper();
        this.nbDame++;
    }

    /**
     * se faire capturer
     * @param cowbow
     */
    public void emprisonner (Cowboy cowbow) {
        this.parler("Damned, je suis fait ! " + cowbow.quel_est_ton_nom() + ", tu m’as troué le cuir !");
        this.imprisoned = true;
    }

    /**
     * renvoie le montant de la récompense offerte pour la capture du Brigand
     */
    public int getMontantRecompense() {
        return this.recompense;
    }

    public String quel_est_ton_nom() {
        return this.nom + " le " + this.look;
    }
}
