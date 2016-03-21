/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalBab3no1;

/**
 *
 * @author USER
 */
public class meth {
    private String a [] = {"nol","satu","dua","tiga","empat","lima","enam","tujuh","delapan","sembilan","sepuluh","sebelas"};
    
    public void overloadingMeth(String x){
        String huruf[] = x.split(" ");
        int angka [] = new int[3];
          for(int i=0; i<huruf.length; i++){  
            if(i!=1){  
                if(huruf[i].equalsIgnoreCase("satu")){  
                    angka[i]=1;  
                }  
                else if(huruf[i].equalsIgnoreCase("dua")){  
                    angka[i]=2;  
                }  
                else if(huruf[i].equalsIgnoreCase("tiga")){  
                    angka[i]=3;  
               }  
                else if(huruf[i].equalsIgnoreCase("empat")){  
                    angka[i]=4;  
                }  
                else if(huruf[i].equalsIgnoreCase("lima")){  
                    angka[i]=5;  
                }  
                else if(huruf[i].equalsIgnoreCase("enam")){  
                    angka[i]=6;  
                }  
                else if(huruf[i].equalsIgnoreCase("tujuh")){  
                    angka[i]=7;  
                }  
                else if(huruf[i].equalsIgnoreCase("delapan")){  
                    angka[i]=8;  
                }  
                else if(huruf[i].equalsIgnoreCase("sembilan")){  
                    angka[i]=9;  
                }  
              else{  
                    if(huruf[i].equalsIgnoreCase("sepuluh")){  
                        angka[i]=10;break;  
                    }  
                    else if(huruf[i].equalsIgnoreCase("sebelas")){  
                        angka[i]=11;break;  
                    }  
                    else if(huruf[i].equalsIgnoreCase("seratus")){  
                        angka[i]=100;break;  
                    }  
                    else if(huruf[i].equalsIgnoreCase("nol")){  
                        angka[i]=0;break;  
                    }  
                }  
            }  
            else{  
                if(huruf[i].equalsIgnoreCase("belas")){  
                    angka[i]=1;break;  
                }  
                else if(huruf[i].equalsIgnoreCase("puluh") && huruf.length<3){  
                     angka[i]=0;break;  
                 }                  
             }     
         }  
         if(huruf.length==1){  
             System.out.println(angka[0]);  
         }  
         else if(huruf.length==2){  
             System.out.println(angka[1]+""+angka[0]);  
         }  
         else{  
             System.out.println(angka[0]+""+angka[2]);  
         }  
     }  
     public void overloadingMeth(int y){  
         if (y>=1 && y<=11){  
             System.out.println(a[y]);  
         }  
         else if(y>11 && y<20){  
             y%=10;  
             System.out.println(a[y]+" belas");  
         }  
         else if(y>20 && y<100){  
             System.out.print(a[y/10]);  
             if(y%10==0){  
                 System.out.println(" puluh");  
             }  
             else{  
                 System.out.println(" puluh "+a[y%10]);  
             }  
         }  
         else if (y==100){  
             System.out.println("seratus");  
         }  
         else{  
             System.out.println("-");  
         }  
     }  
 }