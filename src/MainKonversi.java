/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainkonversi;
import java.util.Scanner;

/**
 *
 * @author ANITA
 */
public class MainKonversi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner ins = new Scanner(System.in);
        konversi an = new konversi();
    
        System.out.print("Masukkan angka = ");
        int a = in.nextInt();
        System.out.print("Angka ke Huruf  : ");
        an.overloadingMeth(a);
        System.out.println("");
        System.out.print("Masukkan huruf = ");
        String b = ins.nextLine();
        System.out.println("Huruf ke Angka  : "+an.overloadingMeth(b));
    }
    
}
