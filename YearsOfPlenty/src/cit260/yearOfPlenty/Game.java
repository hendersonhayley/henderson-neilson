/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author adams
 */
public class Game implements Serializable {
    private int totalTime;
    private Player Player;
    private Crops theCrops=null;

    public Crops getTheCrops() {
        return theCrops;
    }

    public void setTheCrops(Crops _cropRef) {
        theCrops = _cropRef;
    }

    public Game(int totalTime) {
        this.totalTime = totalTime;
    }

    public Player getPlayer() {
        return Player;
    }

    public void setPlayer(Player Player) {
        this.Player = Player;
    }
    
    

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.totalTime;
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
        final Game other = (Game) obj;
        if (this.totalTime != other.totalTime) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + '}';
    }
    

    
    
}
