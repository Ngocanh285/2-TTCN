/*
Viết chương trình nhập 2 ma trận A, B từ bàn phím.
Ma trận A có kích thước n x k phần tử, ma trận B có kích thước k x m phần tử, với n, k, m cũng nhập từ bàn phím.
Tính tích hai ma trận.
Hiển thị ma trận A, B, KQ ra màn hình dưới dạng bảng.
 */

package matran;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Matran {

    public static void main(String[] args) {
        int n, k, m, i, j;
        BufferedReader inp;
        try {
            inp = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Nhap so hàng MT A: n= ");
            n = Integer.parseInt(inp.readLine());
            System.out.print("Nhap so cột MT A/ so hang MT B: k = ");
            k = Integer.parseInt(inp.readLine());
            System.out.print("Nhap so cột MT B: m = ");
            m = Integer.parseInt(inp.readLine());
            int[][] a = new int[n][k]; 
            int[][] b = new int[k][m]; 
            //Nhap ma tran A
            System.out.println("--------------Nhap cac phan tu cua ma tran A----------------");
            for(i=0; i<n; i++) {
                for(j=0; j<k; j++) {
                    System.out.print("\ta["+(i+1)+"]["+(j+1)+"] = ");
                    a[i][j] = Integer.parseInt(inp.readLine());
                }
            }
            //Nhap ma tran B
            System.out.println("--------------Nhap cac phan tu cua ma tran B----------------");
            for(i=0; i<k; i++) {
                for(j=0; j<m; j++) {
                    System.out.print("\ta["+(i+1)+"]["+(j+1)+"] = ");
                    b[i][j] = Integer.parseInt(inp.readLine());
                }
            }
            //Xuat ma tran A
            System.out.println("--------------Xuat ma tran A----------------");
            for(i=0; i<n; i++) {
                for(j=0; j<k; j++) {
                    System.out.print("\t" + a[i][j]);
                }
                System.out.print("\n");
            }
            //Xuat ma tran B
            System.out.println("--------------Xuat ma tran B----------------");
            for(i=0; i<k; i++) {
                for(j=0; j<m; j++) {
                    System.out.print("\t" + b[i][j]);
                }
                System.out.print("\n");
            }
            //Nhan hai ma tran
            //int tg = 0;
            int[][] c = new int[n][m];
            for(i=0; i<n; i++) {
                for(j=0; j<k; j++) {
                    for(int x=0; x<m; x++) {
                        c[i][x] = c[i][x] + a[i][j] * b[j][x];
                    }
                }
                System.out.print("\n");
            }
            //xuat ma tran ket qua
            System.out.println("--------------Xuat ma tran KQ----------------");
            for(i=0; i<n; i++) {
                for(j=0; j<m; j++) {
                    System.out.print("\t" + c[i][j]);
                }
                System.out.print("\n");
                }
            }
        catch(IOException e) {
            System.out.println(e);
            }
        }
    }
    

