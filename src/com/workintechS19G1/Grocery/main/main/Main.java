package com.workintechS19G1.Grocery.main.main;

import com.workintechS19G1.Grocery.main.model.ShoppingCartStart;

import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args){
        List<String> groceryList = new LinkedList<>();
        ShoppingCartStart.listActivityStart(groceryList);


    }


}