package overloadingmeth;
import java.util.Scanner;
public class mainOverloadingmeth {
    public static void main(String[] args) {
        Overloadingmeth test = new Overloadingmeth();
        System.out.println("Pilihan : ");
        System.out.println("1. Angka ke Huruf ");
        System.out.println("2. Huruf ke Angka ");
        System.out.println("3. Keluar");
        Scanner input = new Scanner (System.in);
        Scanner input2 = new Scanner (System.in);
        int pilihan;
        do {
            System.out.println();
            System.out.print("Masukkan pilihan anda : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Angka ke Huruf : ");
                    int l = input.nextInt();
                    System.out.println("Hasil : " + test.Overloading(l));
                    break;
                case 2:
                    System.out.print("Masukkan huruf : ");
                    String h = input2.next();
                    System.out.print("Huruf ke Angka : ");
                    test.Overload(h);
                    System.out.println();
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        } while (pilihan !=3);
    }
}