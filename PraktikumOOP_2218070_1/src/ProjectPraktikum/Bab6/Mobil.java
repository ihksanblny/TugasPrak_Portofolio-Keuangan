/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab6;

/**
 *
 * @author Aharfi
 */
public class Mobil extends Kendaraan{
    String merek,model;
    public Mobil(String type) {
        super(type);
    }
    
    @Override
    void bergerak() {
        System.out.println("Mobil Berjalan ke-depan");
    }
    
     @Override
    void berhenti() {
        System.out.println("Mobil Behenti");
    }
    
}
