/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author KetNgan
 */
public class HoaDon {
    HoaDonHeader header = new HoaDonHeader();
    ArrayList<CTHD> chitiet = new ArrayList<>();

    protected HoaDon(Builder builder) {
        this.header = builder.header;
        this.chitiet = builder.chitiet;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "header=" + header + ", chitiet=" + chitiet + '}';
    }
    public static class Builder{
        HoaDonHeader header = new HoaDonHeader();
        ArrayList<CTHD> chitiet = new ArrayList<>();
   
     public Builder addMaHD(String MaHD){
            this.header.setMaHD(MaHD);
            return this;
        }
        
        public Builder addTenKH(String TenKH){
            this.header.setTenKH(TenKH);
            return this;
        }
        
        public Builder addNgayBan(Date NgayBan){
            this.header.setNgayBan(NgayBan);
            return this;
        }
        public HoaDon Build(){
            return new HoaDon(this);
        }
    }
}
