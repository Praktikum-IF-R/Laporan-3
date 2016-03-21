package overloadingmeth;
import java.util.Scanner;
public class MainOverloadingMeth {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    Scanner in=new Scanner (System.in);
    OverloadingMeth m1 =new OverloadingMeth();
        System.out.println("=====================================================");
        System.out.println("\tMENGKONVERSI ANGKA DALAM BENTUK HURUF");
        System.out.println("=====================================================");
        System.out.println("Masukkan angka yang ingin dirubah ke huruf (1-100) : ");
        int a=input.nextInt();
        System.out.print("Hasil konversi huruf adalah : ");
        m1.OverloadingMeth(a);
        System.out.println("=====================================================");
        System.out.println();
        System.out.println("=====================================================");
        System.out.println("\tMENGKONVERSI HURUF DALAM BENTUK ANGKA");
        System.out.println("=====================================================");
        System.out.println("Masukkan huruf yang ingin dirubah ke bentuk angka : ");
        String h=in.nextLine();
        System.out.print("Hasil konversi angka adalah : ");
        m1.OverloadingMeth(h);
        System.out.println("=====================================================");
}
}
