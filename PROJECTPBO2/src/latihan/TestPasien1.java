/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
public class TestPasien1 {
    public static void main(String[] args) {
        Pasien puspa = new Pasien("Puspa");
       puspa.setTanggalLahir(1978,8,12);
      
        System.out.println("Umur = "+puspa.getUsia());
         
    }
}
