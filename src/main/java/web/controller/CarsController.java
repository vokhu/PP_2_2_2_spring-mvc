package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @GetMapping()
    public String getCars(@RequestParam (defaultValue = "5") int count, Model model){
        CarServiceImpl carService = new CarServiceImpl();
        List<Car> countCar = carService.getCar(count);
        model.addAttribute("countCar" ,countCar);
        return "cars";
    }
}
