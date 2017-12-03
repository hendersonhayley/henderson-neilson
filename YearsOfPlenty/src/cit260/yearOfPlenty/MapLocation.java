/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty;

import java.io.Serializable;

/**
 *
 * @author brennanneilson
 */
public class MapLocation implements Serializable {
    public String name;
    public String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String descrtiption) {
        this.description = descrtiption;
    }
}
