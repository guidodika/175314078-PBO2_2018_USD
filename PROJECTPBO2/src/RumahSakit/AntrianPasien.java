/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RumahSakit;

import java.util.ArrayList;

/**
 *
 * @author jarkom
 */
public class AntrianPasien {
    
    
    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunLahir;
    private int nomorAntrian=0;
    private String namaKlinik;
    private final int JUM_MAX_PASIEN=10;
    private ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();
    
    
    
    /**Fungsi ini digunakan untuk mendaftar pasien baru di nomor antrian
     * 
     * @param pasien
     * @throws Exception 
     */
    public void mendaftar(Pasien pasien) throws Exception{
        //nomor antrian dibandingkan dengan jumlah maksimal pasien//
        if(nomorAntrian < JUM_MAX_PASIEN){
        getDaftarPasien().add(pasien);
        nomorAntrian++;
        
        } else {
            throw new Exception("Antrian Penuh");
        }
    }
    
    /**Fungsi ini digunakan untuk memanggil pasien sesuai nomor antrian pasien
     * 
     * @param nomorAntrian
     * @return 
     */
 
    public Pasien panggilPasien(int nomorAntrian){
        
        return daftarPasien[nomorAntrian];    
        
        }

  
    /**Fungsi ini digunakan untuk memanggil tanggal antrian
     * @return the tanggalAntrian
     */
    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    /**Fungsi ini digunakan untuk mengatur method tanggal antrian
     * @param tanggalAntrian the tanggalAntrian to set
     */
    public void setTanggalAntrian(int tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
    }

    /**Fungsi ini digunakan untuk memanggil bulan antrian
     * @return the bulanAntrian
     */
    public int getBulanAntrian() {
        return bulanAntrian;
    }

    /**Fungsi ini digunakan untuk mengatur bulan antrian
     * @param bulanAntrian the bulanAntrian to set
     */
    public void setBulanAntrian(int bulanAntrian) {
        this.bulanAntrian = bulanAntrian;
    }

    /**Fungsi ini digunakan untuk memanggil tahun lahir
     * @return the tahunLahir
     */
    public int getTahunLahir() {
        return tahunLahir;
    }

    /**Fungsi ini digunakan untuk mengatur tahun lahir 
     * @param tahunLahir the tahunLahir to set
     */
    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

    /**Fungsi ini digunakan untuk memanggil nama klinik
     * @return the namaKlinik
     */
    public String getNamaKlinik() {
        return namaKlinik;
    }

    /**Fungsi ini digunakan untuk mengatur nama klinik
     * @param namaKlinik the namaKlinik to set
     */
    public void setNamaKlinik(String namaKlinik) {
        this.namaKlinik = namaKlinik;
    }

    /**Fungsi ini digunakan untuk memanggil daftar pasien
     * @return the daftarPasien
     */
    public ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    /**Fungsi ini digunakan untuk mengatur daftar pasien
     * @param daftarPasien the daftarPasien to set
     */
    public void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        this.daftarPasien = daftarPasien;
    }

    /**
     * @return the daftarPasien
     */
    
    
    
}
