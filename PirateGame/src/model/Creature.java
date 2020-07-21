package model;

public class Creature {

    private Coordinate coordinate; // координаты на карте

    private int health; // здоровье

    private int stamina; // выносливость

    public Creature(Coordinate coordinate, int stamina) {
        this.coordinate = coordinate;
        this.health = 100;
        this.stamina = stamina;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}
