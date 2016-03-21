package soalBab3no2;
import java.util.Scanner;
public class mainApotik {
    public static void main(String[] args) {
          Scanner input = new Scanner (System.in);  
           Scanner in = new Scanner (System.in);  
           int pilih = 0;  
           int harga=0,total=0, jml=0;  
           System.out.print("Masukkan Nama   : ");  
           String nama = in.next();  
           System.out.print("Masukkan Alamat : ");  
           String alamat = in.next();  
           apotik customer = new apotik();  
           do{  
               System.out.println("No.\tNama Obat\tHarga");  
               System.out.println("=================");  
               System.out.println("1.\tObat Batuk\tRp 13000");  
               System.out.println("2.\tObat Flu\tRp 8000");  
               System.out.println("3.\tObat Maag\tRp 10000");  
              System.out.println("4.\tObat Pusing\tRp 6000");  
               System.out.println("5.\tKeluar");  
               System.out.println("=================");  
              System.out.print("Masukkan pilihan : ");  
               pilih = input.nextInt();  
              switch(pilih){  
                   case 1:  
                      customer.Obat("Obat Batuk");  
                      customer.Obat(13000);  
                      System.out.println("Anda Membeli "+customer.NamaObat());  
                       System.out.print("Jumlah beli : ");  
                       jml = input.nextInt();                
                        harga = jml*customer.HargaObat();  
                       total =harga;  
                        System.out.println("Total Pembayaran : Rp "+total);  
                      System.out.println("==================================");break;  
                  case 2:  
                       customer.Obat("Obat Flu");  
                      customer.Obat(8000);  
                       System.out.println("Anda Membeli "+customer.NamaObat());  
                     System.out.print("Jumlah beli\t : ");  
                     jml = input.nextInt();  
                      harga = jml*customer.HargaObat();  
                      total =harga;  
                       System.out.println("Total Pembayaran : Rp "+total);  
                      System.out.println("==================================");break;  
                  case 3:  
                      customer.Obat("Obat Maag");  
                       customer.Obat(10000);  
                       System.out.println("Anda Membeli "+customer.NamaObat());  
                     System.out.print("Jumlah beli : ");  
                      jml = input.nextInt();  
                      harga = jml*customer.HargaObat();  
                      total =harga;  
                      System.out.println("Total Pembayaran : Rp "+total);  
                     System.out.println("==================================");break;  
                 case 4:  
                      customer.Obat("Obat Pusing");  
                      customer.Obat(6000);  
                      System.out.println("Anda Membeli "+customer.NamaObat());  
                      System.out.print("Jumlah beli : ");  
                      jml = input.nextInt();  
                      harga = jml*customer.HargaObat();  
                       total =harga;  
                       System.out.println("Total Pembayaran : Rp "+total);  
                       System.out.println("==================================");break;  
                  case 5:  
                       System.out.println("Nama\t\t : "+customer.NamaPembeli());  
                       System.out.println("Alamat\t\t : "+customer.AlamatPembeli());  
                      System.out.println("Total Pembayaran : Rp "+total);  
                       System.out.println("==================================");break;  
                         
              }  
          }while(pilih>=1 && pilih <5);  
      }  
  } 