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
    static final int UNITS = 10;
    public static ArrayList<human> priorityList = new ArrayList<>();
    public static ArrayList<human> red = new ArrayList<>();
    public static ArrayList<human>  black = new ArrayList<>();
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        user_input.nextLine();
        // ArrayList<human> red = new ArrayList<>();
        // ArrayList<human> black = new ArrayList<>();
        // ArrayList<human> priorityList = new ArrayList<>();
        // sniper.getAtt();
        // Scanner user_input = new Scanner(System.in);
        System.out.println("Состав команды red:");
        commandList.fillCommand(red, 0, 4);
        // commandList.sortCommand(red);
        printCommand(red);

         System.out.println();
        System.out.println("Состав команды black:");
        commandList.fillCommand(black, 4, 8);
        // commandList.sortCommand(black);
        printCommand(black);

        // System.out.println();
        // System.out.println("Начальный список :");
        priorityList.addAll(black);
        priorityList.addAll(red);
        commandList.sortCommand(priorityList);
        // printCommand(priorityList);
        // String step ="";
        // System.out.println();
        // System.out.println("Игра началась");


        while (true){
            View.view();
            user_input.nextLine();
            for (human human: priorityList) {
                if (red.contains(human)) human.step(red, black);
                else human.step(black, red);
                if (checkFinish(red)||checkFinish(black)){
                View.view();
                System.out.println("конец");
                System.exit(0);
                }
                      
            }
        }

        
        // while (step.equals("")) {
        //     for (human human:priorityList){

        //         if(red.contains(human)) human.step(red, black);
        //         else human.step(black, red);
        //     }

        //     System.out.println();
        //     printCommand(priorityList);
        //     // priorityList.forEach(n -> System.out.println(n.getInfo()));
        //     step =user_input.nextLine();
            
        // }


       
    }
    public static boolean checkFinish (ArrayList<human> list){
        for (human human: list) {
            if(human.getState() != "die") {
                return false;
            }
        }
        return true;
    }


    // вывод списка команды
    public static void printCommand(ArrayList<human> list) {

        list.forEach(n -> System.out.println(n.getInfo() + " " +"Speed" +n.getSpeed()+ " Hp" + n.getHp()+" state"+ n.getState()+ " Side"+ n.getSide() ));

    }

}
