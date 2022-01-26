package pl.ug.kap.modeling.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Baker {
    private long id;
    private String name;
    private Date hired = new Date();
    private List<Bakery> bakeries = new ArrayList<>();

    public Baker(String name) {
        this.name = name;
    }

    public Baker() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    public List<Bakery> getBakeries() {
        return bakeries;
    }

    public void setBakeries(List<Bakery> bakeries) {
        this.bakeries = bakeries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHired() {
        return hired;
    }

    public void setHired(Date hired) {
        this.hired = hired;
    }

    @Override
    public String toString() {
        return "Baker{" +
                "name='" + name + '\'' +
                ", hired=" + hired +
                '}';
    }
}
