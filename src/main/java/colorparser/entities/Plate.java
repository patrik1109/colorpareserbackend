package colorparser.entities;


import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.TermVector;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Indexed
@Table(name="plate", schema = "colorparser", catalog = "" )
public class Plate implements Serializable  {

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

   @Column(name = "hight")
   @Field
   Integer hight;

   @Column(name = "lenght")
   @Field
   Integer lenght;

    @Column(name = "width")
    @Field
    Integer width;

    @ManyToMany
    private Set<Miks> Miks;

    @ManyToMany
    private Set<Glue> Glues;

    private int idManufacturer;

    public Plate(int id, String number, String name, String color, Integer hight, Integer lenght, Integer width, int idManufacturer) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.color = color;
        this.hight = hight;
        this.lenght = lenght;
        this.width = width;
        this.idManufacturer = idManufacturer;
    }

    public Plate() {
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

    public Integer getHight() {
        return hight;
    }

    public void setHight(Integer hight) {
        this.hight = hight;
    }

    public Integer getLenght() {
        return lenght;
    }

    public void setLenght(Integer lenght) {
        this.lenght = lenght;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public int getIdManufacturer() {
        return idManufacturer;
    }

    public void setIdManufacturer(int idManufacturer) {
        this.idManufacturer = idManufacturer;
    }
}
