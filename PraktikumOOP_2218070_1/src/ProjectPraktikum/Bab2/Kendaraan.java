/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab2;

/**
 *
 * @author Aharfi
 */
public class Kendaraan {
    String nama,warna,pabrikan;
    int speed;
    public Kendaraan(){
        this.nama = "Vios";
        this.warna = "Silver";
        this.pabrikan = "Toyota";
        this.speed = 200;
    }
    void kendaraanMaju(){
        System.out.println("Berjalan Maju");
    }
    void kendaraanMundur(){
        System.out.println("Berjalan Mundur");
    }
    void kendaraanBerhenti(){
        System.out.println("Kendaraan Berhenti");
    }
}
