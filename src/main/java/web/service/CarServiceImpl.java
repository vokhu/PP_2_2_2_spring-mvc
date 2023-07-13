package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService{

    private List<Car> tachki;

    {
        tachki = new ArrayList<>();
        tachki.add(new Car("BMW", "320","BLACK"));
        tachki.add(new Car("AUDI", "A4", "BLUE"));
        tachki.add(new Car("MERSEDES", "C63AMG", "SILVER"));
        tachki.add(new Car("OPEL", "ASTRA", "RED"));
        tachki.add(new Car("FIAT", "500", "WHITE"));
    }


    @Override
    public List<Car> getCar(int count) {

        return tachki.stream().limit(count).collect(Collectors.toList());
    }
}
