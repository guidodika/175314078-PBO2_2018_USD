/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guido Dika
 */
public class Pasien {

    private String nama;
        private String alamat;
        private String nomorRekamMedis;
        private String tempatLahir;
        private int tanggalLahir;
        private int bulanLahir;
        private int tahunLahir;
        private String nik;
        public static ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();
      
        

        /**Merupakan kontruktor dari class Pasien dengan parameter nama
         * 
         * @param Pasien 
         * 
         * 
         */
        
   
        public Pasien(String a, String b, String c, int d, 
                        int e, int f, String g){
           a = nama;
           b = alamat;
           c = tempatLahir;
           d = tanggalLahir;
           e = bulanLahir;
           f = tahunLahir;
           g = nik;
          
        }

    public Pasien() {
         //To change body of generated methods, choose Tools | Templates.
    }
        
        public static void tambahPasienBaru(Pasien pasien) {
        daftarPasien.add(pasien);
    }
        
          public static Pasien cariPasien(String noRM) {
              
            for (int i = 0; i < daftarPasien.size(); i++) {
            
            if (noRM == null ? daftarPasien.get(i).getNomorRekamMedis() == null
                    : noRM.equals(daftarPasien.get(i).getNomorRekamMedis())) {
                return daftarPasien.get(i);
            }
        }
            return null;     
        }

    /**Fungsi ini digunakan untuk memanggil nama pasien
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**Fungsi ini digunakan untuk mengatur nama pasien
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**Fungsi ini digunakan untuk memanggil alamat pasien
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**Fungsi ini digunakan untuk mengatur alamat pasien
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**Fungsi ini digunakan untuk memanggil nomor rekam medis
     * @return the nomorRekamMedis
     */
    public String getNomorRekamMedis() {
        return nomorRekamMedis;
    }

    /**Fungsi ini digunakan untuk set nomor rekam medis. Dengan ketentuan bahwa 
     * panjang nomor rekam medis harus kurang dari sama dengan 11 dan lebih dari
     * sama dengan 6. Jika tidak maka akan terjadi kesalahan program sehingga akan muncul pesan
     * exception.
     * @param nomorRekamMedis the nomorRekamMedis to set
     */
//    public void setNomorRekamMedis(String nomorRekamMedis) throws Exception
//    {
//        if (nomorRekamMedis.length() <= 11 && nomorRekamMedis.length() >= 6 ) {
//            this.nomorRekamMedis = nomorRekamMedis;
//        } else {
//            throw new Exception("SALAH,\n maksimal 11 karakter dan minimal 6 karakter");
//}
//    }
    
    public void setNomorRekamMedis(String nomorRekamMedis){
        this.nomorRekamMedis = nomorRekamMedis;
    }

    /**Fungsi ini digunakan untuk memanggil tempat lahir pasien
     * @return the tempatLahir
     */
    public String getTempatLahir() {
        return tempatLahir;
    }

    /**Fungsi ini digunakan untuk mengatur tempat lahir pasien
     * @param tempatLahir the tempatLahir to set
     */
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    /**Fungsi ini digunakan untuk memanggil tanggal lahir pasien
     * @return the tanggalLahir
     */
    public int getTanggalLahir() {
        return tanggalLahir;
    }

    /**Fungsi ini digunakan untuk set Tanggal Lahir dengan ketentuan 
     * tanggal lahir harus lebih besar dari 0 atau kurang dari sama dengan 31. Jika tidak maka
     * akan mengalami kesalahan yang berakibat terjadi kesalahan pada program sehingga akan muncul 
     * pesan exception. 
     * @param tanggalLahir the tanggalLahir to set
     */
    public void setTanggalLahir(int tanggalLahir) throws Exception {
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
    /**Fungsi ini digunakan untuk memanggil bulan lahir pasien
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

    /**Fungsi ini digunakan untuk memanggil tahun lahir pasien
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
   
    /**
     * Membuat nomor rekam medis sesuai tanggal sekarang
     * @return 
     */
    public String BuatRekamMedis() {
        String nomorRekamMedis;
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd");
        nomorRekamMedis = ft.format(date) + nama.substring(0, 3);
        return nomorRekamMedis;
}

    /**
     * @return the nik
     */
    public String getNik() {
        return nik;
    }

    /**
     * @param nik the nik to set
     */
    public void setNik(String nik) {
        this.nik = nik;
    }

    /**
     * @return the daftarPasien
     */
    public static ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    /**
     * @param daftarPasienKlinik the daftarPasien to set
     */
    public void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        this.daftarPasien = daftarPasien;
    }
    
    public static void simpanDaftarPasien(File file) throws IOException{
         try {
            FileOutputStream fos = new FileOutputStream(file);
            for (int i = 0; i < daftarPasien.size(); i++) {
                String data = daftarPasien.get(i).toString();
                fos.write(data.getBytes());
            }
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
}
    }
    
    
         public static void bacaDaftarPasien(File file) throws IOException{
            FileInputStream fis = new FileInputStream(file);
             
            String hasilBaca = "";
            
            int dataInt;
            
            int counter = 1;
            
            Pasien temp = new Pasien();
            
            while((dataInt=fis.read()) !=-1){
                
                if((char) dataInt != '\n'){
                    
                    if((char) dataInt != '\t'){
                        
                    hasilBaca = hasilBaca + (char) dataInt;
                    
                    } else {
                        
                        if (counter == 1){
                            temp.setNomorRekamMedis(hasilBaca);
                        } else if(counter == 2){
                            temp.setNama(hasilBaca);
                        } else {
                            temp.setAlamat(hasilBaca);
                    counter = 0;
                } 
                    counter++;
                
                    }    else 
                    
                    
                    {
                        
                    temp.setNomorRekamMedis(hasilBaca);
                    temp.setNama(hasilBaca);
                    temp.setAlamat(hasilBaca);
                    hasilBaca = "";
                    tambahPasienBaru(temp);
                    
                    }
                
            }
            
            fis.close();
         
            } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
}
         }
         
         public String toString(){
             return nomorRekamMedis + "\t" + nama + "\t" + alamat + "\n";
         }
    }

