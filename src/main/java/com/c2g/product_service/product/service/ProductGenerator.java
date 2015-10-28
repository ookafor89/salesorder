package com.c2g.product_service.product.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.apache.camel.Handler;

import com.javacodegeeks.ws.product_service.types.ProductRequest;


/**
 * A bean which we use in the route
 */
public class ProductGenerator{

    private String say = "Hello World";
    private static ArrayList<String> PRODUCT_DETAILS = new ArrayList<String>();
    
    @Handler
    public ProductRequest generateProduct(){
    	
    	Random rand=new Random();
    	int index=rand.nextInt(2);
    	ProductRequest request = new ProductRequest();
		request.setId( PRODUCT_DETAILS.get(index));
    	return request;
    }
    
    static {
    	PRODUCT_DETAILS.add("P01");
    	PRODUCT_DETAILS.add("P02");
    }
}
