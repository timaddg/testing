package com.shopping;

import com.shopping.exception.ShopNotFoundException;
import com.shopping.model.Shop;
import com.shopping.service.ShopService;
import com.shopping.service.ShopServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Component
public class ShopRunner implements CommandLineRunner {

    @Autowired
    private ShopService shopService;


    @Override
    public void run(String... args) throws Exception {
        testdata();
    }

    public void testdata() throws ShopNotFoundException {
        Scanner sc = new Scanner(System.in);
        String id = null, gnd = null, it = null,bn=null;
        float pr = 0;
        int n=0;

        //ShopServiceImpl shopService1=new ShopServiceImpl();
        //Shop shopping=new Shop();



        try{
            System.out.println("Enter the number of items (Min 1) ");
            n = sc.nextInt();
            if(n==0){
                throw new ShopNotFoundException();
            }
        }
        catch (ShopNotFoundException e){
            System.out.println(e);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the id ");
            id = sc.next();
        //    System.out.println("Enter the gender");
          //  gnd = sc.next();
            System.out.println("Enter the brand name ");
            bn = sc.next();
          //  System.out.println("Enter the price");
           // pr = sc.nextFloat();
        }
     // (tag,gender,item,price)->{jdbcTemplate.update("insert into shop(tag,gender,item,price)  values (?,?,?,?)",tag,gender,item,price);};
        //shopService.createTag(tg,gnd,it,pr);



       shopService.createTag(id,bn);

       // System.out.println("Retrieve a specific tag ");
       // String stg=sc.next();

        //Shop shopping=shopService.getItems(stg);

       // System.out.println("Item: "+shopping.getItem());
       // System.out.println("Gender: "+shopping.getGender());
       // System.out.println("Price: "+shopping.getPrice());


        System.out.println("Do you want to delete any items (Yes/No) ");
        String ans=sc.next();
        if(ans.equalsIgnoreCase("yes"))
        {
            System.out.println("Enter the item to be deleted");
            String tag=sc.next();
            shopService.deleteItems(tag);
        }
        else if(ans.equalsIgnoreCase("no")){
            System.out.println("Checkout");
        }


        System.out.println("Any changes to be done ?");
        String res=sc.next();
        if(res.equalsIgnoreCase("yes"))
        {
            System.out.println("Enter the item to be updated");
            String tag=sc.next();
            String item=sc.next();
            shopService.updateItems(tag,item);
        }
        else if(res.equalsIgnoreCase("no")){
            System.out.println("Checkout");
        }


        System.out.println("Final List of Items");
    /*
        for (Shop shop1:shopService.listItems()) {
            System.out.println("Tag: " + shop1.getTag());
            System.out.println("Gender: " + shop1.getGender());
            System.out.println("Item: " + shop1.getItem());
            System.out.println("Price: " + shop1.getPrice());
        }

     */


      shopService.listItems().forEach((p)->System.out.println(p.getId()));
        shopService.listItems().forEach((p)->System.out.println(p.getName()));



    }

}
