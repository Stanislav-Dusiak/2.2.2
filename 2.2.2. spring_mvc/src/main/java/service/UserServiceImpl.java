package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.controller.Cars;

@Service
public class UserServiceImpl {
    public static int getCars() {
        return Cars.allCount;
    }
}
