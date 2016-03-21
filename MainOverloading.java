package javaapplication83;
import java.util.Scanner;
public class MainOverloading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        JavaApplication83 konversiAngka = new JavaApplication83();
        System.out.println("Konversi Angka Ke Huruf");
        System.out.print("Masukan Angka :");
        konversiAngka.overloadingMeth(input.nextInt());
        System.out.println("Hasil Huruf : " + konversiAngka.getHasilHuruf());

        System.out.println("Konversi Huruf Ke Angka");
        System.out.print("Masukkan Huruf  : ");
        konversiAngka.overloadingMeth(input.nextLine());
        konversiAngka.overloadingMeth(input.nextLine());
        System.out.println("Angkanya adalah : " + konversiAngka.getHasilAngka());
    }

}
