public class CaesarV1b {
    public static void main(String[] args) {
        // eingeben: Geheimtext (string)
        String geheimtext = "ABC";
        // eingeben: Schlüssel
        int schluessel = 3;

        //Klartext beginnt leer
        String klartext = "";

        // den Geheimtext in Zahlen umwandeln anhand von char
        for (int i = 0; i < geheimtext.length(); i++) {     // Wir gehen den Geheimtext zeichenweise von vorne bis hinten durch.
            char gtZeichen = geheimtext.charAt(i);          // i-tes Zeichen des Klartextes auslesen
            int gtZahl = (int) gtZeichen;                   // Zeichen in Zahl umwandeln
            int ktZahl = gtZahl - schluessel;               // Schlüssel anwenden
            if (ktZahl < (int) 'A') {                       // Sonderfall für Zeichen unter 'A'
                ktZahl += 26;                       
            }
            char ktZeichen = (char) ktZahl;                 // Zahl zurück in Zeichen wandeln
            klartext = klartext + ktZeichen;                // Zeichen dem Klartext hinzufügen
        }
        // Ausgaben
        System.out.println("Entschlüsselung nach Caesar:");
        System.out.println("Geheimtext: "+geheimtext);
        System.out.println("Schlüssel: "+schluessel);
        System.out.println("Klartext: "+klartext);
    }
}
