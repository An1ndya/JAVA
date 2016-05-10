/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enemyshiptesting;

/**
 *
 * @author ANINDYA
 */
public abstract class EnemyShip {
    private String name;
    private double amtDamage;
    
    public String getName(){return name;}
    public void setName(String newName){name=newName;}
    
    public double getDamage(){return amtDamage;}
    public void setDamage(double newDamage){amtDamage=newDamage;}
    
    public void followerShip(){
        System.out.println(getName() + "is following the hero");
    }
     public void displayEnemyship(){
        System.out.println(getName() + "on the screen");
    }
     public void enemyShipShoots(){
        System.out.println(getName() + "attacks and doe" + getDamage() );
    }
}
