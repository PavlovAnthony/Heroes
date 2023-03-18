package OOP.heroes.units;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class commandList {
  

   
    // заполнение команды
    public static void fillCommand(ArrayList<human> list, int sBound, int fBound) {
        
        for (int i = 1; i < 11; i++) {
             
            switch (new Random().nextInt(sBound, fBound)) {
                case 0:
                    
                    list.add(new sniper(getName(), 1, getStartPoint(1, i) ));
                    break;
                case 1:
                    
                    list.add(new outlaw(getName(), 1, getStartPoint(1, i)));
                    break;
                case 2:
                    list.add(new peasant(getName(), 1, getStartPoint(1, i)));
                    break;

                case 3:
                    list.add(new wizard(getName(), 1, getStartPoint(1, i)));
                    break;
                case 4:
                    list.add(new monk(getName(), 2, getStartPoint(10, i)));
                    break;
                case 5:
                    list.add(new spearman(getName(), 2, getStartPoint(10, i)));
                    break;
                case 6:
                    list.add(new peasant(getName(),2,  getStartPoint(10, i)));
                    break;

                case 7:
                    list.add(new xbowman(getName(),2,  getStartPoint(10, i)));
                    break;

            }
        }

    }
    private static String getName() {
        return String.valueOf(names.values()[new Random().nextInt(names.values().length)]);
    }
    private static point2D getStartPoint(int i, int j) {
        point2D startPoint = new point2D(i, j);
        startPoint.setY(i);
        startPoint.setX(j);
        return startPoint;
    }
    // сортировка команды
    public static void sortCommand(ArrayList<human> list) {
        list.sort(new Comparator<human>() {
            @Override
            public int compare(human o2, human o1) {
                if (o1.getSpeed() == o2.getSpeed())
                    return (int) o1.getHp() - o2.getHp();
                return (int) (o1.getSpeed() - o2.getSpeed());

            }

        });
    
}

}
