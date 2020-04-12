package colorparser.service;

import colorparser.entities.Plate;
import colorparser.repository.PlateRepository;

import java.util.List;

public class PlateServiceImpl implements PlateService {

    PlateRepository repository;

    @Override
    public Plate getPlateById(Integer id) {
        return repository.getOne(id);
    }

    @Override
    public void savePlate(Plate plate) {
        repository.save(plate);
    }

    @Override
    public void deletePlateById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void updatePlate(int id, String number, String name, String color, Integer hight, Integer lenght, Integer width, int idManufacturer) {
        Plate plate = new Plate(id,number,name,color,hight,lenght,width,idManufacturer);
        repository.save(plate);
    }

    @Override
    public List<Plate> findAll() {
        return repository.findAll();
    }
}
