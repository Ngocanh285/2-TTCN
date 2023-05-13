/* 
Bài tập 1: Xây dựng lớp: Bài toán hình chữ nhật.
Hình chữ nhật mô tả thông qua bằng chiều dài, chiều rộng. Qua hai tham số này 
ta có thể tính được chu vi và diện thích theo công thức toán học. Viết chương trình nhập 
và in thông tin hình chữ nhật có các thông tin: chiều dài, chiều rộng, chu vi, diện tích..
*/
package hinhchunhat;

import java.util.Scanner;
public class HinhChuNhat {

    
       public static void main(String[] args)
    {
        TinhHCN hcn = new TinhHCN(); //khởi tạo một object hcn thuộc class HinhChuNhat để sử dụng các thuộc tính trong class này
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao chieu dai: "); //yêu cầu người dùng nhập vào chiều dài và chiều rộng
        hcn.setDai(scanner.nextDouble());
        System.out.println("Nhap vao chieu rong");
        hcn.setRong(scanner.nextDouble());
        //gọi hàm tính chu vi và diện tích ở class HinhChuNhat bằng cách sử dụng object vừa mới được tạo là hcn
        System.out.println("Chu vi cua hinh chu nhat = " + hcn.ChuVi());
        System.out.println("Dien tich hinh chu nhat = " + hcn.DienTich());
    }
    
}
