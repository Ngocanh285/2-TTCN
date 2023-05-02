
package mainmanagerui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
public class MyProcessFile 
{
    public static void saveData(Object list,String fileName) throws FileNotFoundException
    {
        try
        {
            FileOutputStream fOut = new FileOutputStream(fileName);
        
        
        ObjectOutputStream oOut=new ObjectOutputStream(fOut);
        oOut.writeObject(list);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public static Object openData(String fileName)
    {
        try
        {
            FileInputStream fIn= new FileInputStream(fileName);
            ObjectInputStream oIn=new ObjectInputStream(fIn);
            return oIn.readObject();}
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
    }
}