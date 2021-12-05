public class Humain {

    protected String nom;
    protected String boisson = "eau";

    public Humain (String nom) {
        this.nom = nom;
    }

    public void parler(String texte) {
        if (texte.length() > 0) System.out.println(this.nom + " - " + texte);
    }

    public void presenter() {
        this.parler("Bonjour, je m'appelle " + this.nom + " et je bois de l'" + this.boisson + ".");
    }

    public void boire () {
        System.out.println(this.nom + " - Ah ! Un bon verre d'" + this.boisson + " ! GLOUPS !");
    }

    public String getName() {
        return this.nom;
    }

    public String getBoisson() {
        return this.boisson;
    }
}
