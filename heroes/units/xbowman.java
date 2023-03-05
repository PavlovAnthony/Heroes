package OOP.heroes.units;

public class xbowman extends archer{
    public xbowman (String name){
        super(10, 6, 3, 4,  16, 3,2,  name);
    }
    @Override
    public String getInfo(){
        return "Арбалетчик " + name;
    }
    
}
