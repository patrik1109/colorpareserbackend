package colorparser.service;

import colorparser.entities.Glue;
import colorparser.entities.Miks;

import java.util.List;
import java.util.Set;

public interface GlueService {

    Glue getGlueById(Integer id);
    void saveGlue(Glue glue);
    void deleteGluebyId(Integer id);
    void updateGlue(int id, String number, String name, String color, String picture, int idManufacturer, Set<Miks> miks);
    List<Glue> findAll();

}
