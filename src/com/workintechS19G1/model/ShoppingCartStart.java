package com.workintechS19G1.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCartStart {



    public static void listActivityStart(List<String> groceryList) {
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Yapacağınız işlemi giriniz; 0 İşlemden çıkarır, 1 Listeye ekleme ,2 Listeden çıkarma işlemi yaptırır: ");
                int process = scanInt.nextInt();
                switch (process) {
                    case 0:
                        System.out.println("Mevcut araba listeniz");
                        System.exit(0);
                    case 1:
                        System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                        ShoppingCart.addItems(groceryList,scanStr.nextLine());
                        break;
                    case 2:
                        System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
                        ShoppingCart.removeItem(groceryList,scanStr.nextLine());
                        break;
                    default:
                        System.out.println("Gireceğiniz rakam 0 ile 2 arasında olmalı");
                        break;
                }
            }catch(Exception ex){
                System.out.println("Geçersiz işlem: " +ex.getMessage());
                break;
            }

        }

    }
}
