
package qldangkyxe;


public class DangkyXe {
    private int Maxe, Dungtich;
    private double Trigia;
    private String Chuxe, Mota;

    public DangkyXe(int Maxe, int Dungtich, double Trigia, String Chuxe, String Mota) {
        this.Maxe = Maxe;
        this.Dungtich = Dungtich;
        this.Trigia = Trigia;
        this.Chuxe = Chuxe;
        this.Mota = Mota;
    }

    public DangkyXe() {
    }

    public int getMaxe() {
        return Maxe;
    }

    public void setMaxe(int Maxe) {
        this.Maxe = Maxe;
    }

    public int getDungtich() {
        return Dungtich;
    }

    public void setDungtich(int Dungtich) {
        this.Dungtich = Dungtich;
    }

    public double getTrigia() {
        return Trigia;
    }

    public void setTrigia(double Trigia) {
        this.Trigia = Trigia;
    }

    public String getChuxe() {
        return Chuxe;
    }

    public void setChuxe(String Chuxe) {
        this.Chuxe = Chuxe;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    public double TinhThue()
    {
        double thue;
        if(Dungtich < 100)
            thue = Trigia*0.01;
        else if (Dungtich >= 100 && Dungtich <=200)
            thue = Trigia*0.03;
        else thue = Trigia *0.05;
        return thue;
    }
    @Override
    public String toString() {
        return Maxe + "-" + Chuxe + "-" + Dungtich + "-" + Trigia  + "-" + Mota + "-"; 
    }
    void Inthue()
    {
        System.out.printf("%5d %-20s %5d %10.2f %10s %8.5f \n", Maxe, Chuxe, Dungtich, Trigia, Mota, TinhThue());
    }
            
}
