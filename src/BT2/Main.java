/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author KetNgan
 */
public class Main {
    public static void main(String[] args){   
        MyStringBuilder str = new MyStringBuilder.Builder()
                                .addString("Thêm số thực: ")
                                .addFloat((float)0.8)
                                .addString("Thêm boolean: ")
                                .addBool(Boolean.TRUE)
                                .Builder();
        System.out.println("\n" + str.toString());
    }
}
