/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab6;

/**
 *
 * @author Aharfi
 */
    public class Gaji_reward extends Gaji_abs_reward{
        double menit,tunj_bonus,gajipokok,tunj_anak,anak;
        int waktu;

        @Override
        double tunjanganAnak() {
            if (anak == 1) {
                return 0.1 * gajipokok;
            } else if (anak >= 2) {
                return 0.2 * gajipokok;
            } else {
                return 0; // Tidak memiliki anak, tunjangan anak = 0
            }
        }

        @Override
        double lembur() {
            // Konversi dari menit ke jam
            double jamLembur = menit / 60;

            // Hitung gaji lembur
            double gajiLembur = jamLembur * 25000;

            return gajiLembur;
        }
        // Metode untuk menghitung bonus pegawai
        double hitungBonusPegawai() {
            tunj_anak = tunjanganAnak();
            double bonusLembur = lembur();

            // Hitung total bonus
            double totalBonus = tunj_anak + bonusLembur;

            return totalBonus;
        }
    }
