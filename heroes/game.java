package OOP.heroes;

import java.util.ArrayList;
// import java.util.Comparator;
// import java.util.List;
// import java.util.Random;
import java.util.Scanner;

import OOP.heroes.units.commandList;
import OOP.heroes.units.human;
// import OOP.heroes.units.monk;
// import OOP.heroes.units.names;
// import OOP.heroes.units.outlaw;
// import OOP.heroes.units.peasant;
// import OOP.heroes.units.point2D;
// import OOP.heroes.units.sniper;
// import OOP.heroes.units.spearman;
// import OOP.heroes.units.wizard;
// import OOP.heroes.units.xbowman;

public class game {
    public static void main(String[] args) {
        
        ArrayList<human> red = new ArrayList<>();
        ArrayList<human> black = new ArrayList<>();
        ArrayList<human> priorityList = new ArrayList<>();
        // sniper.getAtt();
        Scanner user_input = new Scanner(System.in);
        System.out.println("Состав команды red:");
        commandList.fillCommand(red, 0, 4);
        commandList.sortCommand(red);
        printCommand(red);

        System.out.println();
        System.out.println("Состав команды black:");
        commandList.fillCommand(black, 4, 8);
        commandList.sortCommand(black);
        printCommand(black);

        System.out.println();
        System.out.println("Начальный список :");
        priorityList.addAll(black);
        priorityList.addAll(red);
        commandList.sortCommand(priorityList);
        printCommand(priorityList);
        String step ="";
        System.out.println();
        System.out.println("Игра началась");

        while (step.equals("")) {
            for (human human:priorityList){

                if(red.contains(human)) human.step(red, black);
                else human.step(black, red);
            }

            System.out.println();
            printCommand(priorityList);
            // priorityList.forEach(n -> System.out.println(n.getInfo()));
            step =user_input.nextLine();
            
        }


       
    }

    // вывод списка команды
    public static void printCommand(ArrayList<human> list) {

        list.forEach(n -> System.out.println(n.getInfo() + " " + n.getSpeed()+ " " + n.getHp()));

    }

}
