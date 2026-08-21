package Soldiers;

public class Unit {

    private int soldierHealth;
    private int attackDamage;

    public Unit() {
    }

    public Unit(int soldierHealth, int attackDamage) {
        setAttackDamage(attackDamage);
        setSoldierHealth(soldierHealth);
    }

    public int getSoldierHealth() {
        return soldierHealth;
    }

    public void setSoldierHealth(int soldierHealth) {
        if(soldierHealth < 0){
            this.soldierHealth = 0;
        }else {
            this.soldierHealth = soldierHealth;
        }
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        if(attackDamage < 0){
            this.attackDamage = 0;
        }else {
            this.attackDamage = attackDamage;
            }
    }
}
