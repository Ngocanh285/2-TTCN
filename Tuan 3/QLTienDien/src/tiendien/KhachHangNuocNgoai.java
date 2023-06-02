
package tiendien;

public class KhachHangNuocNgoai extends KhachHang
{
    protected String QuocTich;

    public KhachHangNuocNgoai() {
        super();
        this.QuocTich = "";
    }

    public KhachHangNuocNgoai(int MaKH, int SoLuong, double DonGia, double ThanhTien, String NgayHD, String HoTenKH) {
        super(MaKH, SoLuong, DonGia, ThanhTien, NgayHD, HoTenKH);
        this.QuocTich = "";
    }

    public String getQuocTich() {
        return QuocTich;
    }

    public void setQuocTich(String QuocTich) {
        this.QuocTich = QuocTich;
    }
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Quoc Tich: ");
        QuocTich = in.next();
    }
    public double ThanhTien()
    {
        return this.ThanhTien = this.SoLuong*this.DonGia;
    }
    public String toString()
    {
        return "Khach hang nuoc ngoai: " + super.toString() + ", Quoc Tich: " + QuocTich + ", Thanh Tien: " + ThanhTien;
    }
    
}
