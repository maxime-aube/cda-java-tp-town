public class Cowboy extends Humain {

    public int popularite = 0;
    public String trait = "vaillant";

    Cowboy(String nom) {
        super(nom);
    }

    public void tirer (Brigand brigand) {
        System.out.println("<narrateur> - Le " + this.trait + " " + this.nom + " tire sur " + brigand.nom + ". PAN !");
        this.parle("Prends ça rascal !");
    }

    public void liberer (Dame dame) {
        this.parle("Dame " + dame.nom + " vous êtes libre et bientôt je vous flatterai selon la tradition.");
        dame.liberer(this);
        this.popularite++;
    }

    /**
     * n cowboy est un humain qui est caract ́eris ́e par sa popularit ́e (0 pour commencer, augmente de
     * 1 `a chaque dame d ́elivr ́ee) et un adjectif le caract ́erisant (”vaillant” par d ́efaut). Un cowboy peut
     * tirer sur un brigand (un commentaire indique alors (”Le (adjectif) (nom) tire sur (nom du
     * m ́echant). PAN !” et le cowboy s’exclame ”Prend  ̧ca, rascal !”). Il peut  ́egalement lib ́erer
     * une dame (en la flattant).
     */
}
