/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import model.AntrianPasien;
import model.Dokter;
import model.Pasien;

/**
 *
 * @author My Computer
 */
public class testModel {
    public static void main(String[] args) throws Exception {
        Pasien psn1 = new Pasien("Guido");

       Dokter dsn = new Dokter();
       
        AntrianPasien antri1 = new AntrianPasien();
        antri1.mendaftar(psn1);
        
        
        for (int i = 0; i < antri1.getDaftarPasien().size(); i++) {
            System.out.println(antri1.getDaftarPasien().get(i).getNama());
        }
    }
}

