package HashMaps;

import java.util.HashMap;


public class Abbreviations {
    private HashMap<String, String> abbv;

    public Abbreviations() {
        this.abbv = new HashMap<>();
    }
    public void addAbbreviation(String abbreviation, String explanation){
        abbv.put(abbreviation, explanation);
    }
    public boolean hasAbbreviation(String abbreviation){
        if(abbv.get(abbreviation) == null){
            return false;
        } else
            return true;
    }
    public String findExplanationFor(String abbreviation) {
        if(abbreviation != null){
            return abbv.get(abbreviation);
        }
        else {
            return null;
        }
    }
}
