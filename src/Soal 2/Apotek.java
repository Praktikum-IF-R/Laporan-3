package Overloading;
public class Apotek {
private String nama, alamat; 
    private static int total;
    private static int a, b, c, d, e;
    public Apotek() {
        nama = "";
        alamat = "";
    }
    public Apotek(String a, String b) {
        nama = a;
        alamat = b;
    }
    public static void setHarga(int a1, int b1, int c1, int d1, int e1) {
        a = a1;
        b = b1;
        c = c1;
        d = d1;
        e = e1;
    }
    public static void getDaftarObat() {
        System.out.println("==========Daftar Obat===========");
        System.out.println("1. Obat Sakit Kepala   : " + a);
        System.out.println("2. Obat Sakit Perut    : " + b);
        System.out.println("3. Paracetamol         : " + c);
        System.out.println("4. Obat Influenza      : " + d);
        System.out.println("5. Obat Magh           : " + e);
    }
    public void pilihObat(int pilih) {
        int harga;
        switch (pilih) {
            case 1:
                harga = a;
                break;
            case 2:
                harga = b;
                break;
            case 3:
                harga = c;
                break;
            case 4:
                harga = d;
                break;
            case 5:
                harga = e;
                break;
            default:
                harga = 0;
                break;
        }
       Total(harga);
    }
    private void Total(int harga) {
        total = 0;
        total = total+harga;
    }
    public void getTotal() {
        System.out.println("===========TOTAL BIAYA===========");
        System.out.println("Nama                        \t:"+nama);
        System.out.println("Alamat                      \t:"+alamat);
        System.out.println("Biaya Obat Yang Anda Pilih  \t:Rp."+total);
    }
    }
    

