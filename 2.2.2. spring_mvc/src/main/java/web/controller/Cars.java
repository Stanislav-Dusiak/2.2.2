package web.controller;

import Entity.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Cars {
    public static int allCount;
    @GetMapping(value = "/cars")
    public String Car(@RequestParam(value = "count", required = false) String count, Model model) {
        List<Car> list = new ArrayList<>();
        int c;
        list.add(new Car("BMW", 3, "Diesel"));
        list.add(new Car("Lexus", 4, "Benzin"));
        list.add(new Car("Mazda", 5, "Benzin"));
        list.add(new Car("GAZ", 3111, "Diesel"));
        list.add(new Car("VAZ", 21099, "Benzin"));
        List<Car> resultList = new ArrayList<>();
        if(count == null) {
            c = 6;
        } else {
            c = Integer.parseInt(count);
        }
        if(c >= 5) {
            c = 5;
        }
        for(int i = 0; i < c; i++) {
            resultList.add(list.get(i));
        }
        model.addAttribute("cars", resultList);
        allCount = list.size();
        return "cars";
    }
}
