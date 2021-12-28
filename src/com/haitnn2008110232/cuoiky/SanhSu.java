package com.haitnn2008110232.cuoiky;

import java.text.DecimalFormat;
import java.text.ParseException;

public class SanhSu extends HangHoa{
    private String xuatXu;

        public SanhSu(String maHang, String tenHangHoa, long giaNhap, int soLuongTonKho, String ngayNhapKho ,String xuatXu)throws ParseException {
            super("SS-"+maHang, tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho);
            this.xuatXu = xuatXu;
            
        }
        public String getXuatXu() {
            return xuatXu;
        }
        public void setXuatXu(String xuatXu) {
            this.xuatXu = xuatXu;
        }
        DecimalFormat ft = new DecimalFormat("###,###,### VND");
        @Override
        public String toString() {
            String s;
            s = super.toString() + String.format("%-20s|%-20s|",getXuatXu(),ft.format(tinhTien()));
            return s;
        }   
}
