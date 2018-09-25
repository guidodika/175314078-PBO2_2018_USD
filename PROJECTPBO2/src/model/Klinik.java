/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jarkom
 */
public class Klinik {
    
    public static ArrayList<Klinik> daftarKlinik = new ArrayList<Klinik>();
    
    private String idKlinik;
    private String namaKlinik;
    
    /**
     * Merupakan constructor dari class Klinik
     */
    public Klinik() {
    }
    
    public Klinik(String idKlinik, String namaKlinik){
        this.idKlinik = idKlinik;
        this.namaKlinik = namaKlinik;
    }
    
    /**
     * Method ini digunakan untuk menambah klinik kedalam list daftarKlinik
     * @param klinik 
     */
    public static void tambahKlinik(Klinik klinik){
        daftarKlinik.add(klinik);
    }
    
    /**
     * Method ini digunakan untuk mencari klinik dalam list daftarKlinik
     * @param namaKlinik
     * @return 
     */
    
    public static Klinik cariKlinik(String namaKlinik){
        for (int i = 0; i < daftarKlinik.size(); i++) 
        {
            if(daftarKlinik.get(i).
                    getNamaKlinik().equalsIgnoreCase(namaKlinik))
            {
                return daftarKlinik.get(i);
            }
            
        }
        return null;
    }

    /**Method ini digunakan untuk memanggil nomor id klinik
     * @return the idKlinik
     */
    public String getIdKlinik() {
        return idKlinik;
    }

    /**Method ini digunakan untuk mengatur nomor id klinik
     * @param idKlinik the idKlinik to set
     */
    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }

    /**Method ini digunakan untuk memanggil nama klinik
     * @return the namaKlinik
     */
    public String getNamaKlinik() {
        return namaKlinik;
    }

    /**Method ini digunakan untuk mengatur nama klinik
     * @param namaKlinik the namaKlinik to set
     */
    public void setNamaKlinik(String namaKlinik) {
        this.namaKlinik = namaKlinik;
    }
    
}
