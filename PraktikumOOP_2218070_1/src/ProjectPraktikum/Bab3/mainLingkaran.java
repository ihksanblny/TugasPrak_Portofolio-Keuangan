/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab3;

/**
 *
 * @author Aharfi
 */
public class mainLingkaran {
    public static void main(String[]args){
        Lingkaran lkg = new Lingkaran();
        
        lkg.Keterangan();
        System.out.println("Hasil perhitungan luas : " + lkg.Hitluas());
        System.out.println("Hasil perhitungan Keliling : " + lkg.Hitkeliling());
    }
}
