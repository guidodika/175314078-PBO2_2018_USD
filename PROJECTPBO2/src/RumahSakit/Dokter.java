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
    
    /**Merupakan kontruktor dari class Dokter.
     * 
     * @param Dokter
     */
    public Dokter(){
        
    }

    /**
     * @return the nomorPegawai
     */
    public String getNomorPegawai() {
        return nomorPegawai;
    }

    /** Fungsi ini digunakan untuk set Nomor Pegawai dengan ketentuan panjang nomor 
     * pegawai harus sama dengan 5. Jika tidak maka
     * akan mengalami kesalahan yang berakibat terjadi kesalahan pada program sehingga akan muncul 
     * pesan exception. 
     * @param nomorPegawai the nomorPegawai to set
     */
    public void setNomorPegawai(String nomorPegawai) throws Exception{
    if (nomorPegawai.length() == 5) {
            this.nomorPegawai = (nomorPegawai + nama.substring(0, 3));
        }else {
            throw new Exception("Format Tidak Sesuai");
        }
    }

    /**Fungsi ini digunakan untuk memanggil nama dokter
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**Fungsi ini digunakan untuk mengatur nama dokter
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**Fungsi ini digunakan untuk memanggil alamat dokter
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**Fungsi ini digunakan untuk mengatur alamat dokter
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**Fungsi ini digunakan untuk memanggil tempat lahir dokter
     * @return the tempatLahir
     */
    public String getTempatLahir() {
        return tempatLahir;
    }

    /**Fungsi ini digunakan untuk mengatur tempat lahir dokter
     * @param tempatLahir the tempatLahir to set
     */
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    /**Fungsi ini digunakan untuk memanggil tanggal lahir dokter
     * @return the tanggalLahir
     */
    public int getTanggalLahir() {
        return tanggalLahir;
    }

    /** Fungsi ini digunakan untuk set Tanggal Lahir dengan ketentuan 
     * tanggal lahir harus lebih besar dari 0 atau kurang dari sama dengan 31. Jika tidak maka
     * akan mengalami kesalahan yang berakibat terjadi kesalahan pada program sehingga akan muncul 
     * pesan exception. 
     * @param tanggalLahir the tanggalLahir to set
     */
    public void setTanggalLahir(int tanggalLahir) throws Exception
    {
     if (tanggalLahir > 0) {
            if (tanggalLahir <= 31) {
                this.tanggalLahir = tanggalLahir;
            } else {
                throw new Exception("SALAH,\ntidak ada tanggal lebih dari 31");
            }
        } else {
            throw new Exception("SALAH,\ntidak ada tanggal 0");
        }
}
     /**Fungsi ini digunakan untuk memanggil bulan lahir dokter
     * @return the bulanLahir
     */
    public int getBulanLahir() {
        return bulanLahir;
    }

    /**Fungsi ini digunakan untuk set bulan Lahir dengan ketentuan 
     * bulan lahir harus lebih besar dari 0 atau kurang 13. Jika tidak maka
     * akan mengalami kesalahan yang berakibat terjadi kesalahan pada program sehingga akan muncul 
     * pesan exception. 
     * @param bulanLahir the bulanLahir to set
     */
    public void setBulanLahir(int bulanLahir) throws Exception {
        if(bulanLahir>0){
            if(bulanLahir<13){
             this.bulanLahir = bulanLahir;
            } else 
         throw new Exception("SALAH,/ntidak ada bulan lahir ke-13 atau selebihnya");
        } else
            throw new Exception("SALAH, /ntidak ada bulan lahir ke-0 atau kurang dari 0");
    }

    /**Fungsi ini digunakan untuk memanggil tahun lahir dokter
     * @return the tahunLahir
     */
    public int getTahunLahir() {
        return tahunLahir;
    }

    /**Fungsi ini digunakan untuk set tahun Lahir dengan ketentuan 
     * tahun lahir harus lebih besar dari 0. Jika tidak maka
     * akan mengalami kesalahan yang berakibat terjadi kesalahan pada program sehingga akan muncul 
     * pesan exception. 
     * @param tahunLahir the tahunLahir to set
     */
    public void setTahunLahir(int tahunLahir) throws Exception {
         if(tahunLahir>0)
             this.tahunLahir = tahunLahir;
        else 
         throw new Exception("SALAH, /ntidak ada tahun lahir 0 atau kurang dari 0");
    }
   
        
    }
    
    
    

