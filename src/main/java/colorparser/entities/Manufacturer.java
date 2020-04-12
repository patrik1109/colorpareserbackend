package colorparser.entities;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.TermVector;

import javax.persistence.*;
import java.util.Set;

@Entity
@Indexed
@Table(name="manufacturer", schema = "colorparser", catalog = "" )

public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "number")
    @Field(termVector = TermVector.YES)
    String number;

    @Column(name = "name")
    @Field
    String name;

    @Column(name = "phone")
    @Field
    String phone;

    @Column(name = "address")
    @Field
    String address;

    @Column(name = "fax")
    @Field
    String fax;

    @Column(name = "email")
    @Field
    String email;

    

    @OneToMany(fetch= FetchType.EAGER, mappedBy = "idManufacturer")
    Set<Plate> plateSet;

    @OneToMany(fetch= FetchType.EAGER, mappedBy = "idManufacturer")
    Set<Glue> glueSet;



    public Manufacturer(int id, String number, String name, String phone, String address, String fax, String email,Set<Plate> plateSet,Set<Glue> glueSet) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.fax = fax;
        this.email = email;
        this.plateSet = plateSet;
        this.glueSet = glueSet;
    }

    public Manufacturer() {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Plate> getPlateSet() {
        return plateSet;
    }

    public void setPlateSet(Set<Plate> plateSet) {
        this.plateSet = plateSet;
    }

    public Set<Glue> getGlueSet() {
        return glueSet;
    }

    public void setGlueSet(Set<Glue> glueSet) {
        this.glueSet = glueSet;
    }
}
