package com.haitnn2008110232.cuoiky;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        int luaChon = 0;
        Scanner input = new Scanner(System.in);
        //TẠO DANH SÁCH L
        QuanLyHangHoa l = new QuanLyHangHoa();
        //TẠO ĐỐI TƯỢNG HÀNG THỰC PHẨM
        //HangHoa x = new HangThucPham(maHang, tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho, ngayHetHan) 
        HangHoa sp1 = new ThucPham("1001", "Thit Bo", 240000 ,189, "12/12/2021","15/12/2021");
        HangHoa sp2 = new ThucPham("1002", "Thit Heo", 189000 ,210, "11/12/2021","13/12/2021");
        HangHoa sp3 = new ThucPham("1003", "Thit Ga", 60000 ,254, "09/12/2021","13/12/2021");
        HangHoa sp4 = new ThucPham("1004", "Rau Cu", 10000 ,121, "20/10/2021","23/10/2021");
        HangHoa sp5 = new ThucPham("1005", "Ca Thu", 50000 ,90, "15/11/2011","18/12/2021");
        HangHoa sp6 = new ThucPham("1006", "Ca Ngu", 155 ,100, "23/05/2021","26/05/2021");
        //************************************************************************************/
        //TẠO ĐỐI TƯỢNG HÀNG SÀNH SỨ
        //HangHoa x = new HangSanhSu(maHang, tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho, xuatXu)
        HangHoa sp7 = new SanhSu("1001", "To Su", 69000, 320, "02/06/2021", "Tp HCM");
        HangHoa sp8 = new SanhSu("1002", "Muong Su", 39000, 230, "29/04/2021", "Tp HCM");
        HangHoa sp9 = new SanhSu("1003", "Dia Su", 49000, 122, "03/07/2021", "Ha Noi");
        HangHoa sp10 = new SanhSu("1004", "Am Tra Su", 99000, 146, "09/03/2011", "Tp HCM");
        HangHoa sp11 = new SanhSu("1005", "Chen Tra Su", 49000, 323, "12/12/2021", "Tp HCM");
        HangHoa sp12 = new SanhSu("1006", "Ly Su", 29000, 30, "29/02/2021", "Ha Noi");
        HangHoa sp13 = new SanhSu("1007", "Binh Su", 89000, 99, "31/01/2021", "Ha Noi");
        //************************************************************************************/
        //TẠO ĐỐI TƯỢNG HÀNG ĐIỆN MÁY
        //HangHoa x = new HangDienMay(maHang, tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho, congSuat)
        HangHoa sp14 = new DienMay("1001", "Ti Vi", 13990000, 47,"02/09/2021", 150);
        HangHoa sp15 = new DienMay("1002", "Tu Lanh", 89000000, 30,"08/03/2021", 120);
        HangHoa sp16 = new DienMay("1003", "May Giat", 899000, 23,"20/10/2021", 820);
        HangHoa sp17 = new DienMay("1004", "Quat May", 1299000, 39,"01/06/2021", 120);
        HangHoa sp18 = new DienMay("1005", "May Lanh", 2355000, 42,"12/12/2021", 1100);
        HangHoa sp19 = new DienMay("1006", "Bep Dien Tu", 490000, 15,"30/04/2021", 4000);
        HangHoa sp20 = new DienMay("1007", "May Loc Nuoc", 12500000, 66,"01/05/2021", 450);
        //************************************************************************************/
        //THÊM 20 SẢN PHẨM VÀO DANH SÁCH L SP1->SP20
        l.themHangHoaTrucTiep(sp1);
        l.themHangHoaTrucTiep(sp2);
        l.themHangHoaTrucTiep(sp3);
        l.themHangHoaTrucTiep(sp4);
        l.themHangHoaTrucTiep(sp5);
        l.themHangHoaTrucTiep(sp6);
        l.themHangHoaTrucTiep(sp7);
        l.themHangHoaTrucTiep(sp8);
        l.themHangHoaTrucTiep(sp9);
        l.themHangHoaTrucTiep(sp10);
        l.themHangHoaTrucTiep(sp11);
        l.themHangHoaTrucTiep(sp12);
        l.themHangHoaTrucTiep(sp13);
        l.themHangHoaTrucTiep(sp14);
        l.themHangHoaTrucTiep(sp15);
        l.themHangHoaTrucTiep(sp16);
        l.themHangHoaTrucTiep(sp17);
        l.themHangHoaTrucTiep(sp18);
        l.themHangHoaTrucTiep(sp19);
        l.themHangHoaTrucTiep(sp20);
  
        //MENU TỔNG
		while(luaChon != 6){
            System.out.println("+==============MENU===============+");
            System.out.println("|   1. Quan ly san pham.          |");
            System.out.println("|   2. Tim kiem.                  |");
            System.out.println("|   3. Sap xep tang dan.          |");
            System.out.println("|   4. Sap xep giam dan.          |");
            System.out.println("|   5. Thong ke.                  |");
            System.out.println("+=================================+");
            System.out.print("Chon chuc nang: ");
            System.out.print("Chon chuc nang: ");
            luaChon = input.nextInt();
            switch(luaChon){
                case 1 : {
                    //MENU THÊM SỬ XÓA HÀNG HÓA (CÁC THÔNG TIN ĐƯỢC NHẬP TỪ BÀN PHÍM)
                    System.out.println("+==============MENU===============+");
                    System.out.println("|     1. Them hang hoa            |");
                    System.out.println("|     2. Sua hang hoa             |");
                    System.out.println("|     3. Xoa hang hoa             |");
                    System.out.println("|     0.  Thoat                   |");
                    System.out.println("+=================================+");
                    System.out.print("Chon chuc nang: ");
                    luaChon = input.nextInt();
                    switch(luaChon){
                        case 1 : l.themHangHoa();break;
                        case 2 : l.suaHangHoa();break;
                        case 3 : l.xoaHangHoa();break;
                        default : break;
                    }
                    break;
                }
                case 2 : {
                    //MENU TÌM KIẾM HÀNG HÓA THEO LOẠI , KHOẢNG NGÀY , KHOẢNG GIÁ
                    System.out.println("+==============MENU===============+");
                    System.out.println("|     1. Tim kiem theo loai       |");
                    System.out.println("|     2. Tim kiem theo ngay nhap  |");
                    System.out.println("|     3. Tim kiem theo gia        |");
                    System.out.println("|     0.  Thoat                   |");
                    System.out.println("+=================================+");
                    System.out.print("Chon chuc nang: ");
                    luaChon = input.nextInt();
                    switch(luaChon){
                        case 1 : l.timKiemTheoLoai();break;
                        case 2 : l.timKiemTheoNgay();break;
                        case 3 : l.timKiemTheoGia();break;
                        default : break;
                    }
                    break;
                }
                case 3 : {
                    //MENU SẮP XẾP HÀNG HÓA TĂNG DẦN THEO GIÁ NHẬP , NGÀY NHẬP , THEO LOẠI VÀ NGÀY NHẬP , THEO LOẠI VÀ GIÁ NHẬP
                    System.out.println("+==============MENU===============+");
                    System.out.println("|       Sap xep tang dan theo     |");
                    System.out.println("|    1. Gia nhap                  |");
                    System.out.println("|    2. Ngay nhap                 |");
                    System.out.println("|    3. Loai va ngay nhap         |");
                    System.out.println("|    4. Loai va gia nhap          |");
                    System.out.println("|    0.  Thoat                    |");
                    System.out.println("+=================================+");
                    System.out.print("Chon chuc nang: ");
                    luaChon = input.nextInt();
                    switch(luaChon){
                        case 1 : l.sapXepHangHoaTangDanTheoGia();break;
                        case 2 : l.sapXepHangHoaTangDanTheoNgay();break;
                        case 3 : l.SapXepTangDanTheoLoaiVaTheoNgayNhap();break;
                        case 4 : l.SapXepTangDanTheoLoaiVaTheoGia();break;
                        default : break;
                    }
                    break;
                }
                case 4 : {
                    //MENU SẮP XẾP HÀNG HÓA GIẢM DẦN THEO GIÁ NHẬP , NGÀY NHẬP , THEO LOẠI VÀ NGÀY NHẬP , THEO LOẠI VÀ GIÁ NHẬP
                    System.out.println("+==============MENU===============+");
                    System.out.println("|       Sap xep giam dan theo     |");
                    System.out.println("|    1. Gia nhap                  |");
                    System.out.println("|    2. Ngay nhap                 |");
                    System.out.println("|    3. Loai va ngay nhap         |");
                    System.out.println("|    4. Loai va gia nhap          |");
                    System.out.println("|    0.  Thoat                    |");
                    System.out.println("+=================================+");
                    System.out.print("Chon chuc nang: ");
                    luaChon = input.nextInt();
                    switch(luaChon){
                        case 1 : l.sapXepHangHoaGiamDanTheoGia();break;
                        case 2 : l.sapXepHangHoaGiamDanTheoNgay();break;
                        case 3 : l.SapXepGiamDanTheoLoaiVaTheoNgayNhap();break;
                        case 4 : l.SapXepGiamDanTheoLoaiVaTheoGia();break;
                        default : break;
                    }
                    break;
                }
                case 5 : l.thongKeTongHangHoa();break;
                default : break;
                
            }
            
        }
    }
}
