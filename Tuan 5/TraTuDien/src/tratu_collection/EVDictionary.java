
package tratu_collection;

import java.util.TreeMap;
public class EVDictionary  {
    public TreeMap<String, EVWordClass> dic;

    public EVDictionary() {
        dic = new TreeMap<String, EVWordClass>();
    }
    public boolean addWord(EVWordClass word)
    {
        if(dic.put(word.getWord().toLowerCase(),word) != null)
        {
            return false;
        }
        return true;
    }
    public EVWordClass lookup(String word)
    {
       return dic.get(word);
    }
    public String toString()
    {
        String ret = "";
        for(EVWordClass w:dic.values())
            ret += w.toString() + "\n";
        return ret;
    }
}
