import java.util.Scanner;

public class HashWertBerechnung {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c1,c2,c3,c4;
        System.out.print("bitte einen int eingeben: ");
        int m = readInteger(input);
        int hashwert;
        c1 = readChar(input);
        c2 = readChar(input);
        c3 = readChar(input);
        c4 = readChar(input);


        hashwert = (c1 + c2 + c3 + c4) % m;
        System.out.println("Hash wert = " + hashwert);
    }

    public static char readChar(Scanner scanner) {
        char ch = '\0';
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Bitte gültigen Character eingeben");
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
    public static int readInteger(Scanner pInput)
    {
        System.out.println("Gib bitte eine Zahl ein: ");

        while (!pInput.hasNextInt())
        {
            System.out.println("Ungültige Eingabe!");
            System.out.println("Bitte gib eine Zahl ein: ");
        }
        return pInput.nextInt();
    }

}
