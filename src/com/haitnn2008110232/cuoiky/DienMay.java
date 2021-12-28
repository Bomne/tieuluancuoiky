package com.haitnn2008110232.cuoiky;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DienMay extends HangHoa{
    private int congSuat;
    public DienMay(String maHang,String tenHangHoa, long giaNhap, int soLuongTonKho, String ngayNhapKho , int congSuat) throws ParseException {
        super("DM-" + maHang,tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho);
        this.congSuat = congSuat;
        
    }
    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
    public int getCongSuat() {
        return congSuat;
    }
    DecimalFormat ft = new DecimalFormat("##### W");
    DecimalFormat ft1 = new DecimalFormat("###,###,### VND");
    @Override
    public String toString() {
        String s ;
        s = super.toString() + String.format("%-20s|%-20s|", ft.format(getCongSuat()),ft1.format(tinhTien()));
        return s ;
    }
}
