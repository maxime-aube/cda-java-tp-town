public class Brigand extends Humain {

    public String look = "méchant";
    private int nbDame;
    private int recompense = 100;
    private boolean imprisoned;

    Brigand (String nom) {
        super(nom);
        this.boisson = "tekila";
    }

    /**
     * kidnapper une dame
     * @param dame
     */
    public void kidnapper (Dame dame) {
        this.parle("Ah ah ! " + dame.nom + ", tu es mienne désormais !");
        dame.kidnapper();
        this.nbDame++;
    }

    /**
     * se faire capturer
     * @param cowbow
     */
    public void emprisonner (Cowboy cowbow) {
        this.parle("Damned, je suis fait ! " + cowbow.nom + ", tu m’as eu !");
        this.imprisoned = true;
    }

    /**
     * renvoie le montant de la récompense offerte pour la capture du Brigand
     */
    public int getMontantRecompense() {
        return this.recompense;
    }
}
