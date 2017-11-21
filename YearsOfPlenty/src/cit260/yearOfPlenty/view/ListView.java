/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.view;

import cit260.yearOfPlenty.InventoryActor;
import cit260.yearOfPlenty.InventoryItem;
import cit260.yearOfPlenty.control.GameControl;

/**
 *
 * @author hayley henderson
 */
public class ListView {
    
    public static void displayListView(){
        System.out.println("Items");
        InventoryItem[] items = GameControl.createItems();
        for (InventoryItem item : items) {
            System.out.println(item.description);
        }
        //Darren Kearns Individual Lesson 10
        System.out.println("\nActors");
        InventoryActor[] actors = GameControl.createActor();
        for (InventoryActor actor : actors) {
            System.out.println(actor.description);
        }
    }
}
