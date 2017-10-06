/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.group1.model;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class Crops implements Serializable {
    
    private int years;
    private int population;
    private int acres;
    private int cropYield;
    private int wheatInStore;
    private int numberWhoDied;
    private int newPeople;
    private int harvest;
    private int pharoohsShare;
    private int fed;
    private int planted;

    public Crops() {
    }

    
    
    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
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

    public int getPharoohsShare() {
        return pharoohsShare;
    }

    public void setPharoohsShare(int pharoohsShare) {
        this.pharoohsShare = pharoohsShare;
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
        hash = 97 * hash + this.years;
        hash = 97 * hash + this.population;
        hash = 97 * hash + this.acres;
        hash = 97 * hash + this.cropYield;
        hash = 97 * hash + this.wheatInStore;
        hash = 97 * hash + this.numberWhoDied;
        hash = 97 * hash + this.newPeople;
        hash = 97 * hash + this.harvest;
        hash = 97 * hash + this.pharoohsShare;
        hash = 97 * hash + this.fed;
        hash = 97 * hash + this.planted;
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
        if (this.years != other.years) {
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
        if (this.pharoohsShare != other.pharoohsShare) {
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
        return "Crops{" + "years=" + years + ", population=" + population + ", acres=" + acres + ", cropYield=" + cropYield + ", wheatInStore=" + wheatInStore + ", numberWhoDied=" + numberWhoDied + ", newPeople=" + newPeople + ", harvest=" + harvest + ", pharoohsShare=" + pharoohsShare + ", fed=" + fed + ", planted=" + planted + '}';
    }
    
    
    
    
    
    
    
}
