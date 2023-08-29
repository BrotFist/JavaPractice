public class CaesarV1 {
  public static void main(String[] args) {
    // Im ersten Schritt speichern wir Klartext und Schlüssel direkt im Code.
    String klartext = "BIGBOIBREAD";   // Klartext (zumindest erstmal) nur in Großbuchstaben
    int schluessel = 3;
    
    String geheimtext = "";     // Geheimtext beginnt leer
    for(int i=0; i <= klartext.length()-1; i=i+1) {  // Wir gehen den Klartext zeichenweise von vorne bis hinten durch.
      char ktZeichen = klartext.charAt(i);  // i-tes Zeichen des Klartextes auslesen
      int ktZahl = (int) ktZeichen;    // Zeichen in Zahl umwandeln
      int gtZahl = ktZahl + schluessel;  // Schlüssel anwenden
      if (gtZahl > (int) 'Z') {          // Sonderfall für Zeichen über 'Z'                            
        gtZahl = gtZahl-26;
      } // end of if
      char gtZeichen = (char) gtZahl;       // Zahl zurück in Zeichen wandeln  
      geheimtext = geheimtext + gtZeichen;   // Zeichen dem Geheimtext hinzufügen
    }  
    
    // Ausgaben
    System.out.println("Verschlüsselung nach Cäsar:");
    System.out.println("Klartext   = "+klartext);
    System.out.println("Schlüssel  = "+schluessel);
    System.out.println("Geheimtext = "+geheimtext);
    
  } // end of main
} // end of class CaesarV1