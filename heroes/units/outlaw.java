package OOP.heroes.units;

public class outlaw extends human{
    protected String name;

    public outlaw (String name, int side, point2D startPoint){
        super(side, 10, 10,  8, 3, 6,  startPoint, 4, 2, name, "Stand");
        this.name = name; 
    }
    @Override
    public String getInfo(){
        return "Разбойник " + name;
    }
    
}
