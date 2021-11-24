package pl.edu.ug.kap.bakedGoodsCRUD.domain;

public class Bread {
    private String id;
    private String shape;
    private String type;

    public Bread() {
    }

    public Bread(String shape, String type) {
        this.shape = shape;
        this.type = type;
    }

    public Bread(String id, String shape, String type) {
        this.id = id;
        this.shape = shape;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "id='" + id + '\'' +
                ", shape='" + shape + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
