import java.util.Scanner;
public class apotek {
 private String nama, alamat;
 private int total, b;
 private String []obat = new String [5];
 private int []banyak = new int[30];
 private int []harga = new int [5];
public apotek(){
  nama= " ";
  alamat= " ";
}
public apotek (String nama, String alamat){
    this.nama=nama;
    this.alamat=alamat;
}
public void trans(int x){
    b=x;
    Scanner in= new Scanner (System.in);
    for (int i=0; i<b; i++){
        System.out.print("Nama obat: ");
        obat[i]= in.next();
        switch (obat[i]){
        case "ACTIFED":
        System.out.print("Masukkan jumlah obat: ");
        banyak[i]= in.nextInt();
        System.out.println("Harga: Rp 30000");
        System.out.println();
        harga[i]= banyak[i]*30000;
        total+=harga[i];break;
            
        case "BROADAMOX":
        System.out.print("Masukkan jumlah obat: ");
        banyak[i]=in.nextInt();
        System.out.println("Harga: Rp 50000");
        System.out.println();
        harga[i]= banyak[i]*50000;
        total+=harga[i];break;
        
        case "CALADINE": 
        System.out.print("Masukkan jumlah obat: ");
        banyak[i]=in.nextInt();
        System.out.println("Harga: Rp 8000");
        System.out.println();
        harga[i]= banyak[i]*8000;
        total+=harga[i];break;
        
        case "DULCOLAX":
        System.out.print("Masukkan jumlah obat: ");
        banyak[i]=in.nextInt();
        System.out.println("Harga: Rp 10500");
        System.out.println();
        harga[i]= banyak[i]*10500;
        total+=harga[i];break;
    }
    }
}
public int getHarga(){
    return total;
}
public void trans(){
    System.out.println("*****************************************");
    System.out.println("        APOTIK MAKMUR SEJAHTERA          ");
    System.out.println("*****************************************");
    System.out.println("Nama: "+nama);
    System.out.println("Alamat: "+alamat);
    System.out.println("Nama Obat\tBanyak\t Harga");
        for(int i=0;i<b;i++){
        System.out.println(obat[i] + "   \t  " + banyak[i]+ "\tRp " + harga[i]);
        }
    System.out.println("*****************************************");
    System.out.println("Total Harga: Rp "+getHarga());
}
public void display(){
        System.out.println("***************************************");
        System.out.println("NAMA OBAT\t\t HARGA");
        System.out.println("ACTIFED\t\t\t 30000");
        System.out.println("BROADAMOX\t\t 50000");
        System.out.println("CALADINE\t\t 8000");
        System.out.println("DULCOLAX\t\t 10500");
        System.out.println("***************************************");
}
}