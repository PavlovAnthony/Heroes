package OOP.heroes.units;

public class peasant extends human{
    protected String name;

    public peasant (String name){
        super(100, 120, 4, 4);
        this.name = name; 
    }
    @Override
    public String getInfo(){
        return "Крестьянин " + name;
    }
    
}
