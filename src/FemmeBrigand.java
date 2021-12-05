public class FemmeBrigand extends Dame implements HorsLaLoi {


    private int nbDame = 0;
    private boolean imprisoned = false;
    private int recompense = 0;

    FemmeBrigand(String nom) {
        super(nom);
    }

    public void parler(String texte) {
        if (texte.length() > 0) System.out.println(this.nom + " - " + texte + " Et t'as pas intérêt...");
    }

    public void presenter() {
        this.parler("T'as affaire à " + this.getName() + " et je ne bois pas de " + super.boisson + ", compris ?");
        this.parler("Je porte aussi une robe de couleur " + this.couleurRobe + ".");
    }

    /**
     * se faire capturer
     * @param cowbow
     */
    public void emprisonner(Cowboy cowbow) {
        this.parler("Damned, je suis faite ! " + cowbow.getName() + ", tu m’as troué le cuir !");
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

    /**
     * renvoie le montant de la récompense offerte pour la capture du Hors la loi
     */
    public int getRecompense() {
        return this.recompense;
    }

    public String getName() {
        return "LA " + this.nom;
    }
}
