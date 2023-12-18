/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab6;

/**
 *
 * @author Aharfi
 */
public abstract class Kendaraan {
    String type;
    Kendaraan(String type){
        this.type = type;
    }
    abstract void bergerak();
    abstract void berhenti();
    
}
