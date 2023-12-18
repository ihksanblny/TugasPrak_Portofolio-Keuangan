/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab2;

/**
 *
 * @author Aharfi
 */
public class main {
    public static void main (String[]args){
         Kendaraan mobil =  new Kendaraan();
         System.out.println("Nama Kendaraan : " + mobil.nama);
         System.out.println("Warna Kendaraan : " + mobil.warna);
         System.out.println("Pabrikan Kendaran : " +mobil.pabrikan);
         System.out.println("Kecepatan Max : " + mobil.speed);
         System.out.print("Saat maju : "); mobil.kendaraanMaju();
         System.out.print("Saat mundur : ");mobil.kendaraanMundur();
         System.out.print("Saat berhenti : ");mobil.kendaraanBerhenti();
         
    }
   
    
}
