package GameEngine;

import Buildings.Barracks;
import Buildings.Building;
import Soldiers.Archer;
import Soldiers.Swordsman;
import Soldiers.Unit;

import java.util.List;

public class Treasury {

    private List<Building> buildings;
    private List<Archer> archers;
    private List<Swordsman> swordsmens;
    private int gold = 0;
    private int steel = 0;

    public Treasury(List<Building> buildings, List<Archer> archers, List<Swordsman> swordsmens, int gold, int steel) {
        this.buildings = buildings;
        this.archers = archers;
        this.swordsmens = swordsmens;
        this.gold = gold;
        this.steel = steel;
    }


    public void updateBuildings() {
        for (Building building : buildings) {
            // 1. Körléptetés az épületen belül
            building.progressTurn();

            // 2. Ellenőrzés: termelt-e valamit?
            if (building.canProduceUnit()) {
                Unit unit = building.produceUnit(); // Például Archer vagy Swordsman
                // Hozzáadás a megfelelő listához
                if (unit instanceof Archer) {
                    archers.add((Archer) unit);
                } else if (unit instanceof Swordsman) {
                    swordsmens.add((Swordsman) unit);
                }
            }

            if (building.canProduceResource()) {
                Resource res = building.produceResource();
                // Nyersanyag hozzáadása a megfelelő változóhoz
                if (res.getType().equals("Gold")) {
                    this.gold += res.getQuantity();
                } else {
                    this.steel += res.getQuantity();
                }
            }
        }
    }


    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    public List<Archer> getArchers() {
        return archers;
    }

    public void setArchers(List<Archer> archers) {
        this.archers = archers;
    }

    public List<Swordsman> getSwordsmens() {
        return swordsmens;
    }

    public void setSwordsmens(List<Swordsman> swordsmens) {
        this.swordsmens = swordsmens;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getSteel() {
        return steel;
    }

    public void setSteel(int steel) {
        this.steel = steel;
    }







    }
