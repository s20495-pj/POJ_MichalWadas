package Zjazd7.EX07_03;

/**
 * summary: Implement exercise 07_03: Data
 * author: Michal Wadas
 **/
public class Data {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getIntKey() {
        return intKey;
    }

    public void setIntKey(long intKey) {
        this.intKey = intKey;
    }

    public String getStringKey() {
        return stringKey;
    }

    public void setStringKey(String stringKey) {
        this.stringKey = stringKey;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getEnumName() {
        return enumName;
    }

    public void setEnumName(String enumName) {
        this.enumName = enumName;
    }

    private int id;
    private long intKey;
    private String stringKey;
    private String value;
    private String enumName;

    @Override
    public String toString() {
        return this.id + ";" + this.intKey + ";" + this.stringKey + ";" + this.value + ";" + this.enumName;
    }
}
