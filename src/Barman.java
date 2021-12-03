public class Barman extends Humain {

    private String bar;

    Barman (String nom) {
        super(nom);
        this.boisson = "Vin";
    }

    Barman (String nom, String bar) {
        super(nom);
        this.boisson = "Vin";
        this.bar = bar;
    }

    public void parler(String texte) {
        if (texte.length() > 0) System.out.println(this.nom + " - " + texte + " M'voyez...");
    }

    public void presenter() {
        this.parler("Je suis Ma' la barmaid de " + this.getBar() + " et je ne jure que pas le Vin.");
    }

    public String getBar() {
        if (this.bar != null) return this.bar;
        return "Chez " + this.nom;
    }

    public void servir (Humain client) {
        Narrateur.raconter(this.nom + " sert un verre de " + client.quelle_est_ta_boisson() + " à " + client.quel_est_ton_nom() + ".");
    }
}
