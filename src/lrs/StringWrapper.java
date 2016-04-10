package lrs;

public class StringWrapper implements Comparable {

    public String s;
    public int offset;
    public int length;

    public StringWrapper(String s, int offset) {
        this.s = s;
        this.offset = offset;
        this.length = s.length()-offset;
    }
    
    public String substring() {
        return s.substring(offset);
    }

    @Override

    public int compareTo(Object arg0) {
        StringWrapper other = (StringWrapper) arg0;
        return substring().compareTo(other.substring());
    }

    public int charAt(int d) {
       return substring().charAt(d);
    }
}
