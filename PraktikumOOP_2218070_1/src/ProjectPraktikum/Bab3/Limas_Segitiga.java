/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab3;

/**
 *
 * @author Aharfi
 */
public class Limas_Segitiga extends segitiga {
    double tinggiLimas,volume;
    double Hitvolume(){
        volume = ((0.333*Hitluas())*tinggiLimas);
        return volume;
    }
}
