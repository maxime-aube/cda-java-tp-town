public class Indien extends Humain {

    private int nbPlume = 0;
    private String totem = "Faucon";
    private String trait = "Perché";

    Indien(String nom) {
        super(nom);
        this.boisson = "Jus de racine";
    }

    Indien(String nom, String totem) {
        super(nom);
        this.boisson = "Jus de racine";
        this.totem = totem;
    }

    Indien(String nom, String totem, String trait) {
        super(nom);
        this.boisson = "Jus de racine";
        this.totem = totem;
        this.trait = trait;
    }

    public void parler(String texte) {
        super.parler(texte + " Ugh !");
    }

    public void scalper(VisagePale visagePale) {
        Narrateur.raconter(this.getName() + " dégaine son couteau et fonce sur " + visagePale.getName() + " !");
        visagePale.scalp();
        this.nbPlume++;
    }

    public String getName() {
        return this.nom + " le " + this.totem + " " + this.trait;
    }
}
