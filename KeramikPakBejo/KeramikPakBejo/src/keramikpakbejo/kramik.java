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
public class kramik {
    /*Membuat Atribut*/
    int harga;
    int isiBox;
    double luasRumah;
    double sisi;
    double sisi2;
    
    /*Constructor*/
    kramik(int rp, int bx, double l, double s, double ss){
        this.harga = rp;
        this.isiBox = bx;
        this.luasRumah = l;
        this.sisi = s;
        this.sisi2 = ss;
    }
    /*Membuat Method*/
    double luasKramik(){
        double luas;
        luas = this.sisi * this.sisi2;
       return luas;
    }
    int hargaSatuan(){
        int satuan;
        satuan = this.harga / this.isiBox;
     return satuan;
    }
    double banyakKramik(){
        double butuh;
        butuh = Math.ceil (this.luasRumah/this.luasKramik());
        return butuh;
    }
    double harga(){
        double bayar;
        bayar = this.banyakKramik()* this.hargaSatuan();
        return bayar;
    }
}
