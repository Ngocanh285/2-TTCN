
package tiendien;

import static java.lang.Character.UnicodeBlock.of;
import java.util.ArrayList;
import java.util.Scanner;


public class KhachHangList {
    protected KhachHang kh[] = new KhachHang[100];
    protected int CountKH;
    protected int sum1 = 0, sum2 = 0, dem = 0, sumt = 0;
    protected ArrayList<KhachHang> list = new ArrayList<>();
    public KhachHangList()
    {
        CountKH = 0;
        for(int i=0; i<100; i++)
            kh[i] = new KhachHang();
    }
    public void ThemKH(int temp)
    {
        if(CountKH>100)
            System.out.println("Day bo nho!");
        else
        {
            if(temp == 1)
            {
                kh[CountKH] = new KhachHangViet();
                KhachHangViet khv = new KhachHangViet();
                khv.Nhap();
                khv.ThanhTien = khv.ThanhTien();
                list.add(khv);
              //  kh[CountKH] = khv;
                sum1 += khv.SoLuong;
            }
            else
            {
                kh[CountKH] = new KhachHangNuocNgoai();
                KhachHangNuocNgoai khn = new KhachHangNuocNgoai();
                khn.Nhap();
                khn.ThanhTien = khn.ThanhTien();
            //    kh[CountKH] = khn;
            list.add(khn);
                sum2 += khn.SoLuong;
                sumt += khn.ThanhTien;
                dem++;
            }
       //     CountKH++;
        }
    }
    public void HienThiKH()
    {
//        for(int i = 0; i<CountKH; i++)
//        {
//            System.out.println("\n So TT: " + (i+1));
//            System.out.println(kh[i].toString());
//        }
        for(int i=0; i<list.size(); i++){
            System.out.println("\n So TT: " + (i+1));
            System.out.println(list.get(i).toString());
        }
    }
    public void Xoa(int makh){
        for(int i=0; i<list.size(); i++){
            if (list.get(i).getMaKH()==makh){
                 list.remove(list.get(i));
            } else {
                System.out.println("Khong tim thay ma khach hang can xoa");
            }
        }
    }
    public void TimKiem(int makh){
        for(int i=0; i<list.size(); i++){
            if (list.get(i).getMaKH()==makh){
                 System.out.println(list.get(i).toString());
            } else {
                System.out.println("Khong tim thay ma khach hang can xoa");
            }
        }
    }
    public void Sua(int makh){
        
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<list.size(); i++){
            if (list.get(i).getMaKH()==makh){
                 System.out.println("Nhap khach hang can sua: ");
                 list.get(i).setHoTenKH(sc.nextLine());
            } else {
                System.out.println("Khong tim thay ma khach hang can xoa");
            }
        }
    }
    
    public void TongSL()
    {
        System.out.println("Tong so luong Dien cua khach hang Viet Nam: " + sum1);
        System.out.println("Tong so luong Dien cua khach hang Nuoc Ngoai: " + sum2);
    }
    public void TrungBinh()
    {
        System.out.println("Trung binh thanh tien cua khach hang nuoc ngoai: " + (sumt/dem));
    }
}
