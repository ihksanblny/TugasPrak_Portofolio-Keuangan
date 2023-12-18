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
public abstract class DataInvestor extends Portofolio implements Investasi {
    public String namaInvestor;
    public double jumlahInvestasi;
    private double batasInvestasi;
    public double saldosaatini;

    public DataInvestor() {
        super(); // Memanggil konstruktor kelas induk (Portofolio)
        this.namaInvestor = "Bapak Ali";
        this.jumlahInvestasi = 0.0;
        this.batasInvestasi = 500000.0; // Misalnya, batas investasi adalah 500,000
    }
    public String getNamaInvestor() {
        return namaInvestor;
    }
    public void setNamaInvestor(String nama) {
        this.namaInvestor = nama;
    }
    
    @Override
    public double getJumlahInvestasi() {
        return jumlahInvestasi;
    }

    @Override
    public double getBatasInvestasi() {
        return batasInvestasi;
    }
    @Override
    public void setBatasInvestasi(double batasInv){
        this.batasInvestasi = batasInv;
    }    
   
    
    @Override
    public double getSaldoSaatIni() {
        return saldosaatini;
    }
    @Override
    public boolean batasInvest(double jumlah) {
        if (jumlahInvestasi + jumlah <= batasInvestasi) {
            jumlahInvestasi += jumlah;
            saldosaatini = jumlahInvestasi; // Mengupdate saldo saat ini
            setSaldoAwal(jumlahInvestasi); // Mengupdate saldo awal dari kelas induk (Portofolio)
            System.out.println(namaInvestor + " melakukan investasi sebesar " + jumlah);
            System.out.println("Jumlah Investasi saat ini : " + jumlahInvestasi);
            return true;
        } else {
            System.out.println("Investasi melebihi batas yang diizinkan.");
            return false;
        }
    }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    