package apotek;
public class Apotek {
    private String Nama;
    private String Alamat;
    private int harga;
    public Apotek() {
        Nama = "";
        Alamat = "";
    }
    public Apotek(String n, String a) {
        Nama = n;
        Alamat = a;
    }
    public void DaftarObat() {
        System.out.println("1. Parasetamol           Rp 20.000");
        System.out.println("2. Diapet                Rp 10.000");
        System.out.println("3. Betadine              Rp 15.000");
        System.out.println("4. Promag                Rp 10.000");
        System.out.println("5. Fungiderm             Rp 7.000");
        System.out.println("6. Geliga                Rp 8.000");
        System.out.println("7. CTM                   Rp 6.000");
        System.out.println("8. Antibiotik            Rp 10.000");
        System.out.println("9. Vit C                 Rp 9.000");
        System.out.println("10.Bye Bye Fever         Rp 12.000");
        System.out.println("Ketik (stop) untuk selesai");
    }
    public void pesanObat(String obat) {
        if (obat.equalsIgnoreCase("Parasetamol")) {
            harga += 20000;
        }
        else if (obat.equalsIgnoreCase("Diapet")) {
            harga += 10000;
        }
        else if (obat.equalsIgnoreCase("Betadine")) {
            harga += 15000;
        }
        else if (obat.equalsIgnoreCase("Promag")) {
            harga += 10000;
        }
        else if (obat.equalsIgnoreCase("Fungiderm")) {
            harga += 7000;
        }
        else if (obat.equalsIgnoreCase("Geliga")) {
            harga += 8000;
        }
        else if (obat.equalsIgnoreCase("CTM")) {
            harga += 6000;
        }
        else if (obat.equalsIgnoreCase("Antibiotik")) {
            harga += 10000;
        }
        else if (obat.equalsIgnoreCase("Vit C")) {
            harga += 9000;
        }
        else if (obat.equalsIgnoreCase("Bye Bye Fever")) {
            harga += 12000;
        }
    }
    public void totalharga() {
        System.out.println("Total harga yang harus dibayar adalah :" + harga);
    }
}
