public class Histoire {

    public static void main(String[] args) {

        // LE PITCH
        Humain narrateur = new Humain("<narrateur>");

        Cowboy delo = new Cowboy("Jean"); // the nerd
        Dame jessicah = new Dame("Jessicah"); // the biatch
        Brigand marc = new Brigand("Marc"); // and the thug

        // Histoire : acte I scène 1
        narrateur.parle("Il était une fois à Java Town...");
        delo.presenter();
        delo.boire();
        narrateur.parle("Lorsque soudain...");
        marc.parle("Héhé je suis méchaaant !");
        narrateur.parle("Un thug sauvage fait son entrée");
        marc.kidnapper(jessicah);
        narrateur.parle("Mais que va faire le héro ?!");

        // Histoire : acte I scène 2
        delo.tirer(marc);
        marc.emprisonner(delo);
        delo.liberer(jessicah);

        // Histoire : acte I scène 3
        narrateur.parle("Un peu plus tard, à Java Town. " + delo.nom + " a flatté " + jessicah.nom + " selon la tradition.");
        jessicah.changerRobe("orange");
        narrateur.parle("THE END (?)");
    }
}
