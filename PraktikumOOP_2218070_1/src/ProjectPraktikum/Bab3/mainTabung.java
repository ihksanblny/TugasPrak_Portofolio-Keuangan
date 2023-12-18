/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab3;

/**
 *
 * @author Aharfi
 */
public class mainTabung {
    public static void main(String[]args){
        Lingkaran lkg = new Lingkaran();
        lkg.Keterangan();
        System.out.println("Hasilnya perhitungan luas adalah :"+lkg.Hitluas());
        System.out.println("Hasilnya perhitungan keliling adalah :"+lkg.Hitkeliling());
        System.out.println("=====================================");
        tabung tbg = new tabung();
        tbg.Keterangan();
        System.out.println("Volumenya adalah :"+tbg.Hitvol());
        System.out.println("Volumenya adalah :"+tbg.HitLP());
    }

}
