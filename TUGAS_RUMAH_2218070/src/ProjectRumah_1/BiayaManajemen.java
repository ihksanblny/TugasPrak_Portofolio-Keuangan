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
public class BiayaManajemen extends Abs_BiayaManajemen {
    double biayaAdminPersentase;
    double biayaAdmin;

    public BiayaManajemen() {
        super();
        this.biayaAdminPersentase = 0.05;
        this.biayaAdmin = 25000;
    }
    public BiayaManajemen(double biayaAdminPersentase) {
        super();
        this.biayaAdminPersentase = biayaAdminPersentase;
        this.biayaAdmin = biayaAdmin;
    }
    
    @Override
    public double hitBiayaAdmin() {
        return 0;
    }

//    @Override
//    public double hitBiayaAdmin() {
//        return hitBiayaAdmin;
//    }

    @Override
    public double hitPersentaseProfit() {
        return 0;
    }

    @Override
    public double cetakSaldo() {
        return 0;
    }
    @Override
    void cetak() {
        super.cetak(); // Memanggil metode cetak dari kelas induk (Portofolio)
        System.out.println("Biaya Admin Persentase: " + biayaAdminPersentase);
    }
}



    
    

    



