package GameEngine;

import Buildings.Building;
import Soldiers.Archer;
import Soldiers.Swordsman;
import User.ConsolUserInterface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Kezdő listák és nyersanyagok létrehozása a Treasury számára
        Treasury treasury = new Treasury(
                new ArrayList<Building>(),
                new ArrayList<Archer>(),
                new ArrayList<Swordsman>(),
                0, // Kezdő arany
                0  // Kezdő acél
        );

        // A konzolos felület példányosítása
        ConsolUserInterface ui = new ConsolUserInterface();

        // A játékmotor (Engine) indítása
        Engine engine = new Engine(treasury, ui);

        System.out.println("Üdv a Játékban! Használható parancsok: build barracks, build archery, skip, status, quit");

        // A fő játúciklus elindítása
        engine.gameLoop();

        System.out.println("Játék vége. Viszlát!");
    }
}