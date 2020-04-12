package colorparser.service;

import colorparser.entities.Glue;
import colorparser.entities.Miks;
import colorparser.repository.MiksRepository;

import java.util.List;
import java.util.Set;

public class MiksServiceImpl implements MiksService {

    MiksRepository repository;

    @Override
    public Miks getMiksById(Integer id) {
        return repository.getOne(id);
    }

    @Override
    public void saveMiks(Miks miks) {
        repository.save(miks);
    }

    @Override
    public void deleteMiksById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void updateMiks(int id, Set<Glue> glues, Integer part1, Integer part2, Integer part3, Integer part4, Integer part5) {
        Miks miks = new Miks(id,glues, part1, part2, part3, part4, part5);
        repository.save(miks);
    }

    @Override
    public List<Miks> findAll() {
        return repository.findAll();
    }
}
