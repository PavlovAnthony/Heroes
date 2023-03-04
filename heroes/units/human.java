package OOP.heroes.units;

public abstract class human implements gameinterface{
    
    protected int hp, maxHP, att, def;
    public int getHp(){
        return hp;
    }


    public void setHp(){

        if (hp>0) {
            this.hp =hp;
        }
    }

    public human(int hp, int maxHP, int att, int def){
        this.hp = hp;
        this.maxHP = maxHP;
        this.att = att;
        this.def = def;
    }
    @Override
    public void step(){}
    @Override
    public String getInfo(){
        return "null";
    }
}
