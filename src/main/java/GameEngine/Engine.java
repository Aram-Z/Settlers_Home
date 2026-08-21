package GameEngine;

import Buildings.Archery;
import Buildings.Barracks;
import Buildings.Building;
import User.ConsolUserInterface;

public class Engine {

    Treasury treasury;
    ConsolUserInterface consolUserInterface;
    Building building;
    Archery archery;
    Barracks barracks;

    public Engine(Treasury treasury, ConsolUserInterface consolUserInterface) {
        this.treasury = treasury;
        this.consolUserInterface = consolUserInterface;
    }


    public void gameLoop() {
        String command;
        while (!(command = consolUserInterface.getUserCommand()).equals("quit")) {

            switch (command) {
                case "build barracks":
                    Barracks newBarracks = new Barracks();
                    // Hozzá kell adni a treasury épületlistájához is!
                    treasury.getBuildings().add(newBarracks);
                    treasury.updateBuildings();
                    break;

                case "build archery":
                    Archery newArchery = new Archery();
                    treasury.getBuildings().add(newArchery);
                    treasury.updateBuildings();
                    break;

                case "skip":
                    treasury.updateBuildings();
                    break;

                case "status":
                    System.out.println(treasury.toString());
                    break;

                default:
                    System.out.println("Unknown command! Please try again.");
                    break;
            }
        }

        consolUserInterface.closeScanner();
    }
}
