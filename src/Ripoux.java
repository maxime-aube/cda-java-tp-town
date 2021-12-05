public class Ripoux extends Sherif implements HorsLaLoi {

    int nbDame = 0;
    boolean imprisoned = false;
    int recompense = 0;

    Ripoux(String nom) {
        super(nom);
    }

    Ripoux(String nom, int nbDame) {
        super(nom);
        this.nbDame = nbDame;
    }

    Ripoux(String nom, boolean imprisoned) {
        super(nom);
        this.imprisoned = imprisoned;
    }

    public void presenter() {
        super.presenter();
        this.parler("Hé hé hé...");
    }

    /**
     * se faire capturer
     * @param cowbow
     */
    public void emprisonner(Cowboy cowbow) {
        this.parler("Damned, je suis fait ! " + cowbow.getName() + ", tu m’as troué le cuir !");
        this.imprisoned = true;
    }

    /**
     * kidnapper une dame
     * @param dame
     */
    public void kidnapper(Dame dame) {
        this.parler("Ah ah ! " + dame.getName() + ", tu es mienne désormais !");
        dame.kidnapper();
        this.nbDame++;
    }

    public int getNbDame() {
        return this.nbDame;
    }

    public boolean isImprisoned() {
        return this.imprisoned;
    }

    /**
     * renvoie le montant de la récompense offerte pour la capture du Hors la loi
     */
    public int getRecompense() {
        return this.recompense;
    }
}
