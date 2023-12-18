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
public class MainKetiga {
    public static void main(String[] args) {
        DataInvestor inv = new DataInvestor() {};
        System.out.println("Nama Investor : "+inv.getNamaInvestor());
        System.out.println("Jenis Investasi : "+inv.getJenis());
        System.out.println("Saldo Awal : "+inv.getSaldoAwal());
        
        inv.batasInvest(50000);
        inv.batasInvest(100000);
        
        System.out.println("\nSaldo Saat Ini : "+inv.getSaldoSaatIni());
    }
}
