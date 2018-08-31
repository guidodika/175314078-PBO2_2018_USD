/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RumahSakit;

/**
 *
 * @author jarkom
 */
public class AntrianPasien {
    
    
    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunLahir;
    private int nomorAntrian=0;
    private final int JUM_MAX_PASIEN=50;
    private Pasien[] daftarPasien = new Pasien[JUM_MAX_PASIEN];
    
    /**Fungsi ini digunakan untuk mendaftar pasien baru di nomor antrian
     * 
     * @param pasien
     * @throws Exception 
     */
    public void mendaftar(Pasien pasien) throws Exception{
        //nomor antrian dibandingkan dengan jumlah maksimal pasien//
        if(nomorAntrian < JUM_MAX_PASIEN){
        daftarPasien[nomorAntrian]=pasien;
        nomorAntrian++;
        } else {
            throw new Exception("antrian penuh");
        }
    }
    
    
    public Pasien panggilPasien(int nomorAntrian){
    
    }

    /**
     * @return the tanggalAntrian
     */
    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    /**
     * @param tanggalAntrian the tanggalAntrian to set
     */
    public void setTanggalAntrian(int tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
    }

    /**
     * @return the bulanAntrian
     */
    public int getBulanAntrian() {
        return bulanAntrian;
    }

    /**
     * @param bulanAntrian the bulanAntrian to set
     */
    public void setBulanAntrian(int bulanAntrian) {
        this.bulanAntrian = bulanAntrian;
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
