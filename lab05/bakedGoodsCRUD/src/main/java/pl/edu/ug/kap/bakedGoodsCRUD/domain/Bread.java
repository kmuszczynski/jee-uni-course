package pl.edu.ug.kap.bakedGoodsCRUD.domain;

public class Bread {
    private String shape;
    private String type;

    public Bread() {
    }

    public Bread(String shape, String type) {
        this.shape = shape;
        this.type = type;
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
                ", shape='" + shape + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
