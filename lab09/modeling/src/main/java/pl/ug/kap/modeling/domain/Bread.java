package pl.ug.kap.modeling.domain;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Bread {
    private Long id;
    private String flour;
    private String shape;
    private Bakery bakery;
    private Baker baker;
    private Label label;

    public Bread(String flour, String shape, Bakery bakery, Baker baker, Label label) {
        this.flour = flour;
        this.shape = shape;
        this.bakery = bakery;
        this.baker = baker;
        this.label = label;
        label.setBread(this);
    }

    public Bread() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Bakery getBakery() {
        return bakery;
    }

    public void setBakery(Bakery bakery) {
        this.bakery = bakery;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Baker getBaker() {
        return baker;
    }

    public void setBaker(Baker baker) {
        this.baker = baker;
    }

    @OneToOne(cascade = CascadeType.ALL)
    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "flour='" + flour + '\'' +
                ", shape='" + shape + '\'' +
                ", bakery=" + bakery +
                ", baker=" + baker +
                '}';
    }
}
