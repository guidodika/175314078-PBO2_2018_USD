/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan;

import java.text.SimpleDateFormat;
import static java.util.Calendar.YEAR;
import java.util.Date;

/**
 *
 * @author admin
 */
public class TestDate1 {
    public static void main(String[] args) {
    Date date = new Date(110,7,24);
    Date today = new Date();
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E yyyy-MM-dd 'at' hh:mm:ss a zzz");

      System.out.println("Current Date: " + ft.format(date));
      int age = today.getYear() - date.getYear();
        System.out.println("age = " + age);
}
}