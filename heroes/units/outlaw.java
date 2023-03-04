package OOP.heroes.units;

public class outlaw extends human{
    protected String name;

    public outlaw (String name){
        super(100, 120, 4, 4);
        this.name = name; 
    }
    @Override
    public String getInfo(){
        return "Разбойник " + name;
    }
    
}
