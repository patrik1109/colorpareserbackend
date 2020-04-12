package colorparser.entities;


import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

import javax.persistence.*;
import java.util.Set;

@Entity
@Indexed
@Table(name="miks", schema = "colorparser", catalog = "" )

public class Miks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;


    @ManyToMany
    private Set<Glue> glues;

    @Column(name = "part1")
    @Field
    Integer part1;


    @Column(name = "part2")
    @Field
    Integer part2;

    @Column(name = "part3")
    @Field
    Integer part3;

    @Column(name = "part4")
    @Field
    Integer part4;

    @Column(name = "part5")
    @Field
    Integer part5;

    public Miks(int id, Set<Glue> glues, Integer part1, Integer part2, Integer part3, Integer part4, Integer part5) {
        this.id = id;
        this.glues = glues;
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
        this.part4 = part4;
        this.part5 = part5;
    }

    public Miks() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getPart1() {
        return part1;
    }

    public void setPart1(Integer part1) {
        this.part1 = part1;
    }

    public Integer getPart2() {
        return part2;
    }

    public void setPart2(Integer part2) {
        this.part2 = part2;
    }

    public Integer getPart3() {
        return part3;
    }

    public void setPart3(Integer part3) {
        this.part3 = part3;
    }

    public Integer getPart4() {
        return part4;
    }

    public void setPart4(Integer part4) {
        this.part4 = part4;
    }

    public Integer getPart5() {
        return part5;
    }

    public void setPart5(Integer part5) {
        this.part5 = part5;
    }
}
