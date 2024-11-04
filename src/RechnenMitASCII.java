import java.util.Scanner;

public class RechnenMitASCII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bitte Großbuchstaben eingeben!");
        System.out.print("Großbuchstaben: ");
        char ch = input.next().charAt(0);
        int asciiValue = (int) ch;

        // Schleifenbedingung korrigiert, um sicherzustellen, dass es sich um Großbuchstaben handelt
        while (asciiValue < 65 || asciiValue > 90) {
            System.out.println("Falscher Input: nur Großbuchstaben!!");
            System.out.println("Versuch es erneut!");
            System.out.print("Großbuchstabe: ");
            ch = input.next().charAt(0);
            asciiValue = (int) ch; // aktualisiert asciiValue nach neuer Eingabe
        }

        // Berechnung mit addTwo Methode
        ch = addTwo(ch);
        System.out.println("Ergebnis: " + ch);
        input.close(); // Scanner schließen
    }

    public static char addTwo(char character) {
        // Umwandeln des Characters in seine ASCII-Zahl und 2 hinzufügen
        int asciiValue = (int) character + 2;

        // Sicherstellen, dass das Ergebnis im Bereich von Großbuchstaben bleibt
        if (asciiValue > 90) {
            asciiValue = 65 + (asciiValue - 91);
        }

        return (char) asciiValue; // Rückgabe des neuen Char-Werts
    }
}
