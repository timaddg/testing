package com.shopping.repository;

import com.shopping.model.Shop;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
//@Repository
public interface ShopRepository {
   // public void setDataSource(DataSource ds);
    public void createTag(String brand_id,String brand_name);
    public Shop getItems(String brand_id);
    public List<Shop> listItems();
    public void deleteItems(String brand_id);
    public void updateItems(String brand_id,String brand_name);
}
