
package tiendien;

import java.util.Scanner;
public class TienDien {

    
    public static void main(String[] args) {
        KhachHangList lkh = new KhachHangList();
        Scanner in = new Scanner(System.in);
        int x;
        do
        {
            System.out.println("0. Thoat ung dung \t\t\t\t");
            System.out.println("1. Them Khach Hang Viet\n");
            System.out.println("2. Them Khach Hang Nuoc Ngoai\n ");
            System.out.println("3. Hien Thi Danh Sach Khach Hang\n");
            System.out.println("4. Xem tong (KW) cua cac khach hang\n");
            System.out.println("5. Xem trung binh tien cua khach hang nuoc ngoai\n");
            x = in.nextInt();
            switch(x)
            {
                case 1: 
                    lkh.ThemKH(1);
                case 2: 
                    lkh.ThemKH(2);
                case 3: 
                    lkh.HienThiKH();
                case 4:
                    lkh.TongSL();
                case 5:
                    lkh.TrungBinh();
            }
        } while(x!=0);
        System.out.println("");
    }
    
}
