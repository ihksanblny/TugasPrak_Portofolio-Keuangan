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
public abstract class BiayaManajemenABS extends Abs_BiayaManajemen {
    double biayaAdminPersentase;

    public BiayaManajemenABS() {
        super();
        this.biayaAdminPersentase = 0.05;
    }
    public BiayaManajemenABS(double biayaAdminPersentase) {
        super();
        this.biayaAdminPersentase = biayaAdminPersentase;
    }
    
    @Override
    public double hitBiayaAdmin() {
        double saldoSaatIni = getSaldoSaatIni();
        double biayaAdmin = saldoSaatIni * biayaAdminPersentase;
        return biayaAdmin;
    }

//    @Override
//    public double hitBiayaAdmin() {
//        return hitBiayaAdmin(0);
//    }

    @Override
    public double hitPersentaseProfit() {
        double profit = getProfit();
        double persentaseProfit = (profit / getSaldoAwal()) * 100;
        return persentaseProfit;
    }

    @Override
    public double cetakSaldo() {
        double saldoSaatIni = getSaldoSaatIni();
        double biayaAdmin = hitBiayaAdmin();
        double cetakSaldo = saldoSaatIni - biayaAdmin;
        return cetakSaldo;
    }
    @Override
    void cetak() {
        super.cetak(); // Memanggil metode cetak dari kelas induk (Portofolio)
        System.out.println("Biaya Admin Persentase: " + biayaAdminPersentase);
    }
}



    
    

    



