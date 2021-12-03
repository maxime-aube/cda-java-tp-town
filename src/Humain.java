public class Humain {

    protected String nom;
    protected String boisson = "eau";

    Humain (String nom) {
        this.nom = nom;
    }

    public void parle(String texte) {
        if (texte.length() > 0) System.out.println(this.nom + " - " + texte);
    }

    public void presenter() {
        System.out.println(this.nom + " - Bonjour, je m'appelle " + this.nom + " et je bois de l'eau");
    }

    public void boire () {
        System.out.println(this.nom + " - Ah ! Un bon verre d'eau ! GLOUPS !");
    }

    public String quel_est_ton_nom() {
        return this.nom;
    }

    public String quelle_est_ta_boisson() {
        return this.boisson;
    }
}
