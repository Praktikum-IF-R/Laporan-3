package sisteminformasiapotik;

public class Apotik {

    private String nama;
    private String alamat;
    private int harga;
    private String namaobat;
    private int banyakobat;
    private int a;

    public Apotik() {
        nama = "";
        alamat = "";

    }

    public Apotik(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public int Hitungtotal(String namaobat, int banyakobat) {
        this.namaobat = namaobat;

        if (namaobat.equalsIgnoreCase("obat batuk")) {
            harga += 5000 * banyakobat;
            a++;
        } else if (namaobat.equalsIgnoreCase("obat pilek")) {
            harga += 6000 * banyakobat;
            a++;
        } else if (namaobat.equalsIgnoreCase("obat pusing")) {
            harga += 7000 * banyakobat;
            a++;
        } else if (namaobat.equalsIgnoreCase("obat demam")) {
            harga += 8000 * banyakobat;
            a++;
        } else if (namaobat.equalsIgnoreCase("obat mata")) {
            harga += 9000 * banyakobat;
            a++;
        } else if (namaobat.equalsIgnoreCase("obat kulit")) {
            harga += 1000 * banyakobat;
            a++;
        }

        return harga;
    }

    public int getHarga() {
        return harga;
    }

    public int getA() {
        return a;
    }

    public void setInformasi(String nama) {
        this.nama = nama;
    }

    public void setInformasi(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void setInformasi(String namaObat, int banyakobat) {
        this.namaobat = namaobat;
        this.banyakobat = banyakobat;

    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void TampilAkhir() {
        System.out.println("*****************************************************");
        System.out.println("Anda sebagai pemesan bernama :  " + nama);
        System.out.println("yang beralamat di            :  " + alamat);
        System.out.println("dengan total pembelian obat  :  Rp." + getHarga());
        System.out.println("*********************TERIMAKASIH*********************");
    }
}
