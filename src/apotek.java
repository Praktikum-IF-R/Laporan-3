package apotek;

public class apotek {
    private String nama;
    private String alamat;
    private String obat;
    private int jumlah;
    private static int total = 0;

    public apotek(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;}
    public apotek(String obat, int jumlah) {
        this.obat = obat;
        this.jumlah = jumlah;
        if (obat.equalsIgnoreCase("Paracetamol")) {
            hitungTotal(2500, jumlah);
        } else if (obat.equalsIgnoreCase("Amoxilin")) {
            hitungTotal(3000, jumlah);
        } else if (obat.equalsIgnoreCase("Bodrex")) {
            hitungTotal(2500, jumlah);
        } else if (obat.equalsIgnoreCase("Paramex")) {
            hitungTotal(3000, jumlah);
        } else if (obat.equalsIgnoreCase("Panadol")) {
            hitungTotal(4000, jumlah);
        } else if (obat.equalsIgnoreCase("Recohin")) {
            hitungTotal(10000, jumlah);
        } else if (obat.equalsIgnoreCase("Antalgin")) {
            hitungTotal(4000, jumlah);
        } else {
            System.out.println("Obat Tidak Tersedia");}
    }
    public static double hitungTotal(double x, double y) {
        double z = x * y;
        return z;
    }
    public static void hitungTotal(int harga, int jml) {
        total = total + (harga * jml);
        double a = Double.valueOf(jml);
        double b = Double.valueOf(harga);
        System.out.println("Total            : Rp. " + hitungTotal(a, b) + ",-");
    }
    public void display() {
        System.out.println("Nama                                : " + nama);
        System.out.println("Alamat                              : " + alamat);
        System.out.println("Jumlah Total yang harus dibayar     : Rp. " + total + ",-");
    }
}

