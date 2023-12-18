/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab9;


/**
 *
 * @author Aharfi
 */
public abstract class Penilaian {
    String NIM;
    String nama;
    String kode_mk;
    private int NP1,NP2,NP3,NilaiPrak,UTS,UAS;
    
    public double nilaiProses(){
        return((NP1*0.1)+(NP2*0.2)+(NP3*0.3)+(UTS*0.2)+(NilaiPrak*0.4));
    }
    public double nilaiAkhir(){
        return(nilaiProses()*0.6) + (UAS*0.3);
    }
    public double tampilNA(){
        return nilaiAkhir();
    }
    abstract double nilaiAktif();
    public int getNP1(){
        return NP1;
    }
    public void setNP1(int NP1){
        this.NP1 = NP1;
    }
    public int getNP2(){
        return NP2;
    }
    public void setNP2(int NP2){
        this.NP2 = NP2;
    }
    public int getNP3(){
        return NP3;
    }
    public void setNP3(int NP3){
        this.NP3 = NP3;
    }
    public int getNilaiPrak(){
        return NilaiPrak;
    }
    public void setNilaiPrak(int NilaiPrak){
        this.NilaiPrak = NilaiPrak;
    }
     public int getUTS(){
        return UTS;
    }
    public void setUTS(int UTS){
        this.UTS = UTS;
    }
     public int getUAS(){
        return UAS;
    }
    public void setUAS(int UAS){
        this.UAS = UAS;
    }  

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode_mk() {
        return kode_mk;
    }

    public void setKode_mk(String kode_mk) {
        this.kode_mk = kode_mk;
    }
}
