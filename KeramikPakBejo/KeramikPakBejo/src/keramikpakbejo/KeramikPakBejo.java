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
        kramik aa = new kramik(54000, 10, 100, 0.3, 0.3);
        System.out.println("Harga 1 pcs kramik : RP " + aa.hargaSatuan());
        System.out.println("Kramik yang dibutuhkan : " + aa.banyakKramik()+" buah");
        System.out.println("Biaya yang harus dibayar : RP " + aa.harga());
        System.out.println("------------------------------------------");
        

        kramik bb = new kramik(65000, 5, 100, 0.4, 0.4);
        System.out.println("Harga 1 buah kramik : RP " + bb.hargaSatuan());
        System.out.println("Kramik yang dibutuhkan : " + bb.banyakKramik()+" buah");
        System.out.println("Biaya yang harus dibayar : RP " + bb.harga());
        System.out.println("------------------------------------------");
        
        kramik cc = new kramik(60000, 8, 100, 0.3, 0.4);
        System.out.println("Harga 1 pcs kramik : RP " + cc.hargaSatuan());
        System.out.println("Kramik yang dibutuhkan : " + cc.banyakKramik()+" buah");
        System.out.println("Biaya yang harus dibayar : RP " + cc.harga());
        System.out.println("------------------------------------------");
    }
}
