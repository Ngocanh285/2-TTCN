
package models;

import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.Statement;

public class hoadonDAO {
    public List<hoadon> getAll(){
        List<hoadon> ls = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try{
            String sSQL = "select *from HoaDon";
            
        }
        catch(exception e){}
    }
}
