package Ubah;
/**
 * @author DS
 */
public class Ubah {
    //pengisian data menggunakan array yang berisi nama dari angka
    private static String Urutan[]
            = {"Nol", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
//overloading meth yang digunakan untuk mengubah angka menjadi huruf
    public static void overloadingMeth(int angka) {
        //memasukkan jangkauan data
        if (angka > 0 && angka <= 100) {
            //memberi nilai sesuai inputan pada parameter
            if (angka == 0) {
                System.out.print(Urutan[0]);
            } else if (angka == 1) {
                System.out.print(Urutan[1]);
            } else if (angka == 2) {
                System.out.print(Urutan[2]);
            } else if (angka == 3) {
                System.out.print(Urutan[3]);
            } else if (angka == 4) {
                System.out.print(Urutan[4]);
            } else if (angka == 5) {
                System.out.print(Urutan[5]);
            } else if (angka == 6) {
                System.out.print(Urutan[6]);
            } else if (angka == 7) {
                System.out.print(Urutan[7]);
            } else if (angka == 8) {
                System.out.print(Urutan[8]);
            } else if (angka == 9) {
                System.out.print(Urutan[9]);
            } else if (angka == 10) {
                System.out.print(Urutan[10]);
            } else if (angka == 11) {
                System.out.print(Urutan[11]);
                //mengubah angka ke huruf yang < 20 
            } else if (angka < 20) {
                System.out.print(Urutan[angka - 10] + " Belas");
                //syntax mengubah angka ke huruf puluhan
            } else if (angka == 20 || angka == 30 || angka == 40 || angka == 50 || angka == 60 || angka == 70 || angka == 80 || angka == 90) {
                System.out.print(Urutan[angka / 10] + " Puluh ");
                //syntax mengubah angka ke angka > 20
            } else if (angka > 20) {
                System.out.println(Urutan[angka / 10] + " Puluh " + Urutan[angka - (angka / 10) * 10]);
                //syntax mengubah angka ke pada angka 100
            } else if (angka == 100) {
                System.out.print("Seratus");
            }//syntax mengubah angka ke angka yang lebih dari 100
            else if (angka > 100) {
                System.out.println("Anda melebihi batas yang ditetapkan");
            }
        }
    }
//overloading method yang digunakan untuk mengubah huruf menjadi angka    
    public static String overloadingMeth(String huruf) {
        String ubahKeAngka[] = new String[2];
        if (huruf.equalsIgnoreCase("nol")) {
            return "0";
        } else if (huruf.equalsIgnoreCase("satu")) {
            return "1";
        } else if (huruf.equalsIgnoreCase("dua")) {
            return "2";
        } else if (huruf.equalsIgnoreCase("tiga")) {
            return "3";
        } else if (huruf.equalsIgnoreCase("empat")) {
            return "4";
        } else if (huruf.equalsIgnoreCase("lima")) {
            return "5";
        } else if (huruf.equalsIgnoreCase("enam")) {
            return "6";
        } else if (huruf.equalsIgnoreCase("tujuh")) {
            return "7";
        } else if (huruf.equalsIgnoreCase("delapan")) {
            return "8";
        } else if (huruf.equalsIgnoreCase("sembilan")) {
            return "9";
        } else if (huruf.equalsIgnoreCase("sepuluh")) {
            return "10";
        } else if (huruf.equalsIgnoreCase("sebelas")) {
            return "11";
        } else if (huruf.equalsIgnoreCase("seratus")) {
            return "100";
        } else {
            //fungsi split digunakan untuk memberi jarak pada huruh
            ubahKeAngka = huruf.split(" ");
            if (ubahKeAngka.length == 2) {
                if (ubahKeAngka[1].equalsIgnoreCase("belas")) {
                    return 1 + overloadingMeth(ubahKeAngka[0]);
                } else {
                    return overloadingMeth(ubahKeAngka[0]) + "0";
                }
            } else {
                return overloadingMeth(ubahKeAngka[0]) + overloadingMeth(ubahKeAngka[2]);
            }
        }
    }
}
