package Buildings;

import GameEngine.Resource;
import Soldiers.Unit;

public class Building {

    // Eltelt körök száma az építés óta
    private int turnsPassed;

    // Hány kör van még hátra az egység elkészültéig
    private int turnsUntilUnit;

    // Hány kör van még hátra a nyersanyag elkészültéig
    private int turnsUntilResource;

    // Egységgyártási ciklusidő
    private int unitInterval;

    // Nyersanyagtermelési ciklusidő
    private int resourceInterval;

    // Volt e egység gyártás
    boolean progressTurnMakeUnit = false;

    // volt e nyersanyag gyártás
    boolean resourceIntervalMakeMaterial = false;



    public Building(int unitInterval, int resourceInterval) {
        this.turnsPassed = 0;
        this.turnsUntilUnit = unitInterval;
        this.turnsUntilResource = resourceInterval;
        this.unitInterval = unitInterval;
        this.resourceInterval = resourceInterval;
    }

    public void progressTurn(){
        progressTurnMakeUnit = false;
        resourceIntervalMakeMaterial = false;

        this.turnsPassed += 1;
        this.turnsUntilUnit -= 1;
        this.turnsUntilResource -= 1;

        if (this.turnsUntilUnit == 0){
            this.turnsUntilUnit = this.unitInterval;
            progressTurnMakeUnit = true;
        }

        if (turnsUntilResource == 0){
            this.turnsUntilResource = this.resourceInterval;
            resourceIntervalMakeMaterial = true;
        }

    }

    public boolean canProduceUnit() {
        return progressTurnMakeUnit;
    }

    public Unit produceUnit() {
        return progressTurnMakeUnit ? new Unit() : null;
    }

    public boolean canProduceResource() {
        return resourceIntervalMakeMaterial;
    }


    public int getTurnsPassed() {
        return turnsPassed;
    }

    public void setTurnsPassed(int turnsPassed) {
        this.turnsPassed = turnsPassed;
    }

    public int getTurnsUntilUnit() {
        return turnsUntilUnit;
    }

    public void setTurnsUntilUnit(int turnsUntilUnit) {
        this.turnsUntilUnit = turnsUntilUnit;
    }

    public int getTurnsUntilResource() {
        return turnsUntilResource;
    }

    public void setTurnsUntilResource(int turnsUntilResource) {
        this.turnsUntilResource = turnsUntilResource;
    }

    public int getUnitInterval() {
        return unitInterval;
    }

    public void setUnitInterval(int unitInterval) {
        this.unitInterval = unitInterval;
    }

    public int getResourceInterval() {
        return resourceInterval;
    }

    public void setResourceInterval(int resourceInterval) {
        this.resourceInterval = resourceInterval;
    }


    public Resource produceResource() {
        return resourceIntervalMakeMaterial ? new Resource() : null;
    }
}
