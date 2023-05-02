/*
Một bộ bài có 4 loại và 13 con mỗi loại.
Viết các lớp sau:
Lớp mô tả quân bài
Lớp tạo bộ bài 52 quân bài không trùng nhau 
Lớp kiểm tra
*/
package joker;


public class Joker {

    
    public static void main(String[] args) {
        Card_Pack cp = new Card_Pack();
        System.out.println(cp);
        System.out.println("\n Bai sau khi xao: \n");
        cp.shuffleCardPack();
        System.out.println(cp);
    }
    
}
