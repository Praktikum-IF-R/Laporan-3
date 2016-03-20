package praktikum3_2;
public class Apotek {
    private String nama, alamat;
    private int [] harga = {3000,4500,5000,7000,10000,13000};
    private int jumlah, pilihan, harga2,total;
    public void jumlah (int jumlah){
        this.jumlah = jumlah;
    }
    public void setNama (String nama){
        this.nama = nama;
    }
    public void setAlamat (String alamat){
        this.alamat = alamat;
    }
    public void setPilihan (int pilihan){
        this.pilihan = pilihan;
    }
    public void setJumlah (int jumlah){
        this.jumlah = jumlah;
    }
    public String getNama (){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public int getPilihan (){
        return pilihan;
    }
    public int getHarga (){
        if (pilihan==1){
            harga2 = harga[0]*jumlah;
            total+=harga2;
        } else if (pilihan==2){
            harga2 = harga[1]*jumlah;
            total+=harga2;
        } else if (pilihan==3){
            harga2= harga[2]*jumlah;
            total+=harga2;
        } else if (pilihan==4){
            harga2=harga[3]*jumlah;
            total+=harga2;
        } else if (pilihan==5){
            harga2=harga[4]*jumlah;
            total+=harga2;
        } else if (pilihan==6){
            harga2=harga[5]*jumlah;
            total+=harga2;
        } else if (pilihan==7){
            System.out.println("---------Struk Pembelanjaan---------");
            System.out.println("Total harga keseluruhan Rp " + total);
        } return harga2;
    }
}