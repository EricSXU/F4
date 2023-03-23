/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package f4;

/**
 *
 * @author school
 */
public class swordsman extends armyRecruit{
    
    public int shieldHealth;

public swordsman(){    
 super();
 shieldHealth = 0;
}

public swordsman(String n, String tN, int SH){    
 super(n, tN);
 shieldHealth = SH;
}
    
public int getShieldHealth()
{
    return shieldHealth;
}
    public String toString()
    {
        return(this.name + ", Lord of " + this.teamName);
    }
    
}
