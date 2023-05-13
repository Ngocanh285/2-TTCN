
package tiendien;


public class KhachHangViet extends KhachHang {
    protected int LoaiKH, DinhMuc;


    public KhachHangViet() {
        super();
        this.LoaiKH = 0;
        this.DinhMuc = 0;
    }

    public KhachHangViet(int LoaiKH, int DinhMuc, int MaKH, int SoLuong, double DonGia, double ThanhTien, String NgayHD, String HoTenKH) {
        super(MaKH, SoLuong, DonGia, ThanhTien, NgayHD, HoTenKH);
        this.LoaiKH = LoaiKH;
        this.DinhMuc = DinhMuc;
    }

    public int getLoaiKH() {
        return LoaiKH;
    }

    public void setLoaiKH(int LoaiKH) {
        this.LoaiKH = LoaiKH;
    }

    public int getDinhMuc() {
        return DinhMuc;
    }

    public void setDinhMuc(int DinhMuc) {
        this.DinhMuc = DinhMuc;
    }
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Loai Khach Hang (1. SinhHoat, 2.KinhDoanh, 3. SanXuat): ");
        LoaiKH = in.nextInt();
        System.out.println("Dinh Muc: ");
        DinhMuc = in.nextInt();
    }
    public double ThanhTien()
    {
        if(SoLuong <= DinhMuc)
            return this.ThanhTien = this.DonGia * this.SoLuong;
        else return this.ThanhTien = this.DinhMuc * this.DonGia + (this.SoLuong - this.DinhMuc)*this.DonGia*2.5;
    }
    @Override
    public String toString()
    {
        String temp;
        temp = switch (LoaiKH) {
            case 1 -> "Sinh Hoat";
            case 2 -> "Kinh Doanh";
            case 3 -> "San Xuat";
            default -> "Khong xac dinh";
        };
        return "Khach Hang Viet: " + super.toString() + ", LoaiKH: " + temp + ", Dinh Muc: " + DinhMuc + ", Thanh Tien: " + ThanhTien;
    }
    
}
