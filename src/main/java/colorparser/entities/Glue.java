package colorparser.entities;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.TermVector;

import javax.persistence.*;
import java.util.Set;

@Entity
@Indexed
@Table(name="glue", schema = "colorparser", catalog = "" )

public class Glue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "number")
    @Field(termVector = TermVector.YES)
    String number;

    @Column(name = "name")
    @Field
    String name;

    @Column(name = "color")
    @Field
    String color;

    @Column(name = "picture")
    @Field
    String picture;

    private int idManufacturer;

    @ManyToMany
    private Set<Miks> Miks;

    public Glue(int id, String number, String name, String color, String picture,int idManufacturer,Set<Miks> miks ) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.color = color;
        this.picture = picture;
        this.idManufacturer = idManufacturer;
        this.Miks = miks;
    }

    public Glue() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getIdManufacturer() {
        return idManufacturer;
    }

    public void setIdManufacturer(int idManufacturer) {
        this.idManufacturer = idManufacturer;
    }

    public Set<colorparser.entities.Miks> getMiks() {
        return Miks;
    }

    public void setMiks(Set<colorparser.entities.Miks> miks) {
        Miks = miks;
    }
}
