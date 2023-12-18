/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab8;

/**
 *
 * @author Aharfi
 */
public class main {
    public static void main(String[]args){
        Payment pay1 = new Payment(750000);
        pay1.tittlePurchase(1);
        
        System.out.println("Credit Balance : " + pay1.creditBalance);
        System.out.println("Emoney Balance : " + pay1.emoneyBalance);
        System.out.println("Cash Balance : " + pay1.cashBalance);
        System.out.println("=====================================");
        System.out.println("total Payment : " + pay1.total);
        System.out.println("=====================================");
        
        System.out.println("Payment with credit, Ending Balance : " + pay1.creditProses());
        System.out.println("Payment with Emoney, Ending Balance : " + pay1.emoneyProses());
        System.out.println("Payment with Emoney, Ending Balance : " + pay1.emoneyProses());
    }
    
    
    
}
