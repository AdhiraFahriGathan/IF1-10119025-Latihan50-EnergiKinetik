/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan50.energikinetik;

/**
 *
 * @author User
  * * NAMA     : ADHIRA FAHRI GATHAN
 * KELAS    : PBO
 * NIM      : 10119025
 * Deskripsi Program : Program ini berisi tentang Energi Kinetik
 */
public class EnergiKinetik {
    private double massa, volume;

    public EnergiKinetik(double massa, double volume){
        this.massa = massa;
        this.volume = volume;
    }

    public double getMassa() {
        return massa;
    }

    public double getVolume() {
        return volume;
    }

    public double hitung(){
        return 0.5 * massa / 1000 * Math.pow(volume, 2);
    }
}