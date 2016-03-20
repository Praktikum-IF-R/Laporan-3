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
public class nomer2Main {
    public static void main(String[] args) {
        Scanner masuk=new Scanner(System.in);
        int pilih,i;
        System.out.print("masukan nama  : ");
        String a=masuk.next();
        System.out.print("masukan alamat: ");
        String b=masuk.next();
        nomer2 tes=new nomer2(a,b);
        do{
            System.out.println("No.\tNama Obat\tHarga");
            System.out.println("----------------------------------");
            System.out.println("1.\tObat batuk\tRp 5000");
            System.out.println("2.\tObat pilek\tRp 2000");
            System.out.println("3.\tObat gatal\tRp 10000");
            System.out.println("4.\tObat demam\tRp 3000");
            System.out.println("5.\tcetak struk");
            System.out.println("----------------------------------");
            System.out.print("Masukkan pilihan : ");
            pilih = masuk.nextInt();
            switch(pilih){
                case 1:
                    tes.obat("Obat batuk");
                    tes.obat(5000);
                    System.out.print("masukan jumlah    :");
                    i=masuk.nextInt();
                    tes.jumlah(i);
                    System.out.println("----------------------------------");break;
                case 2:
                    tes.obat("Obat pilek");
                    tes.obat(2000);
                    System.out.print("masukan jumlah    :");
                    i=masuk.nextInt();
                    tes.jumlah(i);
                    System.out.println("----------------------------------");break;
                case 3:
                    tes.obat("Obat gatal");
                    tes.obat(10000);
                    System.out.print("masukan jumlah    :");
                    i=masuk.nextInt();
                    tes.jumlah(i);
                    System.out.println("----------------------------------");break;
                case 4:
                    tes.obat("Obat demam");
                    tes.obat(3000);
                    System.out.print("masukan jumlah    :");
                    i=masuk.nextInt();
                    tes.jumlah(i);
                    System.out.println("----------------------------------");break;
            }
        }while(pilih!=5&&pilih<5);
        tes.struk();
    }
}