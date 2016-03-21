package apotekmain;

public class Apotek {

    private String nama, alamat;
    private static String obat;
    private static double harga;
    private double tot;
    public Apotek(){
    nama="(Kosong)";
    alamat="(Kosong)";
    tot=0;
    }
    public Apotek(String a, String b){
            nama=a;
            alamat=b;
        }
        public void setNama(String a){
            nama=a;
        }
        public String getNama(){
            return nama;
        }
        public void setAlamat(String a){
            alamat=a;
        }
        public String getAlamat(){
            return alamat;
        }
        public static void setObatHarga(int a){
            if(a==1){
                obat="OBAT NYAMUK";
                harga=3500;
                }else if(a==2){
                    obat="OBAT HERBAL";
                    harga=5000;
                }else if(a==3){
                    obat="OBAT TIDUR";
                    harga=8000;
                }else if(a==4){
                    obat="OBAT TERLARANG";
                    harga=400000;
                }
            }
            public static double getHarga(){
                return harga;
            }
            public static String getObat(){
                return obat;
            }
            public void hitungHarga(){
                tot=tot+harga;
            }
            public double getTot(){
                return tot;
            }
            public void displayMessage(){
                System.out.println("========================");
                System.out.println(" Struk Pembelian Obat");
                System.out.println("------------------------");
                System.out.println("Nama : "+getNama());
                System.out.println("Alamat : "+getAlamat());
                System.out.println("Total : $"+getTot());
            }
        }