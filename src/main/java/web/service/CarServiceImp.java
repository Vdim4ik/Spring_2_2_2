package web.service;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    private final List<Car> cars = Arrays.asList(
            new Car("Vaz", 2001, "Black"),
            new Car("Vaz", 2003, "Green"),
            new Car("Vaz", 2004, "Yellow"),
            new Car("Vaz", 2005, "Blue"),
            new Car("Vaz", 2007, "White"));

    @Override
    public List<Car> getListCar(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
