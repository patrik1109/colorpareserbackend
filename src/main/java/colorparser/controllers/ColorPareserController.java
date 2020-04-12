package colorparser.controllers;

import colorparser.entities.Manufacturer;
import colorparser.repository.GlueRepository;
import colorparser.repository.ManufacturerRepository;
import colorparser.repository.MiksRepository;
import colorparser.repository.PlateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class ColorPareserController {

    @Autowired
    GlueRepository glueRepository;

    @Autowired
    PlateRepository plateRepository;

    @Autowired
    MiksRepository miksRepository;

    @Autowired
    ManufacturerRepository manufacturerRepository;

    @GetMapping(value = { "/", "/index" } )
    public ModelAndView index (Map<String, Object> model){
        ModelAndView NewModel = new ModelAndView("index");
        ArrayList<Manufacturer> manufacturers = (ArrayList<Manufacturer>) manufacturerRepository.findAll();
        return  NewModel;
    }


}
