package OOP.heroes.units;

public class wizard extends magician{
    public wizard (String name, int side, point2D startPoint){
        super(side, 30, 30,  17, 12, 9,  startPoint, 10, -5, -5, name, "Stand");
    }
    @Override
    public String getInfo(){
        return "Волшебник " + name;
    }
    
}
