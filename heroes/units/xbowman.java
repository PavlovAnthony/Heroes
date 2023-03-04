package OOP.heroes.units;

public class xbowman extends archer{
    public xbowman (String name){
        super(100, 120, 4, 4,  5, 12, name);
    }
    @Override
    public String getInfo(){
        return "Арбалетчик " + name;
    }
    
}
