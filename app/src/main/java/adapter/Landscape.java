package adapter;

public class Landscape {

    private int imageID;
    private String location;
    private String description;
    private String photographer;
    private String camera;

    public Landscape(int imageID, String location, String description, String photographer, String camera) {
        this.imageID = imageID;
        this.location = location;
        this.description = description;
        this.photographer = photographer;
        this.camera = camera;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Landscape{" +
                "imageID=" + imageID +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                ", photographer='" + photographer + '\'' +
                ", camera='" + camera + '\'' +
                '}';
    }
}
