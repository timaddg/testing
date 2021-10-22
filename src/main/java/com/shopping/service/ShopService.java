package com.shopping.service;

import com.shopping.exception.ShopNotFoundException;
import com.shopping.model.Shop;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
//@Service

public interface ShopService {
    public void createTag(String brand_id,String brand_name);
    public Shop getItems(String brand_id);
    public List<Shop> listItems();
    public void deleteItems(String brand_id);
    public void updateItems(String brand_id,String brand_name);
}
