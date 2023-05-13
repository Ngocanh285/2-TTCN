/*
 Bat loi Try-catch. Bat loi nhap sai dinh dang kieu so cua a,b,c.
 */
package giaiptb2;

import java.util.Scanner;
public class GiaiPTB2 {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        try {
            System.out.println("Nhap a: ");
            float a = scanner.nextFloat();
            System.out.println("Nhap b: ");
            float b = scanner.nextFloat();
            System.out.println("Nhap c: ");
            float c = scanner.nextFloat();
            Tinh(a,b,c);
        }
        catch(Exception e) {
            System.out.println("Ban nhan khong dung dinh dang, moi nhap lai!");
        }
        
        
    }
    public static void Tinh(float a, float b, float c)
    {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem!");
            } else {
                System.out.println("Phuong trinh co mot nghiem: "
                        + "x = " + (-c / b));
            }
            return;
        }
        // tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phuong trinh co 2 nghiem la: "
                    + "x1 = " + x1 + " va x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiem kep: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem!");
        }
    
    }
}
