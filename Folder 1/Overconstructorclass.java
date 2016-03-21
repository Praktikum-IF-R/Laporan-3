package overconsturctor;
public class Overconstructorclass {
    
    private int harga;
    private int jumlah;
    private static int totalharga = 0;
    private String obat;

    public Overconstructorclass(){
        obat = "Panadol";
        harga = 2000;
        totalharga += 0;
    }
    
    public void setobat(String a){
        obat = a;
    }
    
    public void setobat(int a , int b){
        harga = a;
        jumlah = b;
        totalharga += a*b;
    }
    
    public static int gettotalharga(){
        return totalharga;
    }
    
    public void display(){
        System.out.println("Obat    : "+obat);
        System.out.println("Harga   : "+harga);
        System.out.println("Jumlah  : "+jumlah);
    }
}
