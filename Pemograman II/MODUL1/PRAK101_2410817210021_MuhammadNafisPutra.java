package MODUL1;
import java.util.Scanner;

public class PRAK101_2410817210021_MuhammadNafisPutra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama :");
        String name = input.nextLine();

        System.out.print("Masukkaan Tempat Lahir :");
        String BornPlace = input.nextLine();

        System.out.print("Masukkaan Tanggal Lahir :");
        int Date = input.nextInt();

        System.out.print("Masukkaan Bulan Lahir :");
        int month = input.nextInt();

        System.out.print("Masukkaan Tahun Lahir :");
        int Year = input.nextInt();

        System.out.print("Masukkaan Tinggi Badan :");
        int  Height = input.nextInt();

        System.out.print("Masukkaan Berat Badan :");
        double Weight = input.nextDouble();

        String namaMonth = switch (month) {
            case 1  -> " Januari";
            case 2  -> " Februari";
            case 3  -> " Maret";
            case 4  -> " April";
            case 5  -> " Mei";
            case 6  -> " Juni";
            case 7  -> " Juli";
            case 8  -> " Agustus";
            case 9  -> " September";
            case 10 -> " Oktober";
            case 11 -> " November";
            case 12 -> " Desember";
            default -> "Bulan tidak valid";
        };
        System.out.println("Nama Lengkap " + name +", Lahir di " + BornPlace + " pada Tanggal " + Date + namaMonth + Year +" Tinggi Badan "+ Height +" cm " +"dan Berat Badan " + Weight + " kilogram");
    }
}


