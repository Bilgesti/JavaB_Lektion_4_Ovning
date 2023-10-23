package com.bilgee.demo;

public class Game {
    private Player player;
    private Monster monster;

    public Player getPlayer() {
        return player;
    }

    public Monster getMonster() {
        return monster;
    }

    public Game(){
        player = new Player( 100,15,80 );
        monster = new Monster( 120,25,60 );

    }

}
