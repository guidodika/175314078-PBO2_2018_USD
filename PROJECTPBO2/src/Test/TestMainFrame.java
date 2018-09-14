/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import View.MainFrame;
import javax.swing.JFrame;

/**
 *
 * @author Guido Dika
 */
public class TestMainFrame {
    public static void main(String[] args) {
       MainFrame tampil = new MainFrame();
        tampil.setSize(300, 400);
        tampil.setVisible(true);
        tampil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    }

