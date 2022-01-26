package pl.ug.kap.modeling.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
public class Label {
    private Long id;
    private String ingredients;
    private Bread bread;

    public Label(String ingredients) {
        this.ingredients = ingredients;
    }

    public Label() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @OneToOne
    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    @Override
    public String toString() {
        return "Label{" +
                "ingredients=" + ingredients +
                '}';
    }
}
