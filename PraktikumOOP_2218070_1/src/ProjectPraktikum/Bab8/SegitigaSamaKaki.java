/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab8;


/**
 *
 * @author Aharfi
 */
public class SegitigaSamaKaki extends BangunDatar implements Keliling{
    public double alas,tinggi;
    public double a,b,c;
    @Override
    double hitungluas() {
        return ((alas * tinggi)/2);
    }

    @Override
    void tampilHasil() {
        System.out.println("Luas Segitiga : " + hitungluas());
        System.out.println("Keliling Segitiga : " + hitungKeliling());
    }

    @Override
    public double hitungKeliling() {
        return (a+b+c);
    }
    
}
