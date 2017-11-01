/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty;
import java.io.Serializable;

/**
 *
 * @author adams
 */
public class Crops implements Serializable{
    private int year;
    private int population;
    private int acres;
    private int cropYield;
    private int wheatInStore;
    private int numberWhoDied;
    private int newPeople;
    private int harvest;
    private int pharaohsShare;
    private int fed;
    private int planted;
   
 //here is the one to one relationship for the game class   
    private Game game;
    
   
 //constructor   
    public Crops() {
    }
    
//getter, setter for the game object relationship

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
     
     
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getAcres() {
        return acres;
    }

    public void setAcres(int acres) {
        this.acres = acres;
    }

    public int getCropYield() {
        return cropYield;
    }

    public void setCropYield(int cropYield) {
        this.cropYield = cropYield;
    }

    public int getWheatInStore() {
        return wheatInStore;
    }

    public void setWheatInStore(int wheatInStore) {
        this.wheatInStore = wheatInStore;
    }

    public int getNumberWhoDied() {
        return numberWhoDied;
    }

    public void setNumberWhoDied(int numberWhoDied) {
        this.numberWhoDied = numberWhoDied;
    }

    public int getNewPeople() {
        return newPeople;
    }

    public void setNewPeople(int newPeople) {
        this.newPeople = newPeople;
    }

    public int getHarvest() {
        return harvest;
    }

    public void setHarvest(int harvest) {
        this.harvest = harvest;
    }

    public int getPharaohsShare() {
        return pharaohsShare;
    }

    public void setPharaohsShare(int pharaohsShare) {
        this.pharaohsShare = pharaohsShare;
    }

    public int getFed() {
        return fed;
    }

    public void setFed(int fed) {
        this.fed = fed;
    }

    public int getPlanted() {
        return planted;
    }

    public void setPlanted(int planted) {
        this.planted = planted;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.year;
        hash = 17 * hash + this.population;
        hash = 17 * hash + this.acres;
        hash = 17 * hash + this.cropYield;
        hash = 17 * hash + this.wheatInStore;
        hash = 17 * hash + this.numberWhoDied;
        hash = 17 * hash + this.newPeople;
        hash = 17 * hash + this.harvest;
        hash = 17 * hash + this.pharaohsShare;
        hash = 17 * hash + this.fed;
        hash = 17 * hash + this.planted;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Crops other = (Crops) obj;
        if (this.year != other.year) {
            return false;
        }
        if (this.population != other.population) {
            return false;
        }
        if (this.acres != other.acres) {
            return false;
        }
        if (this.cropYield != other.cropYield) {
            return false;
        }
        if (this.wheatInStore != other.wheatInStore) {
            return false;
        }
        if (this.numberWhoDied != other.numberWhoDied) {
            return false;
        }
        if (this.newPeople != other.newPeople) {
            return false;
        }
        if (this.harvest != other.harvest) {
            return false;
        }
        if (this.pharaohsShare != other.pharaohsShare) {
            return false;
        }
        if (this.fed != other.fed) {
            return false;
        }
        if (this.planted != other.planted) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Crops{" + "year=" + year + ", population=" + population + ", acres=" + acres + ", cropYield=" + cropYield + ", wheatInStore=" + wheatInStore + ", numberWhoDied=" + numberWhoDied + ", newPeople=" + newPeople + ", harvest=" + harvest + ", pharaohsShare=" + pharaohsShare + ", fed=" + fed + ", planted=" + planted + '}';
    }

   
    
    
}
