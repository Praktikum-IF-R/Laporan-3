/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BARU2;
import java.util.*;
/**
 *
 * @author Deltaviyahya
 */
public class MainUbahInput {
         static String bil;
    public static void main(String[] args) {
        System.out.println("******************************************");
        System.out.println("\tProgram Pengubah Inputan");
System.out.println("==========================================");
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan angka(0-100)(dalam angka): ");
        int bilangan = input.nextInt();
        System.out.println("Teks:");
        UbahInput.OverloadingMeth(bilangan);
        System.out.println("===========================================");
        
        System.out.print("Masukkan angka(0-100)(dalam teks):");
        bil = input.nextLine();
        bil = input.nextLine();
        System.out.println("Bilangan :");
        System.out.println(UbahInput.overloadingMeth(bil));
        
        System.out.println("*******************************************");
        
        

    }

}
