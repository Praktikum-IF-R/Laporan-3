package apotek;

public class Apotek {

    private double harga, jumlahobat;
    String nama, alamat;
    private double obat1=4000, obat2=5000, obat3=6000;
    private double o1,o2,o3;
    
    public Apotek(){
        this.nama="";
        this.alamat="";
    }
    public Apotek(String n, String a){
        this.nama=n;
        this.alamat=a;
    }
    public double setObat1(){
        return this.o1=jumlahobat*obat1;
    }
    public double setObat2(){
        return this.o2=jumlahobat*obat2;
    }
    public double setObat3(){
        return this.o3=jumlahobat*obat3;
    }
    public void setJumlahObat(double j){
        this.jumlahobat=j;
    }
    public void HargaObat(){
        this.harga=o1+o2+o3;
    }
    public double getTotal(){
        return this.harga;
    }
    public void displayMessage(){
        System.out.println("===============================================================");
        System.out.println("\t\t-----Struk Pembelian Obat----- ");
        System.out.println("===============================================================");
        System.out.println("Nama   : "+this.nama);
        System.out.println("Alamat : "+this.alamat);
        System.out.println("Total Harga obat yang harus dibayarkan adalah : "+"Rp "+getTotal());
        System.out.println("===============================================================");
    }
}
    
