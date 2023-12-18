/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab3;

/**
 *
 * @author Aharfi
 */
public class tabung extends Lingkaran{
    //atribut
    double t,luaspermukaan,volume;
    //method
    double Hitvol(){
        volume = Hitluas()*t;
        return volume;
    }
    double HitLP(){
        luaspermukaan = (2*pi*r*r)+(2*pi*r*t);
        return luaspermukaan;
    }
    void Keterangan(){
        System.out.println("Berikut adalah perhitungan tabung");
    }
    //constructor
    tabung(){
        t = 7;
    }
}
