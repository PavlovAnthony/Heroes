package OOP.heroes;

import java.util.ArrayList;
import java.util.Random;

import OOP.heroes.units.human;
import OOP.heroes.units.monk;
import OOP.heroes.units.names;
import OOP.heroes.units.outlaw;
import OOP.heroes.units.peasant;
import OOP.heroes.units.sniper;
import OOP.heroes.units.spearman;
import OOP.heroes.units.wizard;
import OOP.heroes.units.xbowman;

public class game {
    public static void main(String[] args) {
        // sniper archer = new sniper("snipe");
        ArrayList<human> list =new ArrayList<>();


    //    sniper.getAtt();
    for (int i = 0; i < 10; i++) {
        switch (new Random().nextInt(6)) {
            case 0:
            list.add(new sniper(getName()));
            break;
            case 1:
            list.add(new xbowman(getName()));
            break;
            case 2:
            list.add(new monk(getName()));
            break;
            case 3:
            list.add(new outlaw(getName()));
            break;
            case 4:
            list.add(new peasant(getName()));
            break;
            case 5:
            list.add(new spearman(getName()));
            break;
            case 6:
            list.add(new wizard(getName()));
            break;
            
        }
      }
      System.out.println("Состав команды:");
 list.forEach(n -> System.out.println(n.getInfo()));
    }
    private static String getName(){
        return String.valueOf(names.values()[new Random().nextInt(names.values().length)]);
    }
}
