/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group1.model;

import cit260.group1.model.Crops;
import cit260.group1.model.Player;

/**
 *
 * @author admin
 */
public class Group1Model {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player ();
        
        playerOne.setName("Irena Kyman");
        
        String  playerOneName = playerOne.getName();
        
        System.out.println(playerOne.toString());
        
        Crops yearOne = new Crops ();
        
        yearOne.setNewPeople(5);
        
        System.out.println(yearOne.toString());
    }
    
}
