package Buildings;

import GameEngine.Resource;
import Soldiers.Swordsman;
import Soldiers.Unit;

public class Barracks extends Building{

    public Barracks() {
        super(4, 3);

    }

    @Override
    public Unit produceUnit() {
        return progressTurnMakeUnit ? new Swordsman() : null;
    }

    @Override
    public Resource produceResource() {
        return resourceIntervalMakeMaterial ? new Resource("Steel", 10) : null;
    }



}
