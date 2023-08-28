package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

@Service
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
        int counts=0;
        if (count>5) {
            counts=5;
        } else counts = count;
        return tachki.stream().limit(counts).collect(Collectors.toList());
    }
}
