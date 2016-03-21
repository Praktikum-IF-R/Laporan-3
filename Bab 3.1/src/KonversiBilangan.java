public class KonversiBilangan {
    public String OverloadingMeth(int angka) {
        String[] huruf = {" ", " satu", " dua", " tiga", " empat", " lima", " enam", " tujuh", " delapan", " sembilan", " sepuluh", " sebelas"};
        String hasil = " ";

        if (angka < 12) {
            hasil = huruf[angka];
            return hasil;
        } else if (angka <= 19) {
            hasil = huruf[angka - 10] + " Belas";
            return hasil;
        } else if (angka >= 20 && angka < 100) {
            hasil = huruf[angka / 10] + " puluh" + huruf[angka % 10];
            return hasil;
        } else if (angka == 100) {
            hasil = "seratus";
        }
        return hasil;
    }

    public String OverLoadingMeth(String huruf) {

        String hasil;

        switch (huruf) {
            case ("nol"):
                hasil = "0";
                return hasil;
            case ("satu"):
                hasil = "1";
                return hasil;

            case ("dua"):
                hasil = "2";
                return hasil;

            case ("tiga"):
                hasil = "3";
                return hasil;

            case ("empat"):
                hasil = "4";
                return hasil;

            case ("lima"):
                hasil = "5";
                return hasil;

            case ("enam"):
                hasil = "6";
                return hasil;

            case ("tujuh"):
                hasil = "7";
                return hasil;

            case ("delapan"):
                hasil = "8";
                return hasil;

            case ("sembilan"):
                hasil = "9";
                return hasil;

            case ("sepuluh"):
                hasil = "10";
                return hasil;

            case ("sebelas"):
                hasil = "11";
                return hasil;

            case ("seratus"):
                hasil = "100";
                return hasil;

            default:
                String kalimat[] = huruf.split(" ");
                if (kalimat.length == 2) {
                    if (kalimat[1].equalsIgnoreCase("belas")) {
                        return "1" + OverLoadingMeth(kalimat[0]);
                    } else {
                        return OverLoadingMeth(kalimat[0]) + "0";
                    }
                } else {
                    return OverLoadingMeth(kalimat[0]) + OverLoadingMeth(kalimat[2]);
                }
        }
    }


}
    

