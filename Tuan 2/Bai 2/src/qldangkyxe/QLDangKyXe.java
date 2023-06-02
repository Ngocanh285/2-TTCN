
package qldangkyxe;

import java.util.Scanner;
public class QLDangKyXe {
    static Scanner sc = new Scanner(System.in);

    static void Nhapxe(DangkyXe Xe)
    {
        System.out.print("Nhap ma xe: ");
        Xe.setMaxe(sc.nextInt()); sc.nextLine();
        System.out.print("Nhap ten chu xe: ");
        Xe.setChuxe(sc.nextLine());
        System.out.print("Nhap ding tich xe: ");
        Xe.setDungtich(sc.nextInt());
        System.out.print("Nhap tri gia xe: ");
        Xe.setTrigia(sc.nextDouble());
        System.out.print("Nhap mo ta: ");
        Xe.setMota(sc.nextLine());
    }
    // tao phuong thuc main de chay cac phuong thuc khac
    public static void main(String[] args) {
       DangkyXe a[] = null; // mang chua xe
       int m,n=0;
       boolean flag = true;
       // dung switch case de tao menu
       do {
           System.out.println("Chon muc nhap!");
           System.out.println(" 1. Tao cac doi tuong xe va nhap thong tin \n" + "2. Xuat bang ke khai tien thue cua cac xe. \n" + "Nhap so bat ki khac de thoat chuong trinh.");
           m = sc.nextInt();
           switch(m)
           {
               case 1: 
                   System.out.print("Nhap so luong xe: ");
                   n = sc.nextInt();
                   for(int i = 0; i<n; i++)
                   {
                       System.out.println("Xe thu " + (i+1));
                       a[i] = new DangkyXe();
                       Nhapxe(a[i]);
                   } break;
               case 2:
                   System.out.printf("%5s %5s %5s %10s %10s %8s \n", "Ma xe","Chu xe","Dung tich", "Tri gia", "Mo ta", "Thue");
                   for(int i = 0; i<n; i++)
                   {
                       a[i].Inthue();
                   } break;
               default:
                   System.out.println("Done");
                   flag = false;
                   break;
           } 
       } while (flag);      
    }
    
}
