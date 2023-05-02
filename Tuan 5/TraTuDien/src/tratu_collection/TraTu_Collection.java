/*
Viết 1 lớp mô tả một từ tiếng anh bao gồm từ, nghĩa, loại từ và ghi chú
Viết từ điển bao gồm các phương thức
Thêm từ điển
Tra từ điển
Hiển thị các từ có trong từ điển
*/
package tratu_collection;


public class TraTu_Collection {


    public static void main(String[] args) {
        EVDictionary dic = new EVDictionary();
        for(int i = 1; i < 10; i++)
        {
            dic.addWord(new EVWordClass("Word" + i, "", "Tu thu "+ i, ""));
            System.out.println(dic);
            EVWordClass w = new EVWordClass("Word2", "", "Tu thu ", "");
            if(!dic.addWord(w))
                System.out.println("Khong them duoc!");
            //Tra tu
            EVWordClass l = dic.lookup("word2");
            if (l != null)
                System.out.println(l.toString());
        }
    }
    
}
