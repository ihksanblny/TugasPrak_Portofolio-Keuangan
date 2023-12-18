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
public class Credit {
    void cekKartuCredit (String norek,String input){
        if(norek.equals(input)){
            System.out.println("Pembayaran Credit Sukses");
        }else {
            System.out.println("Pembayaran Gagal, kata sandi salah");
        }
    }
}
