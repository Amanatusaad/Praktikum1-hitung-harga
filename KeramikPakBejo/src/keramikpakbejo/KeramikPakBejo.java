/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keramikpakbejo;

/**
 *
 * @author HP
 */
public class KeramikPakBejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        kramik aa = new kramik();
        aa.sisi = 0.3;
        aa.sisi2 = 0.3;
        aa.luasRumah = 100;
        aa.isiBox = 10;
        aa.harga = 54000;
        System.out.println("Luas kramik : " + aa.luasKramik()+" Satuan luas");
        System.out.println("Harga 1 pcs kramik : RP " + aa.hargaSatuan());
        System.out.println("Kramik yang dibutuhkan : " + aa.banyakKramik()+" buah");
        System.out.println("Biaya yang harus dibayar : RP " + aa.harga());
        System.out.println("------------------------------------------");
        
        aa.sisi = 0.4;
        aa.sisi2 = 0.4;
        aa.luasRumah = 100;
        aa.isiBox = 5;
        aa.harga = 65000;
        System.out.println("Luas kramik : " + aa.luasKramik()+" Satuan luas");
        System.out.println("Harga 1 buah kramik : RP " + aa.hargaSatuan());
        System.out.println("Kramik yang dibutuhkan : " + aa.banyakKramik()+" buah");
        System.out.println("Biaya yang harus dibayar : RP " + aa.harga());
        System.out.println("------------------------------------------");
        
        aa.sisi = 0.3;
        aa.sisi2 = 0.4;
        aa.luasRumah = 100;
        aa.isiBox = 8;
        aa.harga = 60000;
        System.out.println("Luas kramik : " + aa.luasKramik()+" Satuan luas");
        System.out.println("Harga 1 pcs kramik : RP " + aa.hargaSatuan());
        System.out.println("Kramik yang dibutuhkan : " + aa.banyakKramik()+" buah");
        System.out.println("Biaya yang harus dibayar : RP " + aa.harga());
        System.out.println("------------------------------------------");
    }
}
