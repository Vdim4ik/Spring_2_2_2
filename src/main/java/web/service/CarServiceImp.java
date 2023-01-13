package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final CarDao carDao;

    @Autowired
    public CarServiceImp(@Qualifier("carDaoImp") CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getListCar(List<Car> cars, int count) {
        return carDao.getListCar(cars, count);
    }
}
