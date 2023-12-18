/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectRumah_1;

/**
 *
 * @author ihksan
 */
public class Main {
    // Metode main untuk uji coba
    public static void main(String[] args) {
        // Membuat objek portofolio
        Portofolio portofolio = new Portofolio() {};

        // Menampilkan informasi portofolio
        System.out.println("Nama: " + portofolio.getNama());
        System.out.println("Tanggal: " + portofolio.getTanggal());
        System.out.println("Jenis: " + portofolio.getJenis());
        System.out.println("Saldo Awal: " + portofolio.getSaldoAwal());
        System.out.println("Saldo Saat Ini: " + portofolio.getSaldoSaatIni());
        System.out.println("Profit: " + portofolio.getProfit());
    }
}

