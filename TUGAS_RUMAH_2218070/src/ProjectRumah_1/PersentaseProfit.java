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
public class PersentaseProfit extends BiayaManajemen{
    @Override
    public double hitPersentaseProfit(){
        double profit = getProfit();
        double persentaseProfit = (profit / getSaldoAwal()) * 100;
        return persentaseProfit;
    }
}
