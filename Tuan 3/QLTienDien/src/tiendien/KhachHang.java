
package tiendien;
import java.util.Scanner;

public class KhachHang {

    protected int MaKH, SoLuong;
    protected double DonGia, ThanhTien;
    protected String NgayHD, HoTenKH;
    Scanner in = new Scanner(System.in);

    protected KhachHang() {
        this.MaKH = 0;
        this.DonGia = 0;
        this.NgayHD = "";
        this.HoTenKH = "";
        this.SoLuong = 0;
    }

    protected KhachHang(int MaKH, int SoLuong, double DonGia, double ThanhTien, String NgayHD, String HoTenKH) {
        this.MaKH = MaKH;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.ThanhTien = ThanhTien;
        this.NgayHD = NgayHD;
        this.HoTenKH = HoTenKH;
    }

    protected int getMaKH() {
        return MaKH;
    }

    protected void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    protected int getSoLuong() {
        return SoLuong;
    }

    protected void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    protected double getDonGia() {
        return DonGia;
    }

    protected void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    protected double getThanhTien() {
        return ThanhTien;
    }

    protected void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    protected String getNgayHD() {
        return NgayHD;
    }

    protected void setNgayHD(String NgayHD) {
        this.NgayHD = NgayHD;
    }

    protected String getHoTenKH() {
        return HoTenKH;
    }

    protected void setHoTenKH(String HoTenKH) {
        this.HoTenKH = HoTenKH;
    }
    protected void Nhap()
    {
        System.out.println("Nhap Ma Khach Hang: ");
        MaKH = in.nextInt();
        System.out.println("Ho Ten Khach Hang: ");
        HoTenKH = in.nextLine();
        System.out.println("Ngay Lap Hoa Don: ");
        NgayHD = in.nextLine();
        System.out.println("So Luong(KW): ");
        SoLuong = in.nextInt();
        System.out.println("Don Gia: ");
        DonGia = in.nextDouble();
    }
    public String toString()
    {
        return "Ma Khach Hang: "+ MaKH + ", Ho Ten Khach Hang: " + HoTenKH + ", Ngay Xuat Hoa Don: " + NgayHD + ", Don Gia: " + DonGia + ", So Luong: " + SoLuong;
    }
    
    
}

