package com.shopping;

import com.shopping.model.Shop;
import com.shopping.repository.ShopRepoImpl;
import com.shopping.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@SpringBootApplication
@ImportResource(value = "jdbc-config.xml")

public class ShopMain  {

    public static void main(String[] args) {
        SpringApplication.run(ShopMain.class, args);
    }


}
