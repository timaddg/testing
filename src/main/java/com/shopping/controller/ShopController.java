package com.shopping.controller;

import com.mysql.cj.Session;
import com.shopping.model.Shop;
import com.shopping.repository.ShopRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShopController {
    @Autowired
    private ShopRepository shopRepository;


    @RequestMapping(value="/get/{brand_id}",method = RequestMethod.GET)
    public Shop get(@PathVariable String brand_id){
        return shopRepository.getItems(brand_id);
    }
    @RequestMapping(value="/get",method = RequestMethod.GET)
    public List<Shop> retrieve(){
        return shopRepository.listItems();
    }
    @RequestMapping(value="/update/{brand_id}/{brand_name}",method = RequestMethod.PUT)
    public void update(@PathVariable String brand_id, @PathVariable String brand_name){
        shopRepository.updateItems(brand_id,brand_name);
    }
    @RequestMapping(value = "/delete/{brand_id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable String brand_id){
        shopRepository.deleteItems(brand_id);
    }

}
