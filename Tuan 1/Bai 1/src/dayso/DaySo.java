/*
Viet chuong trinh nhap 1 day so nguyen tu ban phim. Tinh tong day so nguyen, sap xep tang dan, tach day so thanh hai day chan va le. 
Hien thi ket qua ra man hinh.
 */
package DaySo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DaySo {

    
    public static void main(String[] args) {
                int n, tong = 0, i;
        BufferedReader inp; // inp la input
        try {
            inp = new BufferedReader(new InputStreamReader(System.in));
            // Nhap so phan tu
            System.out.print("Nhap so phan tu n = ");
            n = Integer.parseInt(inp.readLine());
            // Khai bao mang
            int[] a = new int[n];
            // Nhap mang
            for (i = 0; i < n; i++) {
                System.out.print("Nhap phan tu thu " + i + " ");
                a[i] = Integer.parseInt(inp.readLine());
            }
            // Tong cac phan tu trong day so
            System.out.print("Tong cac phan tu cua day so la : ");
            for (i = 0; i < n; i++) {
                tong += a[i];
            }
            System.out.println(tong);
            // Sap xep day so theo chieu tang dan
            int t = 0;
            System.out.print("Day so sau khi sap xep tang dan la : ");
            for (i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (a[i] > a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                    }
                }
            }
            for (i = 0; i < n; i++) {
                System.out.print("\t" + a[i]);
            }
            // tach day so thanh hai day chan le
            int dem = 0; 
            for (i = 0; i < n; i++) {
                if (a[i] % 2 == 0) {
                dem++;   //dem so phan tu chan
                }
            }
            if (dem == 0) {
                System.out.println("Day so khong co phan tu chan");
            } 
            else {
                int[] b = new int[n];  //b la mang chua phan tu chan
                int[] c = new int[n];  //c la mang chua phan tu le
                int k = 0, m = 0;
                for (i = 0; i < n;i++) {
                    if (a[i] % 2 == 0) {
                    b[k] = a[i];   //gan phan tu cua day so vao mang chan
                    k++;
                    }
                    else{
                    c[m] = a[i];   //gan phan tu cua day so vao mang le
                    m++;
                    }
            //i++;
                }
            // xuat mang chan
            System.out.print("\nCac phan tu chan trong day so la: ");
            for (i = 0; i < k; i++) {
                System.out.print("\t" + b[i]);
            }
            //xuat mang le
            System.out.print("\nCac phan tu le trong day so la: ");
            for (i = 0; i < m; i++) {
                System.out.print("\t" + c[i]);
            }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
 }
    

