package com.bilgee.demo;

abstract class Character {
    private int health;
    private int damage;
    private int strength;

    public Character(int health, int damage, int strength) {
        this.health = health;
        this.damage = damage;
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
