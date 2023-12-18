/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab7;

import gabut.*;

/**
 *
 * @author Aharfi
 */
public class Cash implements dapatKembalian{

    @Override
    public double kembalian(double total, double jmlUang) {
        double jmlKembalian;
        jmlKembalian = jmlUang - total;
        return jmlKembalian;
    }
    
}
