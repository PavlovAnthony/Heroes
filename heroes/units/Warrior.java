package OOP.heroes.units;

import java.util.ArrayList;

public abstract class Warrior extends human {

    public Warrior(int side, int hp, int maxHp, int att, int def, int speed, point2D startPoint, int maxDamage,
            int minDamage, String name, String state) {
        super(side, hp, maxHp, att, def, speed, startPoint, maxDamage, minDamage, name, state);

        // this.name = name;
    }

    @Override
    public void step(ArrayList<human> team1, ArrayList<human> team2) {

        if (state.equals("die"))
            return;
        human victim = team2.get(findNearEnemie(team2));
        if (victim.state.equals("die"))
            return;
        if (victim.startPoint.getDistance(startPoint) < 2) {
            float damage = (victim.def - att) > 0 ? minDamage
                    : (victim.def - att) < 0 ? maxDamage : (minDamage + maxDamage) / 2;
            victim.getDamage(damage);
            System.out.println(getInfo() + " ударил " + victim.getInfo());
        } else 
                {
                    
             point2D tempVic =startPoint.getDirection(victim.startPoint);
            

             if (Math.abs(tempVic.x) < Math.abs(tempVic.y)) {
                
                if (startPoint.getDirection(victim.startPoint).y <0){
                    


                    startPoint.y++;
                }
                else {
                    
                    startPoint.y--;
                }
            }

            else {
           
            if (startPoint.getDirection(victim.startPoint).x>0)
                {
                    startPoint.x++;
                }
            else
             { 
                startPoint.x--;
            }
         }
        }

    }

}
