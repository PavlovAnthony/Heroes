package OOP.heroes.units;

import java.util.ArrayList;

public abstract class  magician extends human {

   protected int magic;
    protected String name;
    public magician (int side, int hp, int maxHp, int att, int def, int speed, point2D startPoint, int magic, int maxDamage, int minDamage, String name, String state){
        super(side, hp, maxHp, att, def, speed, startPoint, maxDamage, minDamage, name, state);
        this.magic = magic;
         this.name = name; 
        this.state = state;
    }
    
    
    public int getAtt(){
        return super.att;
    }
    @Override
        public void step(ArrayList<human> team1, ArrayList<human> team2){

            if (state.equals("die")||(magic<=0)) return;
            human victim = findNearhero(team1);
            if ((victim.hp>=maxHp)||(victim.state=="die")) return;
            // if (victim.state=="die") return;
            System.out.println(getInfo() + " вылечил " + victim.getInfo());
            // float damage = (victim.def - att)>0 ? minDamage: (victim.def - att)<0 ? maxDamage : (minDamage+maxDamage)/2;
            victim.getDamage(minDamage);
            magic-=1;
            

            
        }
        protected human findNearhero(ArrayList<human> team){
            double minHp =Double.MAX_VALUE;
            int index =0;
            for (int i = 0; i < team.size(); i++) {

                if (minHp> team.get(i).hp-team.get(i).maxHp) {
                    index = i;
                    minHp = team.get(i).hp-team.get(i).maxHp;
                }
                
            }
    
            return team.get(index);
        }

        @Override
        public String toString() {
            return name +
                    " H:" + Math.round(hp) +
                    " D:" + def +
                    " A:" + att +
                    " Dmg:" + Math.round(Math.abs((minDamage+maxDamage)/2)) +
                    " Magic:" + magic + " " +
                    state;
        }

}