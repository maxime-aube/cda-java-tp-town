public class Histoire {

    public static void main(String[] args) {

        // LE PITCH
        Cowboy cowboy = new Cowboy("Boubi"); // the nerd
        Dame dame = new Dame("Jessicah", "rose"); // the biatch
        Brigand brigand = new Brigand("Marc"); // and the thug
        Barman barman = new Barman("Ma'", "Au cloaque"); // the barmaid

        // Histoire : acte I scène 1
        Narrateur.raconter("Il était une fois à Java Town, le bar " + barman.getBar() + ", des gens buvant des trucs...");
        barman.presenter();
        dame.presenter();
        barman.servir(dame);
        cowboy.presenter();
        barman.servir(cowboy);
        cowboy.boire();
        Narrateur.raconter("Lorsque soudain, un thug sauvage entre en scène");
        brigand.presenter();
        brigand.kidnapper(dame);
        Narrateur.raconter("Oh non ! Mais que va faire le héro ?!");

        // Histoire : acte I scène 2
        cowboy.tirer(brigand);
        brigand.emprisonner(cowboy);
        cowboy.liberer(dame);

        // Histoire : acte I scène 3
        Narrateur.raconter("Un peu plus tard, à Java Town. " + cowboy.getName() + " a bien flatté " + dame.getName() + ".");
        dame.changerRobe("orange");

        Narrateur.raconter("THE END (?)");

        /*
        Sherif sherif = new Sherif("Carmelita");
        System.out.println(sherif.quel_est_ton_nom());
        sherif.rechercher(brigand);
         */

        /*
        exo 1.7
        Cowboy clint = new Sherif("Clint");
        clint.presenter();
        clint.coffrer(brigand);
        erreur variable clint of type Cowboy
        */

        /*
        exo 2.3 test classe Ripoux
         */
//        Ripoux ripoux = new Ripoux("Riri");
//        ripoux.presenter();
//        System.out.println("emprisonné : " + ripoux.isImprisoned());
//        ripoux.kidnapper(dame);
//        ripoux.coffrer(ripoux); // lol
//        System.out.println("emprisonné : " + ripoux.isImprisoned());

        /*
        exo 2.4 test classe FemmeBrigan
         */
//        FemmeBrigand femmeBrigand = new FemmeBrigand("Calamity Jane");
//        femmeBrigand.presenter();
//        femmeBrigand.kidnapper(dame);
//        femmeBrigand.emprisonner(cowboy);
    }
}
