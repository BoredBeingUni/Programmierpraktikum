import java.util.Scanner;

public class PseudozufallszahlenGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0, m = 0, z = 0, n = 0;

        // Funktion zum sicheren Einlesen einer Ganzzahl
        a = readInteger(scanner, "Geben Sie den Wert für a ein (Ganzzahl): ");
        b = readInteger(scanner, "Geben Sie den Wert für b ein (Ganzzahl): ");
        m = readInteger(scanner, "Geben Sie den Wert für m ein (Ganzzahl > 0): ");
        z = readInteger(scanner, "Geben Sie den Startwert für z ein (Ganzzahl): ");
        n = readInteger(scanner, "Wie viele Zufallszahlen möchten Sie generieren?: ");

        // Pseudozufallszahlen generieren und ausgeben
        System.out.println("Generierte Zufallszahlen:");
        for (int i = 0; i < n; i++) {
            z = (a * z + b) % m;
            System.out.println("Zufallszahl " + (i + 1) + ": " + z);
        }
    }

    // Methode zum sicheren Einlesen einer Ganzzahl, welche den Benutzer bei Fehlern erneut auffordert
    public static int readInteger(Scanner scanner, String message) {
        int number = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print(message);
                number = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine Ganzzahl ein.");
            }
        }
        return number;
    }
}
