/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
public class Pasien {
        private String nama;
        private String alamat;
        private String nomorRekamMedis;
        private String tempatLahir;
        private Date tanggalLahir;
        private int bulanLahir;
        private int tahunLahir;

        public Pasien(String nama){
            this.nama = nama;
          
        }
    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the tempatLahir
     */
    public String getTempatLahir() {
        return tempatLahir;
    }

    /**
     * @param tempatLahir the tempatLahir to set
     */
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    /**
     * @return the tanggalLahir
     */
    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    
     public void setTanggalLahir(int tahun, int bulan, int tanggal) {
        tanggalLahir = new Date(tahun-1900,bulan-1,tanggal);
    }
    
    public int getUsia(){
        Date today = new Date();
        return today.getYear() - tanggalLahir.getYear();
    }

    /**
     * @return the nomorRekamMedis
     */
    public String getNomorRekamMedis() {
        return nomorRekamMedis;
    }

    /**
     * @param nomorRekamMedis the nomorRekamMedis to set
     */
    public void setNomorRekamMedis(String nomorRekamMedis) {
        this.nomorRekamMedis = nomorRekamMedis;
        
    }

    /**
     * @return the bulanLahir
     */
    public int getBulanLahir() {
        return bulanLahir;
    }

    /**
     * @param bulanLahir the bulanLahir to set
     */
    public void setBulanLahir(int bulanLahir) {
        this.bulanLahir = bulanLahir;
    }

    /**
     * @return the tahunLahir
     */
    public int getTahunLahir() {
        return tahunLahir;
    }

    /**
     * @param tahunLahir the tahunLahir to set
     */
    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

}
