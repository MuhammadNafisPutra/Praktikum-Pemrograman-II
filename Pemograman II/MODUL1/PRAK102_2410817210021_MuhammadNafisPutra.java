package MODUL1;
import java.util.Scanner;

public class PRAK102_2410817210021_MuhammadNafisPutra {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("");
        int number = Input.nextInt();

        int N = 0;
        while (N <= 10){
            if (number % 5 == 0 ) {
                int hasil = (number / 5) - 1;
                System.out.print(hasil);
            } else {
                System.out.print(number);
            }

            if (N < 10){
                System.out.print(", ");
            }

            number++;
            N++;

        }
    }
}
