/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RumahSakit;

/**
 *
 * @author My Computer
 */
public class Dokter {
    private String nomorPegawai;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;
    
    public Dokter(){
        
        
    }

    /**
     * @return the nomorPegawai
     */
    public String getNomorPegawai() {
        return nomorPegawai;
    }

    /**
     * @param nomorPegawai the nomorPegawai to set
     */
    public void setNomorPegawai(String nomorPegawai) throws Exception{
    if (nomorPegawai.length() == 5) {
            this.nomorPegawai = (nomorPegawai + nama.substring(0, 3));
        }else {
            throw new Exception("Format Tidak Sesuai");
        }
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
    public int getTanggalLahir() {
        return tanggalLahir;
    }

    /**
     * @param tanggalLahir the tanggalLahir to set
     */
    public void setTanggalLahir(int tanggalLahir) throws Exception
    {
     if (tanggalLahir > 0) {
            if (tanggalLahir <= 31) {
                this.tanggalLahir = tanggalLahir;
            } else {
                throw new Exception("tidak ada tanggal lebih dari 31,\n pastikan tanggal benar");
            }
        } else {
            throw new Exception("tidak ada tanggal 0,\n pastikan tanggal benar");
        }
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
    public void setBulanLahir(int bulanLahir) throws Exception {
        if(bulanLahir>0 && bulanLahir<13)
             this.bulanLahir = bulanLahir;
        else 
         throw new Exception("Invalid val");
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
    public void setTahunLahir(int tahunLahir) throws Exception {
         if(tahunLahir>0)
             this.tahunLahir = tahunLahir;
        else 
         throw new Exception("Invalid val");
    }
   
        
    }
    
    
    

