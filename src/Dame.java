public class Dame extends Humain {

    private String couleurRobe = "blanche";
    private boolean libre = true;

    Dame (String nom) {
        super(nom);
    }

    /**
     * kidnapper la dame
     */
    public void kidnapper() {
        this.parle("On me kidnappe ! Aaah je hurle !");
        this.libre = false;
    }

    /**
     * libérer la dame
     */
    public void liberer(Cowboy cowboy) {
        this.parle("Merci " + cowboy.nom + " de m'avoir libérée !");
        this.libre = true;
    }

    /**
     * changer de robe
     */
    public void changerRobe(String couleur) {
        this.parle("Regardez ma nouvelle robe " + couleur + " !");
    }
}
