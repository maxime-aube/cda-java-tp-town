public class Brigand extends Humain {

    public String look = "méchant";
    private int nbDame;
    private int recompense = 100;
    private boolean imprisoned;

    Brigand (String nom) {
        super(nom);
        this.boisson = "tord-boyaux";
    }

    // Bonjour, je suis Bob le m ́echant et j’aime le Tord-Boyau
    public void presenter() {
        System.out.println(this.nom + " - Héhé ! Moi c'est " + this.quel_est_ton_nom() + " et j'aime le " + this.boisson);
        System.out.println(this.nom + " - J'ai l’air " + this.look + " et j’ai déjà kidnappé " + this.nbDame + " dames !");
        System.out.println(this.nom + " - Ma tête est mise à prix " + this.recompense + "$ !");
    }

    /**
     * kidnapper une dame
     * @param dame
     */
    public void kidnapper (Dame dame) {
        this.parle("Ah ah ! " + dame.quel_est_ton_nom() + ", tu es mienne désormais !");
        dame.kidnapper();
        this.nbDame++;
    }

    /**
     * se faire capturer
     * @param cowbow
     */
    public void emprisonner (Cowboy cowbow) {
        this.parle("Damned, je suis fait ! " + cowbow.quel_est_ton_nom() + ", tu m’as eu !");
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