package OOP.heroes.units;

public class xbowman extends archer{
    public xbowman (String name, int side, point2D startPoint){
        super(side, 10, 10, 6, 3, 4,   startPoint, 16, 3,2,  name, "Stand");
    }
    @Override
    public String getInfo(){
        return "Арбалетчик " + name;
    }
    
}
