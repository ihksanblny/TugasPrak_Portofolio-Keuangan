/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab3;

/**
 *
 * @author Aharfi
 */
public class Lingkaran {
    //atribut
    double r,pi,luas,keliling;
    //method
    void Keterangan(){
        System.out.println("Berikut adalah perhitungan lingkaran");
    }
    //method perhitungan
    double Hitluas(){
        luas = pi*r*r;
        return luas;
    }
    double Hitkeliling(){
        keliling = 2 * pi * r;
        return keliling;
    }
    //constructor
    Lingkaran(){
        r = 47;
        pi = 3.14;
    }
}
