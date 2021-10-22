package com.shopping.exception;

import java.util.InputMismatchException;

public class ShopNotFoundException extends Exception{
    //private static final long serialVersionUID = 1L;
    private String mes="1";
    public ShopNotFoundException() {
    }

    public ShopNotFoundException(String message) {
        super(message);
    }
    public String toString(){
        return "Enter the minimum items : "+mes;
    }
}
