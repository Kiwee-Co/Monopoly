package exercise.kiwee.game.properties.realestate;

import static exercise.kiwee.game.gamer.Player.PlayerStatus.JAIL;

import exercise.kiwee.game.gamer.Player;
import exercise.kiwee.game.properties.Property;

abstract class RealEstate extends Property {
    protected int cost;
    protected int rent;
    
    protected int houses;
    protected boolean hotel;

    protected Player owner;
    
    RealEstate(String name) {
        super(name);
    }
    
    public int getRental() {
        if (owner == null || owner.getStatus() == JAIL) {
            return 0;
        }
        
        if (hotel) {
            return rent * 5;
        }
        
        return rent * houses;
    }
}
