/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.ArrayList;
import static model.Pasien.daftarPasienKlinik;

/**
 *
 * @author My Computer
 */
public class AntrianKlinik {
    
    
    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik klinik;
    private ArrayList<Pasien> daftarPasienAntri = new ArrayList<Pasien>();
    public static ArrayList<AntrianKlinik> daftarAntrian = new ArrayList<AntrianKlinik>();
    
    
    public AntrianKlinik() {
         
    }
     
    public static int cariAntrian(
            int tanggal,
            int bulan,
            int tahun,
            Klinik klinik) {
        return -1; // index list
}
    
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
    
    
      
    
    /**Fungsi ini digunakan untuk mendaftar pasien baru di nomor antrian
     * 
     * @param pasien
     * @throws Exception 
     */
    public void mendaftar(Pasien pasien) {
        getDaftarPasien().add(pasien);
    }
    
    /**Fungsi ini digunakan untuk memanggil pasien sesuai nomor antrian pasien
     * 
     * @param nomorAntrian
     * @return 
     */
 
    
    public AntrianKlinik cariPasien(String nomorRekamMedis){
        return null;
    }
    
    
    public Pasien cariPasien(String nomorRekamMedis, int tanggal, int bulan, int tahun){
        for (int i = 0; i < daftarPasienKlinik.size(); i++) {
            
            if (nomorRekamMedis == null ? daftarPasienKlinik.get(i).getNomorRekamMedis() == null
                    : nomorRekamMedis.equals(daftarPasienKlinik.get(i).getNomorRekamMedis())) {
                return daftarPasienKlinik.get(i);
            }
        }
            return null;  
    }
    
    
    
//    public void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik){
//        
//    }
//   
    
    
    public static AntrianKlinik cariAntrian(int tanggal, int bulan, int tahun, Klinik klinik){
        for (int i = 0; i < daftarAntrian.size(); i++) {
            if(daftarAntrian.get(i).getTanggalAntrian() == tanggal
                && daftarAntrian.get(i).getBulanAntrian() == bulan
                && daftarAntrian.get(i).getTahunAntrian() == tahun
                && daftarAntrian.get(i).getKlinik().getIdKlinik().equalsIgnoreCase(klinik.getIdKlinik())
                && daftarAntrian.get(i).getKlinik().getNamaKlinik().equalsIgnoreCase(klinik.getNamaKlinik()))
            {     
                return daftarAntrian.get(i);
            }
    }
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


    /**
     * @return the klinik
     */
    
    public String toString(){
        return String.valueOf(tahunAntrian)+
                String.valueOf(bulanAntrian)+
                String.valueOf(tanggalAntrian)+
                klinik.getIdKlinik()+
                klinik.getNamaKlinik();
    }
    
    
    
}
