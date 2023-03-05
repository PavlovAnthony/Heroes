package OOP.heroes.units;

public class spearman extends human{
    protected String name;

    public spearman (String name){
        super(10, 4, 5, 4, 3, 1);
        this.name = name; 
    }
    @Override
    public String getInfo(){
        return "Копейщик " + name;
    }
    
}