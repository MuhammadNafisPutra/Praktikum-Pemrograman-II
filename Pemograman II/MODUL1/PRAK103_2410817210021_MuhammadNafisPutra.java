package MODUL1;
import java.util.Scanner;

public class PRAK103_2410817210021_MuhammadNafisPutra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("");
        int number = input.nextInt();

        System.out.print("");
        int first = input.nextInt();

        int numberNow = first;

        int line = 1;

        do {
            while (numberNow % 2 == 0) {
                numberNow++;
            }
            System.out.print(numberNow + " ");

            numberNow++;
            line++;
        }

        while (line <= number);
    }
}
