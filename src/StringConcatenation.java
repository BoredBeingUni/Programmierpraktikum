import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Benutzer zur Eingabe der ersten Zeichenkette auffordern
        System.out.print("Bitte erstes Wort eingeben: ");
        String s1 = input.nextLine();

        // Benutzer zur Eingabe der zweiten Zeichenkette auffordern
        System.out.print("Bitte zweites Wort eingeben: ");
        String s2 = input.nextLine();

        // Zeichenketten mit Leerzeichen verbinden und der dritten Variablen zuweisen
        String s3 = s1 + " " + s2;

        // Ausgabe des Ergebnisses
        System.out.println("Verbundene Zeichenkette: " + s3);

        // Scanner schließen
        input.close();
    }
}
