import java.util.Scanner;

public class HashWertBerechnung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der vier Zeichen c1, c2, c3 und c4
        char c1 = readChar(scanner, "Geben Sie den ersten Buchstaben ein: ");
        char c2 = readChar(scanner, "Geben Sie den zweiten Buchstaben ein: ");
        char c3 = readChar(scanner, "Geben Sie den dritten Buchstaben ein: ");
        char c4 = readChar(scanner, "Geben Sie den vierten Buchstaben ein: ");

        // Eingabe der Konstanten m
        int m = readInteger(scanner, "Geben Sie den Wert für m ein (Ganzzahl > 0): ");

        // Berechnung des Hash-Wertes
        int hashWert = (c1 + c2 + c3 + c4) % m;

        // Ausgabe des Hash-Wertes
        System.out.println("Der Hash-Wert des Wortes ist: " + hashWert);
    }

    // Methode zum sicheren Einlesen eines einzelnen Zeichens (char)
    public static char readChar(Scanner scanner, String message) {
        char ch = '\0';
        boolean validInput = false;
        while (!validInput) {
            System.out.print(message);
            String input = scanner.nextLine();
            if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                ch = input.charAt(0);
                validInput = true;
            } else {
                System.out.println("Ungültige Eingabe. Bitte geben Sie genau einen Buchstaben ein.");
            }
        }
        return ch;
    }

    // Methode zum sicheren Einlesen einer Ganzzahl, welche den Benutzer bei Fehlern erneut auffordert
    public static int readInteger(Scanner scanner, String message) {
        int number = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print(message);
                number = Integer.parseInt(scanner.nextLine());
                if (number > 0) {
                    validInput = true;
                } else {
                    System.out.println("Bitte geben Sie eine Zahl größer als 0 ein.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine Ganzzahl ein.");
            }
        }
        return number;
    }
}
