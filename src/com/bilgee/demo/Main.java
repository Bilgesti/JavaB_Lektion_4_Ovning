package com.bilgee.demo;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        Game game = new Game();

        Player player = game.getPlayer();
        Monster monster = game.getMonster();


        while (true){
        System.out.println( "Options:");
            System.out.println("1. Reduce player and monster health");
            System.out.println("2. Get player and monster health");
            System.out.println("3. Quit");

            switch (scan.nextInt()) {
                case 1 -> {
                    player.setHealth( player.getHealth() - 5 );
                    monster.setHealth( monster.getHealth() - 5 );

                    System.out.println( player.getHealth() - 5 );
                    System.out.println( monster.getHealth() - 5 );
                }
                case 2 -> {
                    System.out.println( "Player health: " + player.getHealth() );
                    System.out.println( "Monster health: " + monster.getHealth() );
                }
                case 3 -> {
                    System.out.println("Exiting the application");
                    System.exit( 3 );
                }

                default -> throw new IllegalStateException( "Invalid option." + scan.nextInt() );
            }

        }

    }

}
