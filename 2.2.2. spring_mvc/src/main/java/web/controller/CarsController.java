package web.controller;

import Entity.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    UserServiceImpl userService = new UserServiceImpl();

    @GetMapping(value = "/cars")
    public String Car(@RequestParam(value = "count", required = false) String count, Model model) {
        int c;
        if(count == null) {
            c = 6;
        } else {
            c = Integer.parseInt(count);
        }
        if(c >= 5) {
            c = 5;
        }
        List<Car> resultList = new ArrayList<>();
        for(int i = 0; i < c; i++) {
            resultList.add(userService.getCars().get(i));
        }
        model.addAttribute("cars", resultList);
        return "cars";
    }
}
