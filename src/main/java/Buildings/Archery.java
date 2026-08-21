package Buildings;

import GameEngine.Resource;
import Soldiers.Archer;
import Soldiers.Unit;

public class Archery extends Building{

    public Archery() {
        super(3, 2);
    }

    @Override
    public Unit produceUnit() {
        return progressTurnMakeUnit ? new Archer() : null;
    }

    @Override
    public Resource produceResource() {
        return resourceIntervalMakeMaterial ? new Resource("Gold", 5) : null;
    }

}
