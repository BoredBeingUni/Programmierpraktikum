import java.util.Scanner;

public class BitAbfrage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Variable flags
        System.out.print("Geben Sie den Wert für flags ein (short): ");
        short flags = scanner.nextShort();

        // Eingabe der Variable k
        byte k = readByte(scanner, "Geben Sie den Wert für k ein (zwischen 0 und 15): ");

        // Berechnung des k-ten Bits
        int b = (flags >> k) & 1;

        // Ausgabe des Ergebnisses
        System.out.println("Der Wert des " + k + "-ten Bits von flags ist: " + b);
    }

    // Methode zum sicheren Einlesen einer Zahl zwischen 0 und 15
    public static byte readByte(Scanner scanner, String message) {
        byte number = -1;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print(message);
                number = Byte.parseByte(scanner.nextLine());
                if (number >= 0 && number <= 15) {
                    validInput = true;
                } else {
                    System.out.println("Bitte geben Sie einen Wert zwischen 0 und 15 ein.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine Ganzzahl zwischen 0 und 15 ein.");
            }
        }
        return number;
    }
}
