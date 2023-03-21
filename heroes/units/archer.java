package OOP.heroes.units;

import java.util.ArrayList;

public abstract class archer extends human {

    protected int shots;
    protected int maxShots;

    // protected String name;
    public archer(int side, int hp, int maxHp, int att, int def, int speed, point2D startPoint, int shots,
            int maxDamage, int minDamage, String name, String state, int maxShots) {
        super(side, hp, maxHp, att, def, speed, startPoint, maxDamage, minDamage, name, state);
        this.shots = shots;
        this.maxShots = maxShots;
        // this.name = name;
    }

    public int getAtt() {
        return super.att;
    }

    @Override
    public void step(ArrayList<human> team1, ArrayList<human> team2) {

        if (state.equals("die") || shots == 0)
            return;
        human victim = team2.get(findNearEnemie(team2));
        if (victim.state.equals("die"))
            return;
        float damage = (victim.def - att) > 0 ? minDamage
                : (victim.def - att) < 0 ? maxDamage : (minDamage + maxDamage) / 2;
        victim.getDamage(damage);
        System.out.println(getInfo() + " выстрелил в " + victim.getInfo());
        for (human human : team1) {
            if (human.getInfo().toString().split(" ")[0].equals("Крестьянин") && human.state.equals("Stand")) {
                human.state = "Busy";

                return;

            }

        }

        shots--;

        // return " " ;

    }

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + def +
                " A:" + att +
                " Dmg:" + Math.round(Math.abs((minDamage + maxDamage) / 2)) +
                " Shots:" + shots + " " +
                state;
    }
}
