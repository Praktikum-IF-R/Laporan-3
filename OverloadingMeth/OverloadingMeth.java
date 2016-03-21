package overloadingmeth;
public class OverloadingMeth {
    String []huruf={"Null","Satu","Dua","Tiga","Empat","Lima","Enam","Tujuh","Delapan","Sembilan","Sepuluh","Sebelas"};
    
    public void OverloadingMeth(int angka){
        
        if (angka==0){
            System.out.println(huruf[0]);
        }
        else if(angka==1){
            System.out.println(huruf[1]);
            
        }
        else if (angka==2){
                System.out.println(huruf[2]);
        }
        else if (angka==3){
                System.out.println(huruf[3]);
        }
        else if (angka==4){
            System.out.println(huruf[4]);
        }
        else if (angka==5) {
            System.out.println(huruf[5]);
        }
        else if (angka==6){
            System.out.println(huruf[6]);
        }
        else if (angka==7){
            System.out.println(huruf[7]);
        }
        else if (angka==8){
            System.out.println(huruf[8]);
        }
        else if (angka==9){
            System.out.println(huruf[9]);
        }
        else if (angka==10){
            System.out.println(huruf[10]);
        }
        else if (angka==11){
            System.out.println(huruf[11]);
        }
        else if (angka<20){
            System.out.println(huruf[angka-10] + " belas");
        }
        else if (angka==20||angka==30||angka==40||angka==50||angka==60||angka==70||angka==80||angka==90){
            System.out.println(huruf[angka/10] + " Puluh");
        }
        else if(angka>20&&angka<100){
            System.out.println(huruf[angka/10]+ " Puluh " + huruf[angka%10]);
        }
        else if (angka==100){
            System.out.println("Seratus");
        }
        else System.out.println("Melebihi range yang ditentukan");
    }
    public void OverloadingMeth(String h) {
        String huruf[] = h.split(" ");
        int angka[] = new int[3];
        for (int i = 0; i < huruf.length; i++) {
            if ((huruf[i]).equalsIgnoreCase("Satu")) {
                angka[i] = 1;
            } else if (huruf[i].equalsIgnoreCase("Dua")) {
                angka[i] = 2;
            } else if (huruf[i].equalsIgnoreCase("Tiga")) {
                angka[i] = 3;
            } else if (huruf[i].equalsIgnoreCase("Empat")) {
                angka[i] = 4;
            } else if (huruf[i].equalsIgnoreCase("Lima")) {
                angka[i] = 5;
            } else if (huruf[i].equalsIgnoreCase("Enam")) {
                angka[i] = 6;
            } else if (huruf[i].equalsIgnoreCase("Tujuh")) {
                angka[i] = 7;
            } else if (huruf[i].equalsIgnoreCase("Delapan")) {
                angka[i] = 8;
            } else if (huruf[i].equalsIgnoreCase("Sembilan")) {
                angka[i] = 9;
            }
          }
        if (!h.contains(" ")) {
            if (huruf[0].equalsIgnoreCase("Sepuluh")) {
                angka[0] = 10;
            } else if (huruf[0].equalsIgnoreCase("Sebelas")) {
                angka[0] = 11;
            } else if (huruf[0].equalsIgnoreCase("Null")) {
                angka[0] = 0;
            } else if (huruf[0].equalsIgnoreCase("Seratus")) {
                angka[0] = 100;
            }
            System.out.println(angka[0]);
        } else if (huruf.length == 2) {
            if (huruf[1].equalsIgnoreCase("belas")) {
                angka[1] = 1;
                System.out.println(angka[1] + "" + angka[0]);
            } else if (huruf[1].equalsIgnoreCase("Puluh")) {
                angka[1] = 0;
                System.out.println(angka[0] + "" + angka[1]);
            }
        } else {
            System.out.println(angka[0] + "" + angka[2]);
        }
    }
}

    
    