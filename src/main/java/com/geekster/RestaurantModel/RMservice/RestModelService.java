package com.geekster.RestaurantModel.RMservice;

import com.geekster.RestaurantModel.RMmodel.RestModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestModelService {
    private static List<RestModel> restaurants = new ArrayList<>();
    static{
        restaurants.add(new RestModel(1,"Chai Sutta Bar","Shiva Nagar Kathua",7845224903L,"Cafeteria",6));
        restaurants.add(new RestModel(2,"Kavasan","Main Market Jammu",9415224903L,"Fast Food Joint",8));
        restaurants.add(new RestModel(3,"Signature Bowls","Patel Nagar Gandhi Nagar",7298614576L,"Fine Dining Restaurant",15));
        restaurants.add(new RestModel(4,"Shiva Food Court","Riya Morh Vijaypur",7006458132L,"Dhaba",5));
    }
    public List<RestModel>findAll(){
        return restaurants;
    }
    public RestModel findByName(String name){
        for(RestModel restaurant:restaurants){
            if(restaurant.getName().contains(name))
                return restaurant;
        }
        return null;
    }
    public void addRestaurant(RestModel restaurant){
        restaurants.add(restaurant);
    }
}
