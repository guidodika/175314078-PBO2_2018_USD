/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import View.DaftarAntrianDialog;
import javax.swing.JFrame;

/**
 *
 * @author Guido Dika
 */
public class TestView {
    public static void main(String[] args) {
        DaftarAntrianDialog test = new DaftarAntrianDialog();
        test.setSize(500,800);
        test.setTitle("Daftar Antrian Pasien");
        test.setVisible(true);
        
        
    }
}
