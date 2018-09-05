/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author user only
 */
public class LatihanDialog extends JDialog {

        
    
    private JLabel namaLabel;
    private JTextField namaText;

    public LatihanDialog() {
        init();
    }
    
    public LatihanDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);
        
        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(50, 250, 50, 10);
        this.add(namaLabel);
        
        namaLabel = new JLabel("OK");
        namaLabel.setBounds(100, 250, 100, 10);
        this.add(namaLabel);
        
        namaText = new JTextField();
        namaText.setBounds(50, 400, 50, 30);
        
        
        
    }
}


