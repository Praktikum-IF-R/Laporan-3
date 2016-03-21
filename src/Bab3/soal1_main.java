package Bab3;

import java.util.Scanner;

public class soal1_main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        soal1 angka = new soal1();
        System.out.println("Konversi Angka <===> Huruf (0-100)");
        
        System.out.println("\n* Mengubah Angka ke Huruf");
        angka.overloadingMeth();

        System.out.println("\n* Mengubah Huruf ke Angka");
        System.out.print("  Input  : ");
        String huruf = s.nextLine();
        angka.overloadingMeth(huruf);
    }

}
