package colorparser.service;

import colorparser.entities.Glue;
import colorparser.entities.Miks;

import java.util.List;
import java.util.Set;

public interface MiksService {

    Miks getMiksById(Integer id);
    void saveMiks(Miks miks);
    void deleteMiksById(Integer id);
    void updateMiks(int id, Set<Glue> glues, Integer part1, Integer part2, Integer part3, Integer part4, Integer part5);
    List<Miks> findAll();

}
