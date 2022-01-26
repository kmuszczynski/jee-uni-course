package pl.ug.kap.modeling.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
public class Bakery {
    private long id;
    private String name;
    private String address;
    private List<Baker> bakers = new ArrayList<>();

    public Bakery(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Bakery() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    public List<Baker> getBakers() {
        return bakers;
    }

    public void setBakers(List<Baker> bakers) {
        this.bakers = bakers;
    }

    public void addBakers(Baker... bakers) {
        Collections.addAll(this.bakers, bakers);
    }

    @Override
    public String toString() {
        return "Bakery{" +
                "name='" + name + '\'' +
                '}';
    }
}
