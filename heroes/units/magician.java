package OOP.heroes.units;

public abstract class  magician extends human {

   protected int magic;
    protected String name;
    public magician (int hp, int att, int def, int speed, int magic, int maxDamage, int minDamage, String name){
        super(hp, att, def, speed, maxDamage, minDamage);
        this.magic = magic;
        this.name = name; 
    }
    
    
    public int getAtt(){
        return super.att;
    }
}