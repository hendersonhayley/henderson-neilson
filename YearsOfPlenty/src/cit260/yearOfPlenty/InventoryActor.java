/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty;

import java.io.Serializable;

/**
 *
 * @author darrenkearns
 */

// Darren Kearns Individual Assignment
public class InventoryActor implements Serializable{
    
    public String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String descrtiption) {
        this.description = descrtiption;
    }
    
}
