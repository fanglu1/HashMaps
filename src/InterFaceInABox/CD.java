package InterFaceInABox;

public class CD implements Packable{

    private String artist;
    private String cdName;
    private int pubYear;

    public CD(String artist, String cdName, int pubYear){
        this.artist = artist;
        this.cdName = cdName;
        this.pubYear = pubYear;
    }

    public String toString() {
        return artist + ": " + cdName + " (" + pubYear + ")";
    }
    @Override
    public double weight() {
        return .1;
    }
}
