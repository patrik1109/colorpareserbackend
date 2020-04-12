package colorparser.service;

import colorparser.entities.Glue;
import colorparser.entities.Manufacturer;
import colorparser.entities.Miks;
import colorparser.entities.Plate;

import java.util.List;
import java.util.Set;

public interface ManufacturerService {

    Manufacturer getManufacturerById(Integer id);
    void saveManufacturer(Manufacturer manufacturer);
    void deleteManufacturerById(Integer id);
    void updateManufacturer(int id, String number, String name, String phone, String address, String fax, String email, Set<Plate> plateSet, Set<Glue> glueSet);
    List<Manufacturer> findAll();

}
