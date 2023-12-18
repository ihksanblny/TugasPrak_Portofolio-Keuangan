/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ProjectPraktikum.Bab1;

/**
 *
 * @author Aharfi
 */
public class CLI_CetakKTM {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        // membuat object dengan nama “mhs” dari class Mahasiswa
        Mahasiswa mhs = new Mahasiswa(); 
     //ketika akan menggunakan method dari class Mahasiswa makaharus menyertakan nama object
        mhs.dataNIM("2218045");
        mhs.dataNama("Ahmad Ari Firmansyah");
        mhs.dataJenisKelamin("Laki-laki ");
        mhs.dataProdi("Teknik Informatika");
        mhs.dataAngkatan("2022");
        mhs.dataAlamat("Malang");
        System.out.println("Kartu Tanda Mahasiswa ITN Malang");
        System.out.println("------------------------------------");
        System.out.println("NIM : "+ mhs.cetakNIM()); 
        System.out.println("Nama : "+ mhs.cetakNama()); 
        System.out.println("Jenis Kelamin : "+ 
        mhs.cetakJenisKelamin()); 
        System.out.println("Prodi : "+ mhs.cetakProdi()); 
        System.out.println("Angkatan : "+ mhs.cetakAngkatan()); 
        System.out.println("Alamat : "+ mhs.cetakAlamat()); 
    }
    
}
