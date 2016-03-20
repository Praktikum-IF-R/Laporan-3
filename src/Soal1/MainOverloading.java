package mainoverloading;
import java.util.Scanner;
public class MainOverloading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Overloading angka = new Overloading();
        System.out.println("Konversi Teks ke Bilangan");
        System.out.print("Masukkan Angka (1-100 dalam teks) : ");
        String bil = input.nextLine();
        System.out.print("Hasil Konversi : ");
        angka.overloadingMeth(bil);
        System.out.println("");
        System.out.println("Konversi Bilangan ke Teks");
        System.out.print("Masukkan Angka (1-100) : ");
        int ang = input.nextInt();
        System.out.print("Hasil Konversi : ");
        angka.overloadingMeth(ang);
    }
}
