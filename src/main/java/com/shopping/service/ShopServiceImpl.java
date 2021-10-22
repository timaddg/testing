package com.shopping.service;

import com.shopping.exception.ShopNotFoundException;
import com.shopping.model.Shop;
import com.shopping.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShopServiceImpl implements ShopService{

    @Autowired
    ShopRepository shopRepository;


    @Override
    public void createTag(String brand_id,String brand_name)  {
        System.out.println("Created ");
        shopRepository.createTag(brand_id,brand_name);
       // throw new ShopNotFoundException();
    }

    @Override
    public Shop getItems(String brand_id) {
        return shopRepository.getItems(brand_id);
    }

    @Override
    public List<Shop> listItems() {
        return shopRepository.listItems();
    }

    @Override
    public void deleteItems(String brand_id) {
    System.out.println("Deleted");
    shopRepository.deleteItems(brand_id);
    }

    @Override
    public void updateItems(String brand_id, String brand_name) {
    System.out.println("Updated");
    shopRepository.updateItems(brand_id,brand_name);
    }
}
