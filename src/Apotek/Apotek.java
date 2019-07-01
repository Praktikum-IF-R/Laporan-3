package Overloading;

public class Apotek {

    String nama, alamat,obat;
    int harga,jumlah; 
    static int total = 0;

    public Apotek(String nam, String al) {
        nama = nam;
        alamat = al;
    }
    public Apotek() {
        System.out.println("Daftar harga obat :");
        System.out.println("1. Konidin         = 8000");
        System.out.println("2. Paracetamol     = 5000");
        System.out.println("3. OBH             = 9000");
        System.out.println("4. Amoxicilin      = 10000");
    }
    public void open() {
        System.out.println("Selamat datang !!");
        System.out.println("========Sehat Apotek========");
    }
    public void Obat(String oba) {
        obat = oba;
    }
    public void Obat(int harg,int jum){
        harga = harg;
        jumlah = jum;
        total+=(harga*jumlah);
        
    }
    public void display(){
        System.out.println("Pasien "+nama+" yang beralamat di "+alamat);
        System.out.println("Pesanan anda "+obat+" dengan harga "+harga+" sebanyak "+jumlah);
        System.out.println("Total harga = "+total);
    }
}
