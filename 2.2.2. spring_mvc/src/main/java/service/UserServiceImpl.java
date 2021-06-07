package service;

import Entity.Car;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl {
    public List<Car> getCars() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW", 3, "Diesel"));
        list.add(new Car("Lexus", 4, "Benzin"));
        list.add(new Car("Mazda", 5, "Benzin"));
        list.add(new Car("GAZ", 3111, "Diesel"));
        list.add(new Car("VAZ", 21099, "Benzin"));
        return list;
    }


}
