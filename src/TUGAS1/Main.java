/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS1;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A;
        String B;
        Convert bilangan = new Convert();
        Convert teks = new Convert();
        System.out.print("Masukkan bilangan = ");
        A = scan.nextInt();
        System.out.println("terbilang = "+bilangan.overloadingMeth(A));
        B = scan.nextLine();
        B = scan.nextLine();
        System.out.println("angka="+teks.overloadingMeth(B));
    }
}
