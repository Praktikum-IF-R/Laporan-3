package praktik03;
public class Apotek {
    private String nama;
    private String alamat;
    private double harga;
    public static Object med[][] = {{12500, 2500, 5000, 20000, 14000},{"Diapet","Paramex","Nosib","Viostin","Ambeven"}};
    
    public Apotek(String a, String b){
        this.nama = a;
        this.alamat = b;
    }
    public Apotek(){
        nama = "Belum ada.";
        alamat = "Belum ada.";
    }
    public void setNama(String a){
        this.nama = a;
    }
    public void setAlamat(String b){
        this.alamat = b;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public void display(){
        System.out.println("=========STRUK===========");
        System.out.println("Nama: "+getNama());
        System.out.println("Alamat: "+getAlamat());
    }
}
