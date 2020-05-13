/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author KetNgan
 */
public class Main {
    public static void main(String[] args) throws ParseException{
         HoaDon HD = new HoaDon.Builder()
                .addMaHD("001")
                .addTenKH("Kim Xuân")
                .addNgayBan(new SimpleDateFormat("dd/MM/yy").parse("02/05/2020"))
                .Build();
        System.out.println(HD.toString());
    }
}
