package com.shopping.repository;

import com.shopping.exception.ShopNotFoundException;
import com.shopping.model.Shop;
import com.shopping.repository.util.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;



@Transactional
@Repository
public class ShopRepoImpl implements ShopRepository{
    private DataSource ds;
    @Autowired
    private JdbcTemplate jdbcTemplate;


    /*@Override
    public void setDataSource(DataSource ds) {
        this.ds=ds;
        jdbcTemplate=new JdbcTemplate(ds);
    }

     */


    @Override
    public void createTag(String brand_id,String brand_name) {
        jdbcTemplate.update("insert into brands(brand_id,brand_name)  values (?,?)",brand_id,brand_name);

        // System.out.println("Items added");
    }

    @Override
    public Shop getItems(String brand_id) {
        Shop shoplist= jdbcTemplate.queryForObject("select * from brands where brand_id= ?",new ShopMapper(),brand_id);

        return shoplist;
    }

    @Override
    public List<Shop> listItems() {
        List<Shop> shopping;
        shopping=jdbcTemplate.query("select * from brands ",new ShopMapper());
        return shopping;
    }

    @Override
    public void deleteItems(String brand_id) {
        jdbcTemplate.update("delete from brands where brand_id= ?",brand_id);
        System.out.println("Record deleted");
    }

    @Override
    public void updateItems(String brand_id,String brand_name) {
        jdbcTemplate.update("update brands set brand_name = ? where brand_id = ? ",brand_name,brand_id);
    }
}
