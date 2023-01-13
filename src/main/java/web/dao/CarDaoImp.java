package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class CarDaoImp implements CarDao {

    protected final List<Car> cars = Arrays.asList(
            new Car("Lada", 2001, "Red"),
            new Car("Lada", 2005, "Orange"),
            new Car("Lada", 2007, "Green"),
            new Car("Lada", 2010, "White"),
            new Car("Lada", 2004, "Black")
    );

    @Override
    public List<Car> getListCar(List<Car> cars, int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
