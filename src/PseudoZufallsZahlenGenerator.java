import java.util.Random;
import java.util.Scanner;

public class PseudoZufallsZahlenGenerator {

    public static void main(String[] args) {
        //Vorbedingungen werden
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Willkommen beim Pseudozufallszahlen generator.");

        //initialisieren und eingabe des Users
        int z = rand.nextInt(255);
        int a,b,m;
        a = readInteger(input);
        b = readInteger(input);
        m = readInteger(input);

        input.close();
        //System.out.println(a + " " + b + " " + m + " "+ z); debug

        int ergebnis;
        for(int i = 0;i<10;i++) {
            ergebnis = (a * z + b) % m;
            System.out.println("Pseudozufallszahlen: " + ergebnis);
            z = rand.nextInt(255);
        }
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
