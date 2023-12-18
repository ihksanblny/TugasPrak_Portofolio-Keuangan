/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab7;


/**
 *
 * @author Aharfi
 */
public class DataMatkul {
    String kode_mk,nama_mk,dosen_pengampu;
    int jml_sks;
    
    DataMatkul(){
        this.kode_mk = "IF2112";
        this.nama_mk = "OOP";
        this.dosen_pengampu = "YOSEP AGUS PRANOTO, ST.MT.";
        this.jml_sks = 4;
    }
    void dataKode(String kode_mk){
        this.kode_mk = kode_mk;
    }
    void dataMatkul(String nama_mk){
        this.nama_mk = nama_mk;
    }
    void dataDosen(String dosen_pengampu){
        this.dosen_pengampu = dosen_pengampu;
    }
    void dataSKS(int jml_sks){
        this.jml_sks = jml_sks;
    }
}
