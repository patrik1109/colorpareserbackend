package colorparser.service;

import colorparser.entities.Plate;

import java.util.List;

public interface PlateService {

    Plate getPlateById(Integer id);
    void savePlate(Plate plate);
    void deletePlateById(Integer id);
    void updatePlate(int id, String number, String name, String color, Integer hight, Integer lenght, Integer width, int idManufacturer);
    List<Plate> findAll();
}
