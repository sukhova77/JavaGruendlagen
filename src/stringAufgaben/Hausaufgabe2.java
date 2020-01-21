package stringAufgaben;

public class Hausaufgabe2 {
    public static void main(String[] args) {

        String vorname = "Olga";
        String nachname = "Sukhova";
        String plz = "13627";
        String strasse = "Reichweindamm";
        String haus = "54";

        int plzInt = Integer.parseInt(plz);
        int hausInt = Integer.parseInt(haus);

        System.out.println("\t\t\t-------Formular\t-------\n");
        System.out.print("Ihre Vorname: ");
        System.out.print("\t\t\t\t" + vorname + "\n");
        System.out.print("Ihre Nachname: ");
        System.out.print("\t\t\t\t" + nachname + "\n");
        System.out.print("Ihr PLZ: ");
        System.out.print("\t\t\t\t\t" + plz + "\n");
        System.out.print("Ihre Strasse: ");
        System.out.print("\t\t\t\t" + strasse + "\n");
        System.out.print("Ihr Haus: ");
        System.out.print("\t\t\t\t\t" + haus + "\n\n");
        System.out.println("\t\t-------\t Laenge jedes Wort\t-------\n");
        System.out.print("Die Name " + "\\ " + vorname + " \\" + " hat " + vorname.length() + " Buschstaben\n");
        System.out.print("Die Nachname " + "\\ " + nachname + " \\" + " hat " + nachname.length() + " Buschstaben\n");
        System.out.print("Das PLZ " + "\\ " + plz + " \\" + " hat " + plz.length() + " Ziffern\n");
        System.out.print("Das PLZ " + "\\ " + haus + " \\" + " hat " + haus.length() + " Ziffern\n");

        String a = "45";
        String b = "15";
        
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
        int summe = aInt + bInt;

        System.out.println("Die Summe a und b ist :" + (aInt + bInt) + " oder " + summe);

        // Finden die letzte Symbol in diese Zeile
        String str = "Letzte Simbole in diese Zeile - 1";
        int last = str.length() - 1;
        char ch = str.charAt(0);
        System.out.println(ch);
    }
}
