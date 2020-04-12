package colorparser.service;

import colorparser.entities.Glue;
import colorparser.entities.Manufacturer;
import colorparser.entities.Plate;
import colorparser.repository.ManufacturerRepository;

import java.util.List;
import java.util.Set;

public class ManufacturerServiceImpl implements ManufacturerService {

    ManufacturerRepository repository;

    @Override
    public Manufacturer getManufacturerById(Integer id) {
        return repository.getOne(id);
    }

    @Override
    public void saveManufacturer(Manufacturer manufacturer) {
        repository.save(manufacturer);
    }

    @Override
    public void deleteManufacturerById(Integer id) {
       repository.deleteById(id);
    }

    @Override
    public void updateManufacturer(int id, String number, String name, String phone, String address, String fax, String email, Set<Plate> plateSet, Set<Glue> glueSet) {
        Manufacturer manufacturer =  new Manufacturer(id, number, name, phone, address, fax,email,plateSet,glueSet);
        repository.save(manufacturer);
    }

    @Override
    public List<Manufacturer> findAll() {
        return repository.findAll();
    }
}
