package OOP.heroes.units;

public abstract class human implements gameinterface{
    
    protected int hp,  att, def, speed, maxDamage,  minDamage;
   


    public int getHp(){
        return hp;
    }


    public void setHp(){

        if (hp>0) {
            this.hp =hp;
        }
    }
    public int getSpeed(){
        return speed;
    }



    public human(int hp,  int att, int def, int speed, int maxDamage, int minDamage){
        this.hp = hp; //
        // this.maxHP = maxHP;
        this.att = att;//
        this.def = def;
        this.speed = speed;
        this.maxDamage=maxDamage;
        this.minDamage=minDamage;
    }
    @Override
    public void step(){}
    @Override
    public String getInfo(){
        return "null";
    }
}
