package mainapotek;
public class Apotek {
    private String nama;
    private String alamat;
    private String obat;
    private int harga;
    public Apotek(){
        nama = "-";
        alamat = "-";
        harga = 0;
    }
    public Apotek(String a, String n){
        setIdentitas(n,a);
    }
    public void setIdentitas(String a, String n){
        nama = n;
        alamat = a;
    }
    public String getNamaPembeli(){
        return nama;
    }
    public String getAlamatPembeli(){
        return alamat;
    }
    public void setObat(String n){
        obat = n;
    }
    public void setObat(int h){
        harga = h;
    }
    public int getHargaObat(){
        return harga;
    }
    public String getNamaObat(){
        return obat;
    }
}