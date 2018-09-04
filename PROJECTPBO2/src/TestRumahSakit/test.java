/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestRumahSakit;

import RumahSakit.AntrianPasien;
import RumahSakit.Pasien;

/**
 *
 * @author My Computer
 */
public class test {
    public static void main(String[] args) throws Exception {
        Pasien test1 = new Pasien("Guido");
        Pasien test2 = new Pasien("Dika");
        
        
        AntrianPasien antri1 = new AntrianPasien();
        antri1.mendaftar(test1);
        antri1.mendaftar(test2);
        
        for (int i = 0; i < antri1.getDaftarPasien().size(); i++) {
            System.out.println(antri1.getDaftarPasien().get(i).getNama());
        }
    }
}

