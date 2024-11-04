import java.util.Scanner;

public class FlagBerechnung {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short flags = 0b0101010011110010;
        System.out.print("Wähle eine Zahl zwischen 0 und 15!");
        byte k = input.nextByte(); //0-15
        boolean[] result = formatToBooleanArray(flags);
        boolean b = result[k];
        System.out.println(b ? "Licht ist an!" : "Licht ist aus!");

    }
    public static boolean[] formatToBooleanArray(short flag) {
        boolean[] result = new boolean[16];
        for(int k = 0;k<=15; k++) {
            if((flag & 1) == 1){
                result[k] = true;
            }
            else{
                result[k] = false;
            }

            flag = (short)(flag >> 1);
        }
        return result;
    }
}
