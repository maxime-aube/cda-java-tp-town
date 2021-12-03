public class Sherif extends Cowboy {

    public int nbBrigand = 0;

    Sherif (String nom) {
        super(nom);
        this.trait = "Honnête";
    }

    public void presenter() {
        this.parler("Je suis le " + this.quel_est_ton_nom() + " et cette ville est en sécurité sous ma bonne garde.");
        this.parler("J'ai déjà mis " + nbBrigand + " brigands sous les verrous !");
    }

    public void coffrer (Brigand brigand) {
        this.parler("Au nom de la loi, " + brigand.quel_est_ton_nom() + " je vous arrête");
    }

    public void rechercher (Brigand brigand) {
        Narrateur.raconter("Le " + this.quel_est_ton_nom() + " s'en va placarder des avis de recherche de " + brigand.quel_est_ton_nom() + " dans toute la ville.");
        this.parler("OYEZ OYEZ BRAVE GENS !! " + brigand.recompense + "$ à qui arrêtera " + brigand.quel_est_ton_nom() + " mort ou vif !");
    }

    public String quel_est_ton_nom() {
        return "Sherif " + nom;
    }
}
