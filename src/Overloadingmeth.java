package overloadingmeth;
import java.util.Scanner;
public class Overloadingmeth {
    public static String Overloading (int angka){
        String[] nilai = {"","satu","dua","tiga","empat","lima","enam","tujuh","delapan","sembilan","sepuluh","sebelas"};
        String n = " " ;
        if (angka<12){
            return n = " "+nilai[angka];
        }else if (angka<20){
            return n = nilai [angka-10]+"belas";
        }else if (angka<100){
            return n = Overloading(angka/10)+"puluh"+nilai[angka%10];
        }else if (angka == 100){
            return n = "seratus";
        }
        return n ;
        }
        public static void Overload (String huruf){
            String z [] = new String[1];
            if (huruf.contains(" ")){
            isi(huruf);
            }else {
                z [0] = huruf;
            }
            if (z[0].equalsIgnoreCase("dua")){
                System.out.print("2");
            }else if (z[0].equalsIgnoreCase("tiga")){
                System.out.print("3");
            }else if (z[0].equalsIgnoreCase("empat")){
                System.out.print("4");
            }else if (z[0].equalsIgnoreCase("lima")){
                System.out.print("5");
            }else if (z[0].equalsIgnoreCase("enam")){
                System.out.print("6");
            }else if (z[0].equalsIgnoreCase("tujuh")){
                System.out.print("7");
            }else if (z[0].equalsIgnoreCase("delapan")){
                System.out.print("8");
            }else if (z[0].equalsIgnoreCase("sembilan")){
                System.out.print("9");
            }else if (z[0].equalsIgnoreCase("satu")){
                System.out.print("1");
            }else if (z[0].equalsIgnoreCase("sepuluh")){
                System.out.print("10");
            }else if (z[0].equalsIgnoreCase("sebelas")){
                System.out.print("11");
            }else if (z[0].equalsIgnoreCase("seratus")){
                System.out.print("100");
        }
    }
        public static void isi (String y){
            String x [] = y.split(" ");
            if (x[1].equalsIgnoreCase("belas")){
                System.out.print("1");
            if (x[0].equalsIgnoreCase("dua")){
                System.out.print("2");
            }else if (x[0].equalsIgnoreCase("tiga")){
                System.out.print("3");
            }else if (x[0].equalsIgnoreCase("empat")){
                System.out.print("4");
            }else if (x[0].equalsIgnoreCase("lima")){
                System.out.print("5");
            }else if (x[0].equalsIgnoreCase("enam")){
                System.out.print("6");
            }else if (x[0].equalsIgnoreCase("tujuh")){
                System.out.print("7");
            }else if (x[0].equalsIgnoreCase("delapan")){
                System.out.print("8");
            }else if (x[0].equalsIgnoreCase("sembilan")){
                System.out.print("9");
            }else if (x[0].equalsIgnoreCase("satu")){
                System.out.print("1");
            if (x[1].equalsIgnoreCase("puluh")){
                if(x.length==2){
                    System.out.print("0");
                }
                if (x.length==3){
                    if(x[2].equalsIgnoreCase("dua")){
                        System.out.print("2");
                        }else if(x[0].equalsIgnoreCase("tiga")){
                        System.out.print("3");
                        }else if(x[0].equalsIgnoreCase("empat")){
                        System.out.println("4");
                        }else if(x[0].equalsIgnoreCase("lima")){
                        System.out.println("5");
                        }else if(x[0].equalsIgnoreCase("enam")){
                        System.out.println("6");
                        }else if(x[0].equalsIgnoreCase("tujuh")){
                        System.out.println("7");
                        }else if(x[0].equalsIgnoreCase("delapan")){
                        System.out.println("8");
                        }else if(x[0].equalsIgnoreCase("sembilan")){
                        System.out.println("9");
                        }else if(x[0].equalsIgnoreCase("satu")){
                        System.out.println("1");}
                    }
                }
            }
            }
        }
}