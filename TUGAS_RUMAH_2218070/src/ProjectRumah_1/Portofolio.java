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
public class Portofolio {
    private String nama;
    private String tanggal;
    private String jenis;
    private double saldoAwal;
    private double saldoSaatIni;
    private double profit;
    //ModelData modelData;

    // Konstruktor
    public Portofolio() {
        this.nama = "Reksadana A";
        this.tanggal = "12-02-2023";
        this.jenis = "Reksadana";
        this.saldoAwal = 0;
        this.saldoSaatIni = 0;
        this.profit = 0;
    }
    
    // Getter dan setter untuk atribut
    public double hitSaldoSaatIni(){
        double SaldoAwal = getSaldoAwal();
        double Profit = getProfit();
        double hitSaldoSaatIni = SaldoAwal + Profit;
        return hitSaldoSaatIni;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double getSaldoAwal() {
        return saldoAwal;
    }

    public void setSaldoAwal(double saldoAwal) {
        this.saldoAwal = saldoAwal;
    }

    
    public double getSaldoSaatIni() {
        return hitSaldoSaatIni();
    }

    public void setSaldoSaatIni(double saldoSaatIni) {
        this.saldoSaatIni = saldoSaatIni;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
    
    void cetak() {
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal: " + getTanggal());
        System.out.println("Jenis: " + getJenis());
        System.out.println("Saldo Awal: " + getSaldoAwal());
        System.out.println("Profit: " + getProfit());
        System.out.println("Saldo Saat Ini: " + getSaldoSaatIni());
    }
}
    


