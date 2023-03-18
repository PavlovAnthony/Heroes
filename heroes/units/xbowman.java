package OOP.heroes.units;

public class xbowman extends archer{
    public xbowman (String name, int side, point2D startPoint){
        super(side, 35, 35, 9, 8, 4,   startPoint, 15, 3,2,  name, "Stand", 10);
    }
    @Override
    public String getInfo(){
        return "Арбалетчик " + name;
    }
    
}
