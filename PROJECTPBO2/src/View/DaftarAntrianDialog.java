/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author user only
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
        
        judulLabel = new JLabel("Daftar Antrian Dialog");
        judulLabel.setBounds(150, 20, 150, 15);
        this.add(judulLabel);
        
        nomorRekamMedisLabel = new JLabel("Nomor Rekam Medis : ");
        nomorRekamMedisLabel.setBounds(20, 50, 250, 10);
        this.add(nomorRekamMedisLabel);
        
        namaLabel = new JLabel("Nama: ");
        namaLabel.setBounds(20, 90, 150, 10);
        this.add(namaLabel);
        
        alamatLabel = new JLabel("Alamat: ");
        alamatLabel.setBounds(20, 130, 150, 10);
        this.add(alamatLabel);
        
        nomorRekamMedisText = new JTextField();
        nomorRekamMedisText.setBounds(180, 50, 110, 25);
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


