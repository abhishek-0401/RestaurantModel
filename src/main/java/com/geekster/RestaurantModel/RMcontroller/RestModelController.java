package com.geekster.RestaurantModel.RMcontroller;

import com.geekster.RestaurantModel.RMmodel.RestModel;
import com.geekster.RestaurantModel.RMservice.RestModelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/restaurant-model")
public class RestModelController {
    private final RestModelService restModelService;
    public RestModelController(RestModelService restModelService){
        this.restModelService=restModelService;
    }

    //    http://localhost:8080/api/v1/restaurant-model/add-restaurant
    @PostMapping("/add-restaurant")
    public void addRestaurant(@RequestBody RestModel restModel){
        restModelService.addRestaurant(restModel);
    }
//    {
//        "restaurantId": 5,
//            "name": "17 Miles Hotel",
//            "address": "Bahu Plaza Jammu",
//            "number": 9419686455,
//            "speciality": "Dining Restaurant",
//            "totalStaff": 30
//    }


    //    http://localhost:8080/api/v1/restaurant-model/find-restaurant/name/Kavasan
    @GetMapping("/find-restaurant/name/{name}")
    public RestModel findByName(@PathVariable String name){
        return restModelService.findByName(name);
    }


    //    http://localhost:8080/api/v1/restaurant-model/find-all
    @GetMapping("/find-all")
    public List<RestModel> findAll(){
        return restModelService.findAll();
    }
}
