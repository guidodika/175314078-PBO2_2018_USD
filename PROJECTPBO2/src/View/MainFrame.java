/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Guido Dika Firguston
 */
public class MainFrame extends JFrame implements ActionListener{

    private JMenuBar MenuBar;
    private JMenu fileMenu;
    private JMenuItem exitMenuItem;
    private JMenuItem TambahPasien;
    private JMenuItem TambahAntrian;
    private JLabel teks;

    public MainFrame() throws HeadlessException {
        init();
    }

    public void init() {
        // buat menu bar
        MenuBar = new JMenuBar();
        fileMenu = new JMenu("Pasien");
        
        MenuBar.add(fileMenu);
        this.setJMenuBar(MenuBar);
        
//        this.setTitle("Main Frame");
        
        // buat menu
        exitMenuItem = new JMenuItem("Exit");
        TambahPasien = new JMenuItem("Tambah Pasien Baru");
        TambahAntrian = new JMenuItem("Tambah Antrian");

        fileMenu.add(TambahPasien);
        fileMenu.add(TambahAntrian);
        fileMenu.add(exitMenuItem);
        MenuBar.add(fileMenu);

        exitMenuItem.addActionListener(this);
        TambahPasien.addActionListener(this);
        TambahAntrian.addActionListener(this);
        
    }
    
     public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitMenuItem) {
            System.exit(0);
        }
        if (e.getSource() == TambahPasien) {
            TambahPasienBaruDialog tampil = new TambahPasienBaruDialog();
            tampil.setSize(400, 500);
            tampil.setVisible(true);
        }
        if (e.getSource() == TambahAntrian) {
            TambahAntrianDialog tampil = new TambahAntrianDialog();
            tampil.setSize(400, 500);
            tampil.setVisible(true);
        }
}
        
        
       
}


