package adapter;

public class Flower {
    private int imageID;
    private String title;
    private String description;

    public Flower(int imageID, String title, String description) {
        this.imageID = imageID;
        this.title = title;
        this.description = description;
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

    @Override
    public String toString() {
        return "Flower{" +
                "imageID=" + imageID +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
