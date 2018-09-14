/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

/**
 *
 * @author Guido Dika
 */
public class DaftarAntrianDialog extends JDialog {

   
    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel nomorRekamMedisLabel;
    private JLabel alamatLabel;
    private JTextField namaText;
    private JTextField nomorRekamMedisText;
    private JTextField alamatText;
    private JButton saveButton;

    public DaftarAntrianDialog() {
        init();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public DaftarAntrianDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);
        
       
        
        //buat judul label//
        judulLabel = new JLabel("Daftar Antrian Dialog");
        /*untuk set posisi, lebar dan tinggi tulisan
        aaa.setBounds(x, y, lebar, tinggi);
        */
        judulLabel.setBounds(150, 20, 150, 15);
        //agar dapat ditampilkan//
        this.add(judulLabel);
        
        
        nomorRekamMedisLabel = new JLabel("Nomor Rekam Medis  : ");
        nomorRekamMedisLabel.setBounds(20, 50, 250, 10);
        this.add(nomorRekamMedisLabel);
        
        namaLabel = new JLabel("Nama                           : ");
        namaLabel.setBounds(20, 90, 170, 10);
        this.add(namaLabel);
        
        alamatLabel = new JLabel("Alamat                         : ");
        alamatLabel.setBounds(20, 130, 170, 10);
        this.add(alamatLabel);
        
        // buat kolom tulisan untuk nomor rekam medis//
        nomorRekamMedisText = new JTextField();
        /*untuk set posisi, lebar dan tinggi tulisan
        aaa.setBounds(x, y, lebar, tinggi);
        */
        nomorRekamMedisText.setBounds(180, 50, 110, 25);
        //agar dapat ditampilkan//
        this.add(nomorRekamMedisText);
        
        namaText = new JTextField();
        namaText.setBounds(180, 90, 110, 25);
        this.add(namaText);
        
        alamatText = new JTextField();
        alamatText.setBounds(180, 130, 110, 25);
        this.add(alamatText);
        
        saveButton = new JButton("OK");
        saveButton.setBounds(200, 200, 80, 50);
        this.add(saveButton);
        
    }
    
    
}


