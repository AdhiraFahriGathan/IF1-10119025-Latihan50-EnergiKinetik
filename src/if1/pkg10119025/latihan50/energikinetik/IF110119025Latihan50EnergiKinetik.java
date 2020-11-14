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
public class IF110119025Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        EnergiKinetik energiKinetik = new EnergiKinetik(145, 25);
        System.out.println("Massa : " + energiKinetik.getMassa() + " g");
        System.out.println("Kecepatan : "+energiKinetik.getVolume() + " m/s");
        System.out.printf("Energi Kinetik : %.2f joule%n", energiKinetik.hitung());
        System.out.printf("Karena energi kinetik awalnya 0 maka usaha nya  %.2f joule%n", energiKinetik.hitung());
    }
}