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
public class WarnaKoordinat extends Koordinat {
    public String namaWarna;
    
    public WarnaKoordinat(String namaWarna, int x, int y){
        super(x, y);
        this.namaWarna = namaWarna;
        
    }

    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
    
}
