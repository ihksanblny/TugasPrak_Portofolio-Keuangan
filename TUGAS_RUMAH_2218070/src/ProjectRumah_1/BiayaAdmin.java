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
public class BiayaAdmin extends BiayaManajemen{
    @Override
    public double hitBiayaAdmin(){
        double saldoSaatIni = getSaldoSaatIni();
        double biayaAdmin  = saldoSaatIni*biayaAdminPersentase;
        return biayaAdmin;
    }
}
