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
public interface Investasi {
    double getJumlahInvestasi();
    double getBatasInvestasi();
    void setBatasInvestasi(double batasInvestasi);
    boolean batasInvest(double jumlah);
}
