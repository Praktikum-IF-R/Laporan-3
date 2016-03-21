
public class Apotek {

    private String obat;
    private int harga;
    private int tagihan;
    String nama, jalan;

    public Apotek() {

    }

    public Apotek(String nama) {
        this.nama = nama;
    }

    public Apotek(String nama, String jalan) {
        this.nama = nama;
        this.jalan = jalan;
    }

    public void setObat(String a) {
        obat = a;
    }

    public void setHarga(int a) {
        harga = a;
    }

    public void Jumlah() {
        tagihan += harga;
    }

    public void displayMessage() {
        System.out.println("Jumlah harga : " + tagihan);
    }
}
