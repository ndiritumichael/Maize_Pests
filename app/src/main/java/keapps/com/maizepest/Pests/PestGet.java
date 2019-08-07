package keapps.com.maizepest.Pests;

public class PestGet {


    private int thumbnail;
    private String name;
    private String Description;
    private String Measures;

    public PestGet() {
    }

    public PestGet(int thumbnail, String name, String description, String measures) {
        this.thumbnail = thumbnail;
        this.name = name;
        Description = description;
        Measures = measures;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getMeasures() {
        return Measures;
    }

    public void setMeasures(String measures) {
        Measures = measures;
    }
}
