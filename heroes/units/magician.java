package OOP.heroes.units;

public abstract class  magician extends human {

    int healing;
    protected String name;
    public magician (int hp, int maxHP, int att, int def, int healing, String name){
        super(hp, maxHP, att, def);
        this.healing = healing;
        this.name = name; 
    }
    
    
    public int getAtt(){
        return super.att;
    }
}