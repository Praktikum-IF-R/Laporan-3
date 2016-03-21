/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

 import java.util.Scanner;

    
 
public class MainOverloadingAngka {
    static String huruf;
  public static void main(String[] args) {      
      OverloadingAngka a = new OverloadingAngka();
      Scanner input = new Scanner(System.in);
        System.out.println("program pengubah angka menjadi huruf bilangan dan sebaliknya");
        System.out.print("masukkan angka : ");
        int angka= input.nextInt();
        System.out.println("angka anda jika dirubah ke kata: "+ a.ovlMethod(angka));
        System.out.println("");
        System.out.print("masukkan huruf bilangan : ");
        huruf= input.nextLine();   huruf= input.nextLine();
        System.out.println("angkanya adalah : " + a.ovlMethod(huruf)); }  }

