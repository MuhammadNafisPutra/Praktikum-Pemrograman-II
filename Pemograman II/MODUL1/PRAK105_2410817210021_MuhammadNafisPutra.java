package MODUL1;
import java.util.Scanner;

public class PRAK105_2410817210021_MuhammadNafisPutra {

    public static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double jariJari, tinggi;

        System.out.print("Masukkan jari-jari: ");
        jariJari = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        tinggi = input.nextDouble();

        double volume = PI * jariJari * jariJari * tinggi;

        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3\n", jariJari, tinggi, volume);

        input.close();
    }
}
