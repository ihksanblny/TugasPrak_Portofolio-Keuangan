/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectRumah_1;

import java.util.Scanner;

/**
 *
 * @author ihksan
 */
public class MainKedua {
    public static void main(String[] args) {
        // Membuat objek BiayaManajemen
        BiayaManajemen biayaManajemen = new BiayaManajemen() {};

        // Menetapkan nilai atribut
        biayaManajemen.setSaldoAwal(10000);
        biayaManajemen.setProfit(5000);

        // Memanggil metode-metode dari BiayaManajemen
        double biayaAdmin = biayaManajemen.hitBiayaAdmin();
        double persentaseProfit = biayaManajemen.hitPersentaseProfit();
        double cetakSaldo = biayaManajemen.cetakSaldo();

        // Menampilkan hasil
        System.out.println("Biaya Admin: " + biayaAdmin);
        System.out.println("Persentase Profit: " + persentaseProfit + "%");
        System.out.println("Cetak Saldo: " + cetakSaldo);
    }
}
