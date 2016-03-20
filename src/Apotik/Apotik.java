package Apotik;

public class Apotik {
    private String nama, jenisbayar, namaobat;
    private int hargaobat;
    public Apotik(){
        nama = "";
        jenisbayar = "";
    }
    public Apotik (String nama, String jenisbayar){
        setIdentitas(nama,jenisbayar);
    }
    public void setIdentitas (String n, String j){
        nama = n;
        jenisbayar = j;
    }
    public void DaftarObat(){
        System.out.println("======================================");
        System.out.println("1. Obat Penghilang Kenangan Masa Lalu\t Rp. 5000,-");
        System.out.println("2. Obat Penghilang Galau\t\t Rp. 6000,-");
        System.out.println("3. Obat Memperindah Wajah\t\t Rp. 7000,-");
        System.out.println("4. Sianida\t\t\t\t Rp. 8000,-");
        System.out.println("======================================");
    }
    public String getNama(){
        return nama;
    }
    public String getJB(){
        return jenisbayar;
    }
    public void setObat(int o){
        this.hargaobat = o;
    }
    public void setObat(String ob){
        this.namaobat = ob;
    }
    public String getNamaObat(){
        return namaobat;
    }
    public int getHargaObat(){
        return hargaobat;
    }
   
}
