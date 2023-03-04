package OOP.heroes.units;

public class spearman extends human{
    protected String name;

    public spearman (String name){
        super(100, 120, 4, 4);
        this.name = name; 
    }
    @Override
    public String getInfo(){
        return "Копейщик " + name;
    }
    
}