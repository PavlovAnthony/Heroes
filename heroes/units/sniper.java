package OOP.heroes.units;

public class sniper extends archer{
    
    public sniper (String name, int side, point2D startPoint){
        super(side, 15,15,  12, 10, 9,  startPoint, 32, 15, 12, name, "Stand");
        

    }
    @Override
    public String getInfo(){
        return "Снайпер " + name;
    }
    
}
