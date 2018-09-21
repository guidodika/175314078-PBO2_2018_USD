/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import model.AntrianKlinik;
import model.Pasien;

/**
 *
 * @author Guido Dika Firguston
 */
public class TambahPasienBaruDialog extends JDialog implements ActionListener {

   
    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel alamatLabel;
    private JLabel nikLabel;
    private JLabel jenisKelaminLabel;
    private JLabel tanggalLahirLabel;
    private JLabel bulanLahirLabel;
    private JLabel tahunLahirLabel;
    private JTextField namaText;
    private JTextField alamatText;
    private JTextField nikText;
    private JRadioButton lakiRadioButton;
    private JRadioButton perempuanRadioButton;
    private ButtonGroup grupButtonGroup;
    private JComboBox tanggalComboBox;
    private JComboBox bulanComboBox;
    private JComboBox tahunComboBox;
    private JButton saveButton;
    private String tanggalArray[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "11", "12", "13", "14", "15", "16", "17", "18",
        "19", "20", "21", "22", "23", "24", "25", "26", "27",
        "28", "29", "30", "31"};
    private String bulanArray[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September",
        "Oktober", "November", "Desember"};
    private String tahunArray[] = {"1960", "1961", "1962", "1963", "1964", "1965",
        "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975",
        "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984",
        "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994",
        "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004",
        "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014",
        "2015", "2016", "2017", "2018"};
   
    
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
        judulLabel.setBounds(180, 20, 250, 50);
        this.add(judulLabel);

        namaLabel = new JLabel("Nama ");
        namaLabel.setBounds(50, 90, 80, 20);
        this.add(namaLabel);

        alamatLabel = new JLabel("Alamat: ");
        alamatLabel.setBounds(50, 130, 80, 20);
        this.add(alamatLabel);

        nikLabel = new JLabel("NIK: ");
        nikLabel.setBounds(50, 170, 80, 20);
        this.add(nikLabel);
        
        jenisKelaminLabel = new JLabel("Jenis Kelamin: ");
        jenisKelaminLabel.setBounds(50, 210, 90, 20);
        this.add(jenisKelaminLabel);
        
        tanggalLahirLabel = new JLabel("Tanggal Lahir: ");
        tanggalLahirLabel.setBounds(50, 250, 90, 20);
        this.add(tanggalLahirLabel);
        
        bulanLahirLabel = new JLabel("Bulan Lahir: ");
        bulanLahirLabel.setBounds(50, 290, 80, 20);
        this.add(bulanLahirLabel);
        
        tahunLahirLabel = new JLabel("Tahun Lahir: ");
        tahunLahirLabel.setBounds(50, 330, 80, 20);
        this.add(tahunLahirLabel);
                
       
        
        
        
        lakiRadioButton = new JRadioButton("Laki-Laki", true);
        lakiRadioButton.setBounds(150, 210, 80, 20);
        this.add(lakiRadioButton);
        
        perempuanRadioButton = new JRadioButton("Perempuan", false);
        perempuanRadioButton.setBounds(250, 210, 100, 20);
        this.add(perempuanRadioButton);
        
        grupButtonGroup = new ButtonGroup();
        grupButtonGroup.add(lakiRadioButton);
        grupButtonGroup.add(perempuanRadioButton);
        
        
        
        tanggalComboBox = new JComboBox(tanggalArray);
        tanggalComboBox.setBounds(180, 250, 40, 20);
        this.add(tanggalComboBox);
        
        bulanComboBox = new JComboBox(bulanArray);
        bulanComboBox.setBounds(180, 290, 100, 20);
        this.add(bulanComboBox);
        
        tahunComboBox = new JComboBox(tahunArray);
        tahunComboBox.setBounds(180, 330, 80, 20);
        this.add(tahunComboBox);
        
        
        
        
        
        namaText = new JTextField();
        namaText.setBounds(150, 90, 150, 20);
        this.add(namaText);
        namaText.addActionListener(this);

        alamatText = new JTextField();
        alamatText.setBounds(150, 130, 200, 20);
        this.add(alamatText);
        alamatText.addActionListener(this);

        nikText = new JTextField();
        nikText.setBounds(150, 170, 110, 20);
        this.add(nikText);
        
        nikText.addActionListener(this);
        
        

        saveButton = new JButton("Simpan");
        saveButton.setBounds(180, 400, 80, 50);
        this.add(saveButton);
        saveButton.addActionListener(this);
        
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveButton) {
            Pasien pasien = new Pasien();
            pasien.setNama(namaText.getText());
            pasien.setAlamat(alamatText.getText());
            pasien.setNomorRekamMedis(nikText.getText());
            pasien.tambahPasienBaru(pasien);
            JOptionPane.showMessageDialog(null, namaText.getText() + "\nDATA ANDA TELAH DITAMBAHKAN");
            this.dispose();
            
           
        }
    }

        

}


