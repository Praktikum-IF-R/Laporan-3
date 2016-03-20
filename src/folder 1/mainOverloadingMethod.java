package cek.kata.angka;

import java.util.Scanner;

public class mainOverloadingMethod {

    public static void main(String[] args) {
        Scanner rheyI = new Scanner(System.in);
        Scanner rheyS = new Scanner(System.in);
        OverloadingMeth cek1 = new OverloadingMeth();
        System.out.println("MASUKKAN BILANGAN ANGKA:   (contoh: 19)");
        int A = rheyI.nextInt();
        System.out.print("HASILNYA: ");
        cek1.overloadingmeth(A);
        System.out.println("");
        System.out.println("===================================================");
        System.out.println("");
        OverloadingMeth cek2 = new OverloadingMeth();
        System.out.println("MASUKKAN SEBUTAN ANGKA:    (contoh: sembilan belas)");
        String a = rheyS.nextLine();
        System.out.print("HASILNYA: ");
        cek2.overloadingmeth(a);
        System.out.println();

    }
}
