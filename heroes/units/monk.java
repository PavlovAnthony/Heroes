package OOP.heroes.units;

public class monk extends magician{
    
    public monk (String name, int side, point2D startPoint){
        super(side, 30, 30, 12, 7, 5,   startPoint, 10, -4, -4, name, "Stand");
        

    }
    @Override
    public String getInfo(){
        return "Монах " + name ;
    }
    
    
}
