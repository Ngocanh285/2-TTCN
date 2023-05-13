
package hinhchunhat;


public class TinhHCN {
    private double dai, rong;
    //khởi tạo phương thức constructor không có tham số
    public TinhHCN() {
    }
    // khởi tạo phương thức constructor có tham số
    public TinhHCN(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }
    public double ChuVi()
    {
        return (dai+rong)*2;
    }
    public double DienTich()
    {
        return dai*rong;
    }

    
}


