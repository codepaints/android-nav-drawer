package adapter;

public class Flower {
    private int imageID;
    private String title;
    private String description;
    private double size;

    public Flower(int imageID, String title, String description, double size) {
        this.imageID = imageID;
        this.title = title;
        this.description = description;
        this.size = size;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "imageID=" + imageID +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", size=" + size +
                '}';
    }
}
