/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalBab3no1;
        import java.util.Scanner;  
/**
 *
 * @author USER
 */
public class mainMeth {
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  
        Scanner in = new Scanner(System.in);  
        meth angka = new meth();  
        System.out.println("Konversi Huruf ke Bilangan");  
        System.out.print("Masukkan Angka (1-100 dalam Huruf) : ");  
        String bil = input.nextLine();  
        System.out.print("Hasil Konversi : ");  
        angka.overloadingMeth(bil);  
        System.out.println("");  
        System.out.println("Konversi Bilangan ke Huruf");  
        System.out.print("Masukkan Angka (1-100) : ");  
        int ang = input.nextInt();  
        System.out.print("Hasil Konversi : ");  
        angka.overloadingMeth(ang);  
    }  
}