package apotek;
public class Apotek {
    private String nama;
    private String alamat;
    private int jmlh;
    private int obat1;
    private int obat2;
    private int obat3;
    private int obat4;
    private int harga []={2000, 5000, 7500, 10000};
    private double total;
    public Apotek(){
        nama = "";
        alamat = "";
    }
    public Apotek (String y, String z){
        nama = y;
        alamat = z;
    }
    public void jumlah (int j){
        jmlh = j;
    }
    public int obat1(){
        return obat1 = jmlh*harga[0];
    }
    public int obat2(){
        return obat2 = jmlh*harga[1];
    }
    public int obat3(){
        return obat3 = jmlh*harga[2];
    }
    public int obat4(){
        return obat4 = jmlh*harga[3];
    }
    public void Totalharga(){
        total = obat1 + obat2 + obat3 + obat4;
    }
    public double getTotalharga(){
        return total;
    }
    public void displayMessage(){
        System.out.println("===Apotek Amanah===");
        System.out.println("Nama : "+nama);
        System.out.println("Alamat : "+total);
        System.out.println("Total harga : Rp."+getTotalharga());
    }
}
