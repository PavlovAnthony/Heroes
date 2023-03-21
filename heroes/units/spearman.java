package OOP.heroes.units;



public class spearman extends Warrior{
    protected String name;

    public spearman (String name, int side, point2D startPoint){
        super(side, 40, 40,  10, 10, 4,  startPoint, 20, 10, name, "Stand");
        this.name = name; 
    }
    @Override
    public String getInfo(){
        return "Копейщик " + name;
    }
    
                
            
        }
