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
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import model.AntrianPasien;
import model.Pasien;

/**
 *
 * @author jarkom
 */
public class TambahPasienBaruDialog extends JDialog implements ActionListener {

   
    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel alamatLabel;
    private JLabel nikLabel;
    private JTextField namaText;
    private JTextField alamatText;
    private JTextField nikText;
    private JButton saveButton;
   
    
    public TambahPasienBaruDialog() {
        init();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public TambahPasienBaruDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);
        
        
        judulLabel = new JLabel("Form Tambah Pasien");
        judulLabel.setBounds(150, 20, 150, 15);
        this.add(judulLabel);

        namaLabel = new JLabel("Nama                           : ");
        namaLabel.setBounds(20, 50, 170, 10);
        this.add(namaLabel);

        alamatLabel = new JLabel("Alamat                         : ");
        alamatLabel.setBounds(20, 90, 170, 10);
        this.add(alamatLabel);

        nikLabel = new JLabel("NIK                              :");
        nikLabel.setBounds(20, 130, 170, 10);
        this.add(nikLabel);

        namaText = new JTextField();
        namaText.setBounds(180, 50, 110, 25);
        this.add(namaText);
        namaText.addActionListener(this);

        alamatText = new JTextField();
        alamatText.setBounds(180, 90, 110, 25);
        this.add(alamatText);
        alamatText.addActionListener(this);

        nikText = new JTextField();
        nikText.setBounds(180, 130, 110, 25);
        this.add(alamatText);
        nikText.addActionListener(this);
        

        saveButton = new JButton("OK");
        saveButton.setBounds(200, 200, 80, 50);
        this.add(saveButton);
        saveButton.addActionListener(this);
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveButton) {
            Pasien pasien = new Pasien();
            pasien.setNama(namaText.getText());
            pasien.setAlamat(alamatText.getText());
            pasien.setNik(nikText.getText());
           
        }
    }

        

}


