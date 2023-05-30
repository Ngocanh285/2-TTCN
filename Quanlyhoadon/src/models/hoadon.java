
package models;

import java.sql.Date;
public class hoadon {
    private String maHD;
    private String maKH;
    private String maNV;
    private int soPhong;
    private Date gioDat;
    private Date gioTra;

    public hoadon(String maHD, String maKH, String maNV, int soPhong, Date gioDat, Date gioTra) {
        this.maHD = maHD;
        this.maKH = maKH;
        this.maNV = maNV;
        this.soPhong = soPhong;
        this.gioDat = gioDat;
        this.gioTra = gioTra;
    }

    public hoadon() {
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }

    public Date getGioDat() {
        return gioDat;
    }

    public void setGioDat(Date gioDat) {
        this.gioDat = gioDat;
    }

    public Date getGioTra() {
        return gioTra;
    }

    public void setGioTra(Date gioTra) {
        this.gioTra = gioTra;
    }
    
    
}
