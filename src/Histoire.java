public class Histoire {

    public static void main(String[] args) {

        // LE PITCH
        Humain narrateur = new Humain("<narrateur>");

        Cowboy cowboy = new Cowboy("Boubi"); // the nerd
        Dame dame = new Dame("Jessicah"); // the biatch
        Brigand brigand = new Brigand("Marc"); // and the thug

        // Histoire : acte I scène 1
        narrateur.parle("Il était une fois à Java Town...");
        dame.presenter();
        cowboy.presenter();
        cowboy.boire();
        narrateur.parle("Lorsque soudain, un thug sauvage entre en scène");
        brigand.presenter();
        brigand.kidnapper(dame);
        narrateur.parle("Mais que va faire le héro ?!");

        // Histoire : acte I scène 2
        cowboy.tirer(brigand);
        brigand.emprisonner(cowboy);
        cowboy.liberer(dame);

        // Histoire : acte I scène 3
        narrateur.parle("Un peu plus tard, à Java Town. " + cowboy.quel_est_ton_nom() + " a flatté " + dame.quel_est_ton_nom() + " selon la tradition.");
        dame.changerRobe("orange");
        narrateur.parle("THE END (?)");
    }
}
