package OOP.heroes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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

        ArrayList<human> red = new ArrayList<>();
        ArrayList<human> black = new ArrayList<>();
        ArrayList<human> priorityList = new ArrayList<>();
        // sniper.getAtt();

        System.out.println("Состав команды red:");
        fillCommand(red, 0, 4);
        sortCommand(red);
        printCommand(red);

        System.out.println();
        System.out.println("Состав команды black:");
        fillCommand(black, 4, 8);
        sortCommand(black);
        printCommand(black);

        System.out.println();
        System.out.println("Очередность хода:");
        priorityList.addAll(black);
        priorityList.addAll(red);
        sortCommand(priorityList);
        printCommand(priorityList);

    }

    private static String getName() {
        return String.valueOf(names.values()[new Random().nextInt(names.values().length)]);
    }

    // заполнение команды
    public static void fillCommand(ArrayList<human> list, int sBound, int fBound) {
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(sBound, fBound)) {
                case 0:
                    list.add(new sniper(getName()));
                    break;
                case 1:
                    list.add(new outlaw(getName()));
                    break;
                case 2:
                    list.add(new peasant(getName()));
                    break;

                case 3:
                    list.add(new wizard(getName()));
                    break;
                case 4:
                    list.add(new monk(getName()));
                    break;
                case 5:
                    list.add(new spearman(getName()));
                    break;
                case 6:
                    list.add(new peasant(getName()));
                    break;

                case 7:
                    list.add(new xbowman(getName()));
                    break;

            }
        }

    }

    // сортировка команды
    public static void sortCommand(ArrayList<human> list) {
        list.sort(new Comparator<human>() {
            @Override
            public int compare(human o1, human o2) {
                if (o1.getSpeed() == o2.getSpeed())
                    return o1.getHp() - o2.getHp();
                return o2.getSpeed() - o1.getSpeed();

            }

        });

    }

    // вывод списка команды
    public static void printCommand(ArrayList<human> list) {

        list.forEach(n -> System.out.println(n.getInfo() + " " + n.getSpeed()));

    }

}
