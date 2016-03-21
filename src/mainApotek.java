/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apotek;
import java.util.Scanner;
public class mainApotek {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int pil;
        System.out.print("Nama          : ");
        String nm= in.nextLine();
        System.out.print("Alamat        : ");
        String al= in.nextLine();
        Apotek pilihan= new Apotek(nm, al);
        System.out.println("\n"+"Daftar obat          Harga");
        System.out.println("");
        System.out.println("1. OBH                  : 8000");
        System.out.println("2. paracetamol          : 7000");
        System.out.println("3. Abotil               : 15000");
        System.out.println("4. Betadine             : 10000");
        System.out.println("");        
            System.out.print       ("Masukkan pilihan    : ");
            pil= in.nextInt();
            switch (pil){
                case 1:
                    System.out.print("Banyak Obat        : ");
                    int a= in.nextInt();
                    pilihan.jumlah(a);
                    pilihan.obat1();
                    break;
                case 2:
                    System.out.print("Banyak obat        : ");
                    a=in.nextInt();
                    pilihan.jumlah(a);
                    pilihan.obat2();
                    break;
                case 3:
                    System.out.print("Banyak Obat        : ");
                    a=in.nextInt();
                    pilihan.jumlah(a);
                    pilihan.obat3();
                    break;
                case 4:
                    System.out.print("Banyak Obat        : ");
                    a=in.nextInt();
                    pilihan.jumlah(a);
                    pilihan.obat4();
                    break;
                default:
                    System.out.println("Obat habis");
            }
            pilihan.Total();
            pilihan.displayMessage();
        }}


