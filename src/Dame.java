public class Dame extends Humain {

    protected String couleurRobe = "blanche";
    protected boolean libre = true;

    Dame (String nom) {
        super(nom);
        this.boisson = "lait";
    }

    Dame (String nom, String couleur) {
        super(nom);
        this.boisson = "lait";
        this.couleurRobe = couleur;
    }

    public void parler(String texte) {
        if (texte.length() > 0) System.out.println(this.nom + " - " + texte + " Regardez-moi !");
    }

    public void presenter() {
        this.parler("Bonjour, je m'appelle " + nom + " et je bois du " + boisson + ".");
        this.parler("Je porte aussi une robe de couleur " + couleurRobe + ". Regardez ma belle robe.");
    }

    /**
     * kidnapper la dame
     */
    public void kidnapper() {
        this.parler("Oh ! On me kidnappe ! Aaah je hurle !");
        this.libre = false;
    }

    /**
     * libérer la dame
     */
    public void liberer(Cowboy cowboy) {
        this.parler("Merci " + cowboy.getName() + " de m'avoir libérée !");
        this.libre = true;
    }

    /**
     * changer de robe
     */
    public void changerRobe(String couleur) {
        this.parler("Regardez ma nouvelle robe " + couleur + " !");
    }

    public String getName() {
        return "Miss " + this.nom;
    }
}
