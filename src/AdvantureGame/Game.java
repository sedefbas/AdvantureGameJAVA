package AdvantureGame;

import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    public void start(){
        System.out.println("welcome to the game");
        System.out.print("enter a name: ");
        String playerGame=input.nextLine();
        Player player = new Player(playerGame);
        System.out.println("welcome! "+  player.getName());
        player.selectedChar();

        Loaction loaction=null;
        while(true){
            player.prinfİnfo();
            System.out.println();
            System.out.println("################ BÖLGELER #############");
            System.out.println();
            System.out.println("1-güvenli ev");
            System.out.println("2-magaza");
            System.out.print("mekan seç:  ");
            int selectedLoc = input.nextInt();
            switch (selectedLoc){
                case 1:
                    loaction = new SafeHouse(player);
                    break;
                case 2:
                    loaction= new ToolStore(player);
                    break;
                default:
                    loaction = new SafeHouse(player);
            }

            if(!loaction.onLocation()){
                System.out.println("GAME OVER");
                break;
            }



        }


    }
}
