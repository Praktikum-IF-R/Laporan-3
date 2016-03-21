/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadingmeth;
import java.util.Scanner;
public class mainOverloadingmeth {
      public static void main(String[] args) {
        System.out.println("  Pilihan : ");
        System.out.println("  1. Angka ke Huruf ");
        System.out.println("  2. Huruf ke Angka ");
        System.out.println("  3. Keluar         ");
        Scanner input = new Scanner(System.in);
        Scanner input2= new Scanner(System.in);
        int pil;
        do {
            System.out.println();
            System.out.print        ("Masukkan pilihan anda : ");
            pil = input.nextInt();
            switch (pil) {
                case 1:
                    System.out.print("Angka ke Huruf        : ");
                    int k= input.nextInt();
                    System.out.println("Hasil   :"+Overloadingmeth.Overloadingmeth(k));
                    break;
                case 2:
                    System.out.print("Masukan huruf         : ");
                    String hrf = input2.next();
                    System.out.print("Huruf ke Angka        : ");
                    Overloadingmeth.Overloadingmeth(hrf);
                    System.out.println();
                    break;
                default:
                    System.out.println("pilihan tidaktersedia");
                    break;
            }
        } while (pil != 3);
      }
}


