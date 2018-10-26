/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static model.AntrianKlinik.buatAntrian;
import static model.AntrianKlinik.cariAntrian;
import static model.AntrianKlinik.daftarAntrian;
import static model.Klinik.daftarKlinik;
import static model.Pasien.daftarPasien;
import static model.Pasien.tambahPasienBaru;

/**
 *
 * @author jarkom
 */
public class RumahSakit {
    private String nama;
    private String alamat;
    private static ArrayList<AntrianKlinik> daftarAntrianKlinik = new ArrayList<AntrianKlinik>();
    private static ArrayList<Klinik> daftarKlinik = new ArrayList<Klinik>();
    
    public RumahSakit() {
    }

    public RumahSakit(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
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
    
    
        public static void bacaDaftarPasien(File file) {
        FileInputStream fis = null;
        try {

            String hasilBaca = "";
            fis = new FileInputStream(file);
            int dataInt;
            boolean noRM = false;
            boolean nama = false;
            boolean alamat = false;
            String n;
            String RM;
            String ala;
            Pasien temp = new Pasien();
            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt != '\n') {
                    if ((char) dataInt != '\t' && noRM == false && nama == false && alamat == false) {
                        hasilBaca = hasilBaca + (char) dataInt;
                    } else if ((char) dataInt == '\t' && noRM == false && nama == false && alamat == false) {
                        noRM = true;
                        temp.setNomorRekamMedis(hasilBaca);
                        hasilBaca = "";
                    } else if ((char) dataInt != '\t' && noRM == true && nama == false && alamat == false) {
                        hasilBaca = hasilBaca + (char) dataInt;
                    } else if ((char) dataInt == '\t' && noRM == true && nama == false && alamat == false) {
                        nama = true;
                        temp.setNama(hasilBaca);
                        hasilBaca = "";
                    } else if ((char) dataInt != '\t' && noRM == true && nama == true && alamat == false) {
                        hasilBaca = hasilBaca + (char) dataInt;
                    } else if ((char) dataInt == '\t' && noRM == true && nama == true && alamat == false) {
                        alamat = true;
                        temp.setAlamat(hasilBaca);
                        hasilBaca = "";
                    }
                } else {
                    alamat = true;
                    temp.setAlamat(hasilBaca);
                    hasilBaca = "";
                    tambahPasienBaru(temp);
                    nama = false;
                    noRM = false;
                    alamat = false;
                    temp = new Pasien();
                }
            }
           fis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } 
}
         public static void tambahKlinik(Klinik klinik){
        getDaftarKlinik().add(klinik);
    }
          
    public static Klinik cariKlinik(String namaKlinik){
        for (int i = 0; i < getDaftarKlinik().size(); i++) 
        {
            if(getDaftarKlinik().get(i).
                    getNamaKlinik().equalsIgnoreCase(namaKlinik))
            {
                return getDaftarKlinik().get(i);
            }
            
        }
        return null;
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
    public static void daftarPasien(Pasien pasien, int tanggal, int bulan, int tahun, Klinik klinik) {
        if (cariAntrian(tanggal, bulan, tahun, klinik) >= 0 ) {
            daftarAntrian.get(cariAntrian(tanggal, bulan, tahun, klinik)).mendaftar(pasien);

        } else {
            buatAntrian(tanggal, bulan, tahun, klinik);
            daftarAntrian.get(cariAntrian(tanggal, bulan, tahun, klinik)).mendaftar(pasien);
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
     * @return the daftarAntrianKlinik
     */
    public static ArrayList<AntrianKlinik> getDaftarAntrianKlinik() {
        return daftarAntrianKlinik;
    }

    /**
     * @param aDaftarAntrianKlinik the daftarAntrianKlinik to set
     */
    public static void setDaftarAntrianKlinik(ArrayList<AntrianKlinik> aDaftarAntrianKlinik) {
        daftarAntrianKlinik = aDaftarAntrianKlinik;
    }

    /**
     * @return the daftarKlinik
     */
    public static ArrayList<Klinik> getDaftarKlinik() {
        return daftarKlinik;
    }

    /**
     * @param aDaftarKlinik the daftarKlinik to set
     */
    public static void setDaftarKlinik(ArrayList<Klinik> aDaftarKlinik) {
        daftarKlinik = aDaftarKlinik;
    }
    
    
}
