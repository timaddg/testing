package com.shopping.repository.util;

import com.shopping.model.Shop;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ShopMapper implements RowMapper<Shop> {
    public Shop mapRow(ResultSet rs,int rowNum) throws SQLException{
        Shop shop=new Shop();
        shop.setTag(rs.getString("brand_id"));
       // shop.setGender(rs.getString("gender"));
        //shop.setItem(rs.getString("item"));
        shop.setName(rs.getString("brand_name"));
        return shop;
    }
}