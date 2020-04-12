package colorparser.service;

import colorparser.entities.Glue;
import colorparser.entities.Miks;
import colorparser.repository.GlueRepository;

import java.util.List;
import java.util.Set;

public class GlueServiceImpl implements GlueService {

    GlueRepository repository;

    @Override
    public Glue getGlueById(Integer id) {
        return repository.getOne(id);
    }

    @Override
    public void saveGlue(Glue glue) {
        repository.save(glue);
    }

    @Override
    public void deleteGluebyId(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void updateGlue(int id, String number, String name, String color, String picture, int idManufacturer, Set<Miks> miks) {
            Glue glue = new Glue(id, number,name,color,picture,idManufacturer, miks);
            repository.save(glue);
    }

    @Override
    public List<Glue> findAll() {
        return repository.findAll();

    }


}
