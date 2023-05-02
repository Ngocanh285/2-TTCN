
package tratu_collection;


public class EVWordClass implements Comparable {
    private String word;
    private String type;
    private String mean;
    private String notes;

    public EVWordClass() {
    }

    public EVWordClass(String word, String type, String mean, String notes) {
        this.word = word;
        this.type = type;
        this.mean = mean;
        this.notes = notes;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean equal (Object obj)
    {
        EVWordClass w = (EVWordClass)obj;
        return word.equalsIgnoreCase(w.getWord());
    }
    @Override
    public String toString() {
        return "EVWordClass{" + "word=" + word + ", type=" + type + ", mean=" + mean + ", notes=" + notes + '}';
    }
    public int compareTo (Object o)
    {
        return this.word.compareToIgnoreCase(((EVWordClass)o).getWord());
    }
    
}
