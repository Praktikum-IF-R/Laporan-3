/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class nomer1Main {
    public static void main(String[] args) {
        Scanner masuk=new Scanner(System.in);
        Scanner msk=new Scanner(System.in);
        nomer1 tes=new nomer1();
        System.out.print("masukan angka yang akan di konversi ke kata: ");
        int a=masuk.nextInt();
        tes.overloadingmeth(a);
        System.out.println("===========================================");
        System.out.print("masukan kata yang akan dikonversi ke angka: ");
        String s=msk.nextLine();
        System.out.println("===========================================");
        tes.overloadingmeth(s);
    }
}
