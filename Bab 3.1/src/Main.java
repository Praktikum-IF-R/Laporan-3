import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        KonversiBilangan konver = new KonversiBilangan();

        System.out.println("\t\t PROGRAM KONVERSI");
        System.out.print("Konversi dari Angka ke Huruf : ");
        int angka = in.nextInt();
        System.out.println("Kalimatnya adalah \t     :"+(konver.OverloadingMeth(angka)));

        System.out.print("Konversi dari Huruf ke Angka : ");
        String h = in.nextLine();
        String hh = in.nextLine();
        System.out.println("Hurufnya adalah \t     :"+(konver.OverLoadingMeth(hh)));
    }
}

    

