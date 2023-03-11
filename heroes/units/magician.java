package OOP.heroes.units;

import java.util.ArrayList;

public abstract class  magician extends human {

   protected int magic;
    protected String name;
    public magician (int side, int hp, int maxHp, int att, int def, int speed, point2D startPoint, int magic, int maxDamage, int minDamage, String name, String state){
        super(side, hp, maxHp, att, def, speed, startPoint, maxDamage, minDamage, state);
        this.magic = magic;
        this.name = name; 
        this.state = state;
    }
    
    
    public int getAtt(){
        return super.att;
    }
    @Override
        public void step(ArrayList<human> team1, ArrayList<human> team2){

            if (state.equals("die")) return;
            human victim = findNearhero(team1);
            System.out.println(" волшебник " + name + " вылечил " + victim.getInfo());
            // float damage = (victim.def - att)>0 ? minDamage: (victim.def - att)<0 ? maxDamage : (minDamage+maxDamage)/2;
            victim.getDamage(minDamage);
            magic-=1;
            

            
        }
        protected human findNearhero(ArrayList<human> team){
            double minHp =Double.MAX_VALUE;
            int index =0;
            for (int i = 0; i < team.size(); i++) {

                if (minHp> team.get(i).maxHp-team.get(i).hp) {
                    index = 1;
                    minHp = team.get(i).maxHp-team.get(i).hp;
                }
                
            }
    
            return team.get(index);
        }



}