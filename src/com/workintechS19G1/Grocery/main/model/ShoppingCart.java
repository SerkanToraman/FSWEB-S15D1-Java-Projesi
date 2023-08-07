package com.workintechS19G1.Grocery.main.model;

import java.util.Collections;
import java.util.List;

public class ShoppingCart {

    public static void addItems(List<String> groceryList, String input){
        if(input.contains(",")){
            String[] elements = input.split(",");
            for(String element:elements){
                if(element!=null && !element.trim().isEmpty()){
                    if(!checkItemsInList(groceryList,element)){
                        groceryList.add(element.trim());
                }
              }
            }
        }else{
            if(input!=null  && !input.trim().isEmpty()){
                if(!checkItemsInList(groceryList,input)) {
                    groceryList.add(input.trim());
                }
            }
        }
        printSorted(groceryList);
    }
    public static void removeItem(List<String> groceryList, String input){
        if(input.contains(",")){
            String[] elements = input.split(",");
            for(String element:elements){
                if(element!=null && !element.trim().isEmpty()){
                    if(checkItemsInList(groceryList,element)) {
                        groceryList.remove(element.trim());
                    }
                }
            }
        }else{
            if(input!=null  && !input.trim().isEmpty()){
                if(checkItemsInList(groceryList,input)) {
                    groceryList.remove(input.trim());
                }
            }
        }
        printSorted(groceryList);
    }
    public static boolean checkItemsInList(List<String> products, String product){
        return products.contains(product.trim());
    }
    public static void printSorted(List<String> products){
        Collections.sort(products);
        for(String product:products){
            System.out.println(product);
        }
    }
}
