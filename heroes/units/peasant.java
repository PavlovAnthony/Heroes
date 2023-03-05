package OOP.heroes.units;

public class peasant extends human{
    protected String name;
    protected int delivery;
    public peasant (String name){
        super(1, 1, 1, 3, 1, 1);
        this.name = name; 
        this.delivery = 1;
    }
    @Override
    public String getInfo(){
        return "Крестьянин " + name;
    }
    
}
