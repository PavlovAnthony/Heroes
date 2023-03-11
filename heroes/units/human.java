package OOP.heroes.units;

import java.util.ArrayList;

public abstract class human implements gameinterface{
    
    protected int side, hp, maxHp,  att, def, speed, maxDamage,  minDamage;
    protected  String state;
        
    
    public point2D startPoint;
   


    public int getHp(){
        return hp;
    }


    
    public int getSpeed(){
        return speed;
    }

    public void getDamage(float damage){
        this.hp -=damage;

        if (hp<=0) {

            hp = 0;
            state = "die";
        }
        if (hp>maxHp) hp =maxHp;
    }

    public human(int side, int hp, int maxHp, int att, int def, int speed, point2D startPoint, int maxDamage, int minDamage, String state){
        
        this.side = side;
        this.hp = hp; //
        this.maxHp = maxHp;
        this.att = att;//
        this.def = def;
        this.speed = speed;
        this.maxDamage=maxDamage;
        this.minDamage=minDamage;
        this.startPoint=startPoint;
        this.state = "Stand";
    }
    
    @Override
    public String getInfo(){
        return "null";
    }

    @Override
    public void step(ArrayList<human> team1, ArrayList<human> team2) { }

    protected int findNearEnemie(ArrayList<human> team){
        double min =Double.MAX_VALUE;
        int index =0;
        for (int i = 0; i < team.size(); i++) {
            if (min> startPoint.getDistance(team.get(i).startPoint) && (team.get(i).getHp()>0))  {
                index = i;
                min = startPoint.getDistance(team.get(i).startPoint);
                
            
            }
            
            
        }

        return index;
    }
}
    



