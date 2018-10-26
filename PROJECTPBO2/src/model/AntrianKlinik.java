/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Guido Dika Firguston
 */
public class AntrianKlinik implements Serializable {
    
    
    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik klinik;
    private ArrayList<Pasien> daftarPasienAntri = new ArrayList<Pasien>();
    public static ArrayList<AntrianKlinik> daftarAntrian = new ArrayList<AntrianKlinik>();
    
    
    /**
     * Merupakan constructor dari class AntrianKlinik
     */
    public AntrianKlinik() {
         
    }
   
    /**
     * Method cari pasien digunakan untuk mencari pasien dengan cara pencarian di dalam list daftarPasien 
     * yang berada di dalam list daftarAntrian
     * @param noRM
     * @return 
     */
    public static Pasien CariPasien(String noRM) {
        for (int i = 0; i < daftarAntrian.size(); i++) {
            if (daftarAntrian.get(i).getDaftarPasien().get(i).getNomorRekamMedis().equalsIgnoreCase(noRM)) {
                return daftarAntrian.get(i).getDaftarPasien().get(i);
            }
        }
        return null;
}
     /**
      * Method ini digunakan untuk mencari antrian dengan cara membandingkan 
      * @param tanggal
      * @param bulan
      * @param tahun
      * @param klinik
      * @return 
      */
      public static int cariAntrian(int tanggal, int bulan, int tahun, Klinik klinik){
        for (int i = 0; i < daftarAntrian.size(); i++) {
            if(daftarAntrian.get(i).getTanggalAntrian() == tanggal
                && daftarAntrian.get(i).getBulanAntrian() == bulan
                && daftarAntrian.get(i).getTahunAntrian() == tahun
                && daftarAntrian.get(i).getKlinik().getIdKlinik().equalsIgnoreCase(klinik.getIdKlinik())
                && daftarAntrian.get(i).getKlinik().getNamaKlinik().equalsIgnoreCase(klinik.getNamaKlinik()))
            {     
                return i;
            }
    }
    return -1;
 } 
      
     /**
      *Method ini digunakan untuk membuat antrian 
      * @param tanggal
      * @param bulan
      * @param tahun
      * @param klinik 
      */
    public static void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik){
        AntrianKlinik antrian = new AntrianKlinik();
        antrian.setTanggalAntrian(tanggal);
        antrian.setBulanAntrian(bulan);
        antrian.setTahunAntrian(tahun);
        antrian.setKlinik(klinik);
        if(cariAntrian(tanggal, bulan, tahun, klinik) < 0){
        daftarAntrian.add(antrian);
        }else{
            System.out.println("Antrian sudah ada");
        }
    }
    
    /**
     * Method ini digunakan untuk mendaftar pasien
     * @param pasien
     * @param tanggal
     * @param bulan
     * @param tahun
     * @param klinik 
     */
    public static void daftarPasien(Pasien pasien, int tanggal, int bulan, int tahun, Klinik klinik) {
        if (cariAntrian(tanggal, bulan, tahun, klinik) >= 0 ) {
            daftarAntrian.get(cariAntrian(tanggal, bulan, tahun, klinik)).mendaftar(pasien);

        } else {
            buatAntrian(tanggal, bulan, tahun, klinik);
            daftarAntrian.get(cariAntrian(tanggal, bulan, tahun, klinik)).mendaftar(pasien);
        }
}
    
    /**Fungsi ini digunakan untuk mendaftar pasien baru di nomor antrian
     * 
     * @param pasien
     * @throws Exception 
     */
    public void mendaftar(Pasien pasien) {
        daftarPasienAntri.add(pasien);
    }
    
    /**Fungsi ini digunakan untuk memanggil pasien sesuai nomor antrian pasien
     * 
     * @param nomorAntrian
     * @return 
     */
 
    
    public AntrianKlinik cariPasien(String nomorRekamMedis){
        return null;
    }
    
    
    /**Fungsi ini digunakan untuk memanggil tanggal antrian
     * @return the tanggalAntrian
     */
    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    /**Fungsi ini digunakan untuk mengatur tanggal antrian
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
    public int getTahunAntrian() {
        return tahunAntrian;
    }

    /**Fungsi ini digunakan untuk mengatur tahun lahir 
     * @param tahunLahir the tahunLahir to set
     */
    public void setTahunAntrian(int tahunAntrian) {
        this.tahunAntrian = tahunAntrian;
    }

    /**Fungsi ini digunakan untuk memanggil nama klinik
     * @return the namaKlinik
     */
    
    public Klinik getKlinik() {
        return klinik;
    }

    /**
     * @param klinik the klinik to set
     */
    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }

    /**
     * @return the daftarPasien
     */

    /**Fungsi ini digunakan untuk memanggil daftar pasien
     * @return the daftarPasien
     */
    public ArrayList<Pasien> getDaftarPasien() {
        return daftarPasienAntri;
    }

    /**
     * @param daftarPasien the daftarPasienAntri to set
     */
    public void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        this.daftarPasienAntri = daftarPasien;
    }
    
    
    public String toString(){
        return String.valueOf(tahunAntrian)+  
                String.valueOf(bulanAntrian)+
                String.valueOf(tanggalAntrian)+
                klinik.getIdKlinik()+
                klinik.getNamaKlinik();
    }
    
    
    
}
