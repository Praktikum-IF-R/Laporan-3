/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverLoading;

/**
 *
 * @author nuel
 */
import java.util.Scanner;

public class MainOverloading {

    public static void main(String[] args) {
        int n;
        String t;
        Overloading over = new Overloading();
        Scanner nuel = new Scanner(System.in);
        Scanner nue = new Scanner(System.in);
        System.out.print("Masukakn angka dalam numerik : ");
        n = nuel.nextInt();
        System.out.print("Output : ");
        over.overloadingMeth(n);
        System.out.print("Masukkan angka dalam teks : ");
        t = nue.nextLine();
        System.out.print("Output : ");
        over.overloadingMeth(t);
    }
}
