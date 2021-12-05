public class Sherif extends Cowboy {

    public int nbBrigand = 0;

    Sherif (String nom) {
        super(nom);
        this.trait = "Honnête";
    }

    public void presenter() {
        this.parler("Je suis le " + this.getName() + " et cette ville est en sécurité sous ma bonne garde.");
        this.parler("J'ai déjà mis " + nbBrigand + " brigands sous les verrous !");
    }

    public void coffrer (HorsLaLoi outlaw) {
        this.parler("Au nom de la loi, " + outlaw.getName() + " je vous arrête !");
        outlaw.emprisonner(this);
    }

    public void rechercher (HorsLaLoi outlaw) {
        Narrateur.raconter("Le " + this.getName() + " s'en va placarder des avis de recherche de " + outlaw.getName() + " dans toute la ville.");
        this.parler("OYEZ OYEZ BRAVE GENS !! " + outlaw.getRecompense() + "$ à qui arrêtera " + outlaw.getName() + " mort ou vif !");
    }

    public String getName() {
        return "Sherif " + nom;
    }
}
