/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab6;

/**
 *
 * @author Aharfi
 */
public class main {
    public static void main (String[]args){
        System.out.println("KENDARAAN");
        Mobil x = new Mobil("JDM");
        System.out.println("merek mobil : " + x.merek);
        System.out.println("model mobil : " + x.model);
        x.bergerak();
        x.berhenti();
    }
}
