/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan54.koordinat;

/**
 *
@author Megianto Adi saputra
 Nama         : Megianto Adi Saputra
 Kelas        : IF-2
 NIM          : 10119060
 Deskripsi    : Koordinat
 */
public class PBOIF210119060Latihan54Koordinat {
    
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat objWarnaKoordinat = new WarnaKoordinat("Jingga", 10, 4);
        
        System.out.println("warna Koordinat : "+objWarnaKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+objWarnaKoordinat.getX()+", y : "+objWarnaKoordinat.getY());
    }
    
}
