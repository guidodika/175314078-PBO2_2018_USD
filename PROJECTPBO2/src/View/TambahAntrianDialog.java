/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Pasien;

/**
 *
 * @author Guido Dika
 */
public class TambahAntrianDialog extends JDialog implements ActionListener {

   
    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel nomorRekamMedisLabel;
    private JLabel alamatLabel;
    private JTextField namaText;
    private JTextField nomorRekamMedisText;
    private JTextField alamatText;
    private JButton antriButton;
    

    public TambahAntrianDialog() {
        init();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public TambahAntrianDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);
        
       
        
      
        judulLabel = new JLabel("Daftar Antrian Dialog");
        judulLabel.setBounds(150, 20, 150, 15);
        this.add(judulLabel);
        
        
        nomorRekamMedisLabel = new JLabel("Nomor Rekam Medis ");
        nomorRekamMedisLabel.setBounds(50, 90, 200, 20);
        this.add(nomorRekamMedisLabel);
        
        namaLabel = new JLabel("Nama ");
        namaLabel.setBounds(50, 130, 100, 20);
        this.add(namaLabel);
        
        alamatLabel = new JLabel("Alamat ");
        alamatLabel.setBounds(50, 170, 100, 20);
        this.add(alamatLabel);
        
        
        nomorRekamMedisText = new JTextField();
        nomorRekamMedisText.setBounds(250, 90, 150, 20);
        this.add(nomorRekamMedisText);
        
        namaText = new JTextField();
        namaText.setBounds(250, 130, 150, 20);
        this.add(namaText);
        
        alamatText = new JTextField();
        alamatText.setBounds(250, 170, 150, 20);
        this.add(alamatText);
        
         
        antriButton = new JButton("Antri");
        antriButton.setBounds(180, 300, 80, 50);
        this.add(antriButton);
        antriButton.addActionListener(this);
        
        nomorRekamMedisText.addActionListener(this);
        

        
    }
        
        
        public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nomorRekamMedisText) {
            
            if (Pasien.cariPasien(nomorRekamMedisText.getText()) != null) {
            
                namaText.setText(Pasien.cariPasien(nomorRekamMedisText.getText()).getNama());
            
                alamatText.setText(Pasien.cariPasien(nomorRekamMedisText.getText()).getAlamat());
            } else {
                JOptionPane.showMessageDialog(null, "Nomor Rekam Medis : "+nomorRekamMedisText.getText()+" Tidak Tersedia");
            }
        }
    
        if (e.getSource() == antriButton) {
            
            Pasien cari = Pasien.cariPasien(nomorRekamMedisText.getText());
            
            for (int i = 0; i < Pasien.daftarPasienKlinik.size(); i++) {
            
                if (cari == Pasien.daftarPasienKlinik.get(i)) {
            
                    JOptionPane.showMessageDialog(null, "Nomor Antrian Anda : " + (i + 1));
            
                    this.dispose();
                }
}

        }
    
    

        }
}


