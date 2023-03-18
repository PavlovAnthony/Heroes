package OOP.heroes.units;

public class spearman extends human{
    protected String name;

    public spearman (String name, int side, point2D startPoint){
        super(side, 40, 40,  10, 7, 4,  startPoint, 3, 1, name, "Stand");
        this.name = name; 
    }
    @Override
    public String getInfo(){
        return "Копейщик " + name;
    }
    
    
}