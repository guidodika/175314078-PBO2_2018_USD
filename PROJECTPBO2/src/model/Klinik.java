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
    
    public Klinik(String idKlinik, String namaKlinik){
        this.idKlinik = idKlinik;
        this.namaKlinik = namaKlinik;
    }
    public Klinik() {
    }
    
    public static void tambahKlinik(Klinik klinik){
        daftarKlinik.add(klinik);
    }
    
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

    /**
     * @return the idKlinik
     */
    public String getIdKlinik() {
        return idKlinik;
    }

    /**
     * @param idKlinik the idKlinik to set
     */
    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }

    /**
     * @return the namaKlinik
     */
    public String getNamaKlinik() {
        return namaKlinik;
    }

    /**
     * @param namaKlinik the namaKlinik to set
     */
    public void setNamaKlinik(String namaKlinik) {
        this.namaKlinik = namaKlinik;
    }
    
}
